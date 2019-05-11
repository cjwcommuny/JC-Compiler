package error.exception;

import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.Formatter;

public class ParseException extends ParseCancellationException {
    protected static String messageHeadFormat = "line %d:%d: ";
    protected static Formatter formatter = new Formatter();

    public ParseException(String message) {
        super(message);
    }
}
