package error.exception;

public class SyntaxErrorException extends ParseException {
    public SyntaxErrorException(int[] position, String message) {
        super(formatter.format(messageHeadFormat, position[0], position[1]) + "syntax error: " + message);
    }
}
