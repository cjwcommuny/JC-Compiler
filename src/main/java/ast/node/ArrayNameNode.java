package ast.node;

import type.typetype.Type;

public class ArrayNameNode extends ValueNode {
    private String name;

    public ArrayNameNode(String name, Node reference, Type type) {
        this.name = name;
        this.reference = reference;
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "ARRAY: " + name;
    }
}
