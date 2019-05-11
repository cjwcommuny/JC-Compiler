package ast.node.value;

import ast.node.definition.DefinitionNode;
import ast.node.value.ValueNode;
import operation.Operation;
import sun.tools.jstat.Operator;
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
