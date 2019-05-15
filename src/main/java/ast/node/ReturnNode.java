package ast.node;

import type.typetype.Type;

/**
 *
 * */
public class ReturnNode extends Node {
    public boolean isReturnSomething() {
        return getChildrenCount() != 0;
    }

    public Node getReturnValueNode() {
        return getChild(0);
    }

    public Type getType() {
        return ((HasType) getChild(0)).getType();
    }
}
