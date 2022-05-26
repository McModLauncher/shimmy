package org.mcmodlauncher.shimmy;

public record SimpleMessage(Level level, Marker marker, String message, Object... args) implements Message {

}
