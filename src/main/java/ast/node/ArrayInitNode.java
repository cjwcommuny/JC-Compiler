package ast.node;

import type.typetype.Type;

public class ArrayInitNode extends Node implements HasType {
    private boolean isNewArray;
    private int len;
    private Type type;

    @Override
    public Type getType() {
        return type;
    }

    public ArrayInitNode(Type type) {
    }

    public ArrayInitNode(boolean isNewArray, int len, Type type) {
        this.isNewArray = isNewArray;
        this.len = len;
        this.type = type;
    }

    public boolean isNewArray() {
        return isNewArray;
    }

    public int getLen() {
        return len;
    }
}
