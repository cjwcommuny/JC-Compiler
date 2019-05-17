package ast.node;

import ast.node.Node;

/**
 * child: lValue
 * child: rValue
 * */
public class AssignmentNode extends Node {
    @Override
    protected String visualInfo() {
        return "Assignment";
    }

    public Node getLeftNode() {
        return getChild(0);
    }

    public Node getRightNode() {
        return getChild(1);
    }
}
