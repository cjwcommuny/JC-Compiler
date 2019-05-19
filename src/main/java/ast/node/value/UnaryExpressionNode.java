package ast.node.value;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.value.ValueNode;
import operation.Operation;
import type.typetype.Type;

public class UnaryExpressionNode extends ValueNode {
    private Operation operation;

    public UnaryExpressionNode(Operation operation, Type type) {
        super(type);
        this.operation = operation;
    }

    @Override
    protected String visualInfo() {
        return operation.visualInfo() + ": " + getType().visualInfo();
    }

    public Node getValueNode() {
        return getChild(0);
    }

    public Operation getOperation() {
        return operation;
    }
}
