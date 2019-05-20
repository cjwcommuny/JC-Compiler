package ast.node.structrue;

import ast.node.Node;
import ast.node.StatementListNode;

/**
 * child: initConditionNode
 * child: terminateConditionNode
 * child: stepConditionNode
 * child: blockBodyNode
 * */
public class ForBlockNode extends Node {
    public Node getInitConditionNode() {
        return getChild(0);
    }

    public Node getTerminateConditionNode() {
        return getChild(1);
    }

    public Node getStepConditionNode() {
        return getChild(2);
    }

    public Node getBlockBodyNode() {
        return getChild(3);
    }
}
