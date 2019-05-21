package ast.node.reference;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.definition.VariableDefinitionNode;
import type.typetype.Type;

import java.sql.Ref;

/**
 * child: left side node
 * child: identifier
 * */
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

    public Node getLeftSideNode() {
        return getChild(0);
    }

    public Type getType() {
        return reference.getType();
    }

    @Override
    public String getName() {
        VariableDefinitionNode variableDefinitionNode = (VariableDefinitionNode) reference;
        return variableDefinitionNode.getParentScope().getScopeName();
    }

    public String getFieldName() {
        return ((VariableDefinitionNode) reference).getVariableName();
    }
}
