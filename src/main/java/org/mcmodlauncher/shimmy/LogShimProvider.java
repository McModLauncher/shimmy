package org.mcmodlauncher.shimmy;

public interface LogShimProvider {
    String name();

    Logger getLogger(final String name);
}
