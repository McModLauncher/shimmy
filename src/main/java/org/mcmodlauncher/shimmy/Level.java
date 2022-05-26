package org.mcmodlauncher.shimmy;

public record Level(String name, int level) {
    public static final Level TRACE = new Level("TRACE", 100);
    public static final Level DEBUG = new Level("DEBUG", 300);
    public static final Level INFO = new Level("INFO", 500);
    public static final Level WARN = new Level("WARN", 800);
    public static final Level ERROR = new Level("ERROR", 900);
    public static final Level FATAL = new Level("ERROR", 1000);
}
