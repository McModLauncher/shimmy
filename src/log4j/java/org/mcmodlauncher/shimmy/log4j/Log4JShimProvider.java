package org.mcmodlauncher.shimmy.log4j;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.mcmodlauncher.shimmy.LogShimProvider;
import org.mcmodlauncher.shimmy.Logger;
import org.mcmodlauncher.shimmy.Message;

import java.util.Arrays;
import java.util.function.Supplier;

public class Log4JShimProvider implements LogShimProvider {
    @Override
    public String name() {
        return "log4j";
    }

    @Override
    public Logger getLogger(final String name) {
        final var lm = LogManager.getLogger(name);
        return new Logger(m->log(m, lm));
    }

    private static void log(Message m, org.apache.logging.log4j.Logger logger) {
        Level l = Level.forName(m.level().name(), m.level().level());
        Marker mark = MarkerManager.getMarker(m.marker().name());
        if (logger.isEnabled(l, mark)) {
            logger.log(l, mark, m.message(), Arrays.stream(m.args()).map(o->o instanceof Supplier<?> s ? s.get().toString() : o.toString()).toArray());
        }
    }
}
