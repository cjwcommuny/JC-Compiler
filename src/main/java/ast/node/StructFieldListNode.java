package ast.node;

import ast.node.definition.VariableDefinitionNode;

import java.util.List;

/**
 * (child: VariableDefinitionNode)*
 * */
public class StructFieldListNode extends Node {
    public List<Node> getVariableDefinitionNodes() {
        return getChildren();
    }
}
