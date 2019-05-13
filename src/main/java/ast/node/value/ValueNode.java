package ast.node.value;

import ast.node.HasType;
import ast.node.Node;
import type.typetype.Type;

public abstract class ValueNode extends Node implements HasType {
    protected Type type;

    @Override
    public Type getType() {
        return type;
    }

    public ValueNode(Type type) {
        this.type = type;
    }
}
