package error.exception;

public class SymbolNotResolvedException extends ParseException {
    public SymbolNotResolvedException(int[] position, String symbol) {
        super(formatter.format(messageHeadFormat, position[0], position[1]) + "symbol not resolved: " + symbol);
    }
}
