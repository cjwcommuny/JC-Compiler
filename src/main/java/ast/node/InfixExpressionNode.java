package ast.node;

import type.Type;

public class InfixExpressionNode extends ValueNode {
    private String operation;

    public InfixExpressionNode(String operation, Node reference, Type type) {
        this.operation = operation;
        this.reference = reference;
        this.type = type;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    protected String visualInfo() {
        return "InfixExpression: " + operation;
    }

}
