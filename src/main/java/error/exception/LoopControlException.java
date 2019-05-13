package error.exception;

public class LoopControlException extends SyntaxErrorException {
    public LoopControlException(int[] position) {
        super(position, "break/continue statement wrong place");
    }
}
