package ast.node.value;

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
        return "UnaryExpression: " + operation;
    }
}
