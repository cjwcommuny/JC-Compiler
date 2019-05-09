package ast.node;

import type.Type;

public class TypeNode extends Node {
    private Type type;

    public TypeNode(Type type) {
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "TYPE: " + type.getClass().getSimpleName();
    }

    public Type getType() {
        return type;
    }
}
