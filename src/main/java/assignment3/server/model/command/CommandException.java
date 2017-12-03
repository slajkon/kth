package assignment3.server.model.command;

/**
 * Thrown when the expected message could not be received.
 */
public class CommandException extends RuntimeException {

    public CommandException(String msg) {
        super(msg);
    }

    public CommandException(Throwable rootCause) {
        super(rootCause);
    }

    public CommandException(String msg, Throwable rootCause) {
        super(msg, rootCause);
    }
}
