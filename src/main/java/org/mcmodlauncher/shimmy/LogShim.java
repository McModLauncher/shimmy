package org.mcmodlauncher.shimmy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ServiceLoader;

class LogShim {
    private final LogShimProvider service;

    LogShim(String name) {
        var serviceLoader = ServiceLoader.load(getClass().getModule().getLayer(), LogShimProvider.class);
        var foundservice = serviceLoader.stream().filter(lsp->name.equals(lsp.get().name())).findFirst();
        service = foundservice.orElseThrow(()->new IllegalStateException("Unable to find shim provider named "+name)).get();
    }

    LogShimProvider provider() {
        return service;
    }

    static LogShim get(final String name) {
        synchronized (shims) {
            return shims.computeIfAbsent(name, LogShim::new);
        }
    }

    private static final Map<String, LogShim> shims = Collections.synchronizedMap(new HashMap<>());
}
