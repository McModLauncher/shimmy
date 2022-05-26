package org.mcmodlauncher.shimmy;

import java.util.HashMap;
import java.util.Map;

public final class LogFactory {
    private final LogShimProvider shim;
    public LogFactory(final String shimName) {
        shim = LogShim.get(shimName).provider();
    }
    public Logger getLogger(final String logName) {
        return shim.getLogger(logName);
    }

    public Logger getLogger() {
        return shim.getLogger(null);
    }

    public Logger getLogger(final Class<?> className) {
        return getLogger(className.getName());
    }
}