package ast.node;

import type.typetype.ArrayType;
import type.typetype.Type;

import java.util.List;

public class ArrayInitNode extends Node implements HasType {
    private boolean isNewArray;
    private int len;
    private Type type;

    @Override
    public Type getType() {
        return type;
    }

    public ArrayInitNode(int len, Type type) {
        this.len = len;
        this.type = type;
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

    @Override
    protected String visualInfo() {
        if (isNewArray) {
            return "new " + ((ArrayType) type).getComponentType().visualInfo() + "[" + len + "]";
        } else {
            return "{...}";
        }
    }

    public Type getComponentType() {
        return ((ArrayType) type).getComponentType();
    }

    public List<Node> getElements() {
        return getChildren();
    }
}
