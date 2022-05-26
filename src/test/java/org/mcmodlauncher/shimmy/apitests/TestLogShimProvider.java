package org.mcmodlauncher.shimmy.apitests;

import org.mcmodlauncher.shimmy.LogShimProvider;
import org.mcmodlauncher.shimmy.Logger;
import org.mcmodlauncher.shimmy.Message;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestLogShimProvider implements LogShimProvider {
    @Override
    public String name() {
        return "test";
    }

    @Override
    public Logger getLogger(final String name) {
        return new Logger(this::log);
    }

    public void log(final Message message) {
        var args = Arrays.stream(message.args()).map(o->o instanceof Supplier<?> s ? s.get().toString() : o.toString()).collect(Collectors.joining(","));
        System.out.println(message.level() + ": "+ message.message() + ": "+ args);
    }
}
