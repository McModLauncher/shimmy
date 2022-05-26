package org.mcmodlauncher.shimmy;

public record Level(String name, int level) {
    public static final Level OFF = new Level("OFF", 0);
    public static final Level FATAL = new Level("FATAL", 100);
    public static final Level ERROR = new Level("ERROR", 200);
    public static final Level WARN = new Level("WARN", 300);
    public static final Level INFO = new Level("INFO", 400);
    public static final Level DEBUG = new Level("DEBUG", 500);
    public static final Level TRACE = new Level("TRACE", 600);
    public static final Level ALL = new Level("ALL", Integer.MAX_VALUE);
}
