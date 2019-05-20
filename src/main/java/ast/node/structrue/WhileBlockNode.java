package ast.node.structrue;

import ast.node.Node;

public class WhileBlockNode extends Node {
    public Node getConditionNode() {
        return getChild(0);
    }

    public Node getBlockCode() {
        return getChild(1);
    }
}
