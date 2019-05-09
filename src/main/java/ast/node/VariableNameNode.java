package ast.node;

import type.Type;

public class VariableNameNode extends ValueNode {
    private Type type;
    private String name;

    public VariableNameNode(String name, Node reference, Type type) {
        this.name = name;
        this.reference = reference;
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return type.visualInfo() + ": " + name;
    }

    public Node getReference() {
        return reference;
    }

    @Override
    public Type getType() {
        return type;
    }
}
