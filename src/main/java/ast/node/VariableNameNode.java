package ast.node;

public class VariableNameNode extends ValueNode {
    private String name;

    public VariableNameNode(String name, Node reference, String type) {
        this.name = name;
        this.reference = reference;
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "VARIABLE: " + name;
    }

    public Node getReference() {
        return reference;
    }
}
