package ast.node.structrue;

import ast.node.Node;
import ast.node.StatementListNode;

/**
 * child: statementListNode
 * */
public class ElseNode extends Node {
    public StatementListNode getStatementListNode() {
        return (StatementListNode) getChild(0);
    }
}
