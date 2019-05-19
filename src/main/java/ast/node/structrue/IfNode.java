package ast.node.structrue;

import ast.node.Node;
import ast.node.StatementListNode;

/**
 * child: rValue
 * child: statementListNode
 * */
public class IfNode extends Node {
    public Node getCondition() {
        return getChild(0);
    }

    public StatementListNode getStatementListNode() {
        return (StatementListNode) getChild(1);
    }
}
