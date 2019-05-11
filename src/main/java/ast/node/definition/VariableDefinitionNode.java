package ast.node.definition;

import ast.node.Node;
import ast.node.reference.VariableNameNode;
import type.typetype.Type;

/**
 * child: variableNameNode
 * (child: rightSide)? if child_count == 1, then use default value
 * */
public class VariableDefinitionNode extends DefinitionNode {

    public VariableDefinitionNode(Type type) {
        super(type);
    }

    public String getVariableName() {
        return ((VariableNameNode)getChild(0)).getName();
    }
}
