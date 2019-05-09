package ast.node;

import type.Type;

public class UnaryExpressionNode extends ValueNode {
    private String operation;

    public UnaryExpressionNode(String operation, Node reference, Type type) {
        this.operation = operation;
        this.reference = reference;
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "UnaryExpression: " + operation;
    }
}
