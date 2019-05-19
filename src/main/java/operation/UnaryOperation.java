package operation;

public class UnaryOperation extends Operation {
    public static Operation NEGATIVE = new UnaryOperation("-");
    public static Operation NOT = new UnaryOperation("!");

    public UnaryOperation(String operation) {
        super(operation);
    }
}
