package ast.node;

public class ValueNode extends Node {
    protected Node reference;
    protected String type;

    public Node getReference() {
        return reference;
    }

    public String getType() {
        return type;
    }
}
