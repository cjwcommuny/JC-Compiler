package ast.node;

import type.typetype.Type;

public class LiteralNode<T> extends Node {
    private Type type;
    private T value;

    @Override
    protected String visualInfo() {
        return type.getClass().getSimpleName() + ": " + value;
    }

    public T getValue() {
        return value;
    }

    public LiteralNode(Type type, T value) {
        this.type = type;
        this.value = value;
    }
}