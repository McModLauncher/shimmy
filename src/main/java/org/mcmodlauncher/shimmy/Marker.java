package org.mcmodlauncher.shimmy;

public record Marker(String name) {
    public static final Marker NONE = new Marker("NONE");
}
