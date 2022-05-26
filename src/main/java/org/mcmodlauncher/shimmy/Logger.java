package org.mcmodlauncher.shimmy;

import java.util.function.Consumer;
import java.util.function.Supplier;

public final class Logger {
    private final Consumer<Message> messageConsumer;

    public Logger(final Consumer<Message> messageConsumer) {
        this.messageConsumer = messageConsumer;
    }


    public void log(final Message message) {
        messageConsumer.accept(message);
    }

    public void log(final Level level, final String message, final Object... args) {
        log(new SimpleMessage(level, Marker.NONE, message, args));
    }

    public void log(final Level level, final Marker marker, final String message, final Object... args) {
        log(new SimpleMessage(level, marker, message, args));
    }

    public void log(final Level level, final String message, final String arg) {
        log(new SimpleMessage(level, Marker.NONE, message, arg));
    }

    public void log(final Level level, final Marker marker,  final String message, final String arg) {
        log(new SimpleMessage(level, marker, message, arg));
    }

    @SafeVarargs
    public final void log(final Level level, final String message, final Supplier<Object>... args) {
        log(new SimpleMessage(level, Marker.NONE, message, (Object[]) args));
    }
    @SafeVarargs
    public final void log(final Level level, final Marker marker, final String message, final Supplier<Object>... args) {
        log(new SimpleMessage(level, marker, message, (Object[]) args));
    }
}
