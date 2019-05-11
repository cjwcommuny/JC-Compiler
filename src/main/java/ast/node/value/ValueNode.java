package ast.node.value;

import ast.node.Node;
import type.typetype.Type;

public abstract class ValueNode extends Node {
    protected Type type;

    public Type getType() {
        return type;
    }

    public ValueNode(Type type) {
        this.type = type;
    }
}
