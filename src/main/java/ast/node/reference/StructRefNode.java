package ast.node.reference;

import ast.node.definition.DefinitionNode;
import ast.node.definition.VariableDefinitionNode;
import type.typetype.Type;

public class StructRefNode extends RefNode {
    public StructRefNode(Type type, DefinitionNode reference) {
        super(type, reference);
    }

    @Override
    protected String visualInfo() {
        VariableDefinitionNode variableDefinitionNode = (VariableDefinitionNode) reference;
        return variableDefinitionNode.getParentScope().getScopeName()
                + "." + variableDefinitionNode.getVariableName() + ": " + reference.getType().visualInfo();
    }
}
