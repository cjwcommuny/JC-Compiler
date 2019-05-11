package ast.node;

import type.typetype.Type;

public class FunctionNameNode extends ValueNode {
    private String name;

    public Node getReference() {
        return reference;
    }

    @Override
    protected String visualInfo() {
        return "FUNCTION: " + name;
    }

    public FunctionNameNode(String name, Node reference, Type type) {
        this.name = name;
        this.reference = reference;
        this.type = type;
    }
}
