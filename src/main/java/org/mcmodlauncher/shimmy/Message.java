package org.mcmodlauncher.shimmy;

public interface Message {
    Level level();
    Marker marker();
    String message();
    Object[] args();
}
