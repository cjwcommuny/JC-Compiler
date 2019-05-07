package ast.node;

public class IdentifierNode extends ValueNode {
    private String name;

    public String getName() {
        return name;
    }

    public IdentifierNode(String name, Node reference, String type) {
        this.name = name;
        this.reference = reference;
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "Identifier: " + name;
    }

}
