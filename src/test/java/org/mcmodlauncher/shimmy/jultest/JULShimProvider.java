package org.mcmodlauncher.shimmy.jultest;

import org.mcmodlauncher.shimmy.LogShimProvider;
import org.mcmodlauncher.shimmy.Logger;
import org.mcmodlauncher.shimmy.Message;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.stream.Collectors;

public class JULShimProvider implements LogShimProvider {
    @Override
    public String name() {
        return "jul";
    }

    @Override
    public Logger getLogger(final String name) {
        final var logManager = LogManager.getLogManager();
        final var jullogger = logManager.getLogger(name);
        return new Logger(m->log(jullogger, m));
    }

    static void log(java.util.logging.Logger logger, Message message) {
        var level = Level.parse(message.level().name());
        if (!logger.isLoggable(level)) return;
        logger.log(level, message.message(), Arrays.stream(message.args()).map(o->o instanceof Supplier<?> s ? s.get().toString() : o.toString()).toArray());
    }
}
