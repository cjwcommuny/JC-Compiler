package ast.node;

public class UnaryExpressionNode extends ValueNode {
    private String operation;

    public UnaryExpressionNode(String operation, Node reference, String type) {
        this.operation = operation;
        this.reference = reference;
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "UnaryExpression: " + operation;
    }
}
