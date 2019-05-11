package error.exception;

import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ParseException extends ParseCancellationException {

    public ParseException(String message) {
        super(message);
    }
}
