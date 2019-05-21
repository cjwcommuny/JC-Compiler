package ast.node.definition;

import ast.node.HasType;
import ast.node.LiteralNode;
import ast.node.Node;
import ast.node.reference.VariableNameNode;
import ast.node.value.ValueNode;
import symbol.Scope;
import type.typetype.Type;

import java.util.List;

/**
 * child: variableNameNode
 * (child: rightSide)? if child_count == 1, then use default value, not allowed to use function
 * */
public class VariableDefinitionNode extends DefinitionNode implements HasType, Assignable {
    private int localIndex;

    public void setLocalIndex(int localIndex) {
        this.localIndex = localIndex;
    }

    VariableDefinitionNode(Type type, Scope parentScope) {
        super(type, parentScope);
        Node parentNode = parentScope.getCorrespondingNode();
    }

    public String getVariableName() {
        return ((VariableNameNode)getChild(0)).getName();
    }

    public Object getLiteralValue() {
        if (getChildrenCount() == 1) {
            //default value;
            return getType().generateDefaultValue();
        } else {
            Node valueNode = getRightSide();
            if (valueNode instanceof LiteralNode) {
                return ((LiteralNode) valueNode).getValue();
            } else {
                return getType().generateDefaultValue();
            }
        }
    }

    public int getLocalIndex() {
        return localIndex;
    }

    public boolean beAssigned() {
        return getChildrenCount() != 1;
    }

    public Node getRightSide() {
        return getChild(1);
    }

    public VariableNameNode getVariableNameNode() {
        return (VariableNameNode) getChild(0);
    }
}
