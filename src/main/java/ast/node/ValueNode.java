package ast.node;

public class ValueNode extends Node {
    //TODO: delete??
    protected Node reference;
    protected String type;

    public Node getReference() {
        return reference;
    }

    public String getType() {
        return type;
    }
}
