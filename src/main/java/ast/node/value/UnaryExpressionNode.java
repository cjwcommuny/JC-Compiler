package ast.node.value;

import ast.node.definition.DefinitionNode;
import ast.node.value.ValueNode;
import type.typetype.Type;

public class UnaryExpressionNode extends ValueNode {
    private String operation;

    public UnaryExpressionNode(String operation, Type type) {
        super(type);
        this.operation = operation;
    }

    @Override
    protected String visualInfo() {
        return "UnaryExpression: " + operation;
    }
}
