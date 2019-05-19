package operation;

public class InfixOperation extends Operation {
    public static Operation ADD = new InfixOperation("+");
    public static Operation SUB = new InfixOperation("-");
    public static Operation MUL = new InfixOperation("*");
    public static Operation DIV = new InfixOperation("/");
    public static Operation GREATER = new InfixOperation(">");
    public static Operation LESS = new InfixOperation("<");
    public static Operation GREATER_EQUAL = new InfixOperation(">=");
    public static Operation LESS_EQUAL = new InfixOperation("<=");
    public static Operation EQUAL = new InfixOperation("==");

    public static Operation AND = new InfixOperation("&&");
    public static Operation OR = new InfixOperation("||");

    public InfixOperation(String str) {
        super(str);
    }
}
