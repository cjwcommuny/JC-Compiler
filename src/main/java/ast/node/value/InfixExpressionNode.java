package ast.node.value;

import operation.Operation;
import type.typetype.Type;

public class InfixExpressionNode extends ValueNode {
    private Operation operation;

    public InfixExpressionNode(Operation operation, Type type) {
        super(type);
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }

    @Override
    protected String visualInfo() {
        return "InfixExpression: " + operation;
    }

}
