package ast.node.definition;

import ast.node.LiteralNode;
import ast.node.Node;
import ast.node.reference.VariableNameNode;
import ast.node.value.ValueNode;
import symbol.Scope;
import type.typetype.Type;

/**
 * child: variableNameNode
 * (child: rightSide)? if child_count == 1, then use default value, not allowed to use function
 * */
public class VariableDefinitionNode extends DefinitionNode {

    VariableDefinitionNode(Type type, Scope parentScope) {
        super(type, parentScope);
    }

    public String getVariableName() {
        return ((VariableNameNode)getChild(0)).getName();
    }

    public Object getValue() {
        if (getChildrenCount() == 1) {
            //default value;
            return getType().generateDefaultValue();
        } else {
            return ((LiteralNode) getChild(1)).getValue();
        }
    }

    public int getLocalIndex() {

    }

    public boolean beAssigned() {
        return getChildrenCount() != 1;
    }

    public Node getRightSide() {
        return getChild(1);
    }
}
