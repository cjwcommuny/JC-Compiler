package ast.node.value;

import ast.node.Node;
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
        return operation.visualInfo() + ": " + getType().visualInfo();
    }

    public Node getLeftSide() {
        return getChild(0);
    }

    public Node getRightSide() {
        return getChild(1);
    }
}
