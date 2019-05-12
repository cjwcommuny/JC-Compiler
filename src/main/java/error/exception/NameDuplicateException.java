package error.exception;

public class NameDuplicateException extends ParseException {
    public NameDuplicateException(int[] position, String symbol) {
        super(formatter.format(messageHeadFormat, position[0], position[1]) + "symbol duplication: " + symbol);
    }
}
