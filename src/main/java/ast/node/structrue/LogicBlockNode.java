package ast.node.structrue;

import ast.node.Node;

import java.util.LinkedList;
import java.util.List;

/**
 * child: if-block
 * (child: else if-block)*
 * (child: else block)?
 * */
public class LogicBlockNode extends Node {
    public IfNode getIfNode() {
        return (IfNode) getChild(0);
    }

    public List<ElseIfNode> getElseIfNodes() {
        List<ElseIfNode> elseIfNodes = new LinkedList<>();
        for (Node node: getChildren()) {
            if (node instanceof ElseIfNode) {
                elseIfNodes.add((ElseIfNode) node);
            }
        }
        return elseIfNodes;
    }

    public ElseNode getElseNode() {
        Node lastNode = getChild(getChildrenCount() - 1);
        if (lastNode instanceof ElseNode) {
            return (ElseNode) lastNode;
        } else {
            return null;
        }
    }
}
