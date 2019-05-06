package ast;

public class UnaryExpressionNode extends Node {
    private String operation;

    public UnaryExpressionNode(String operation) {
        this.operation = operation;
    }

    @Override
    protected String visualInfo() {
        return "UnaryExpression: " + operation;
    }
}
