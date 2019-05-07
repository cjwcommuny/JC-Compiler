package ast.node;

public class ArrayNameNode extends ValueNode {
    private String name;

    public ArrayNameNode(String name, Node reference, String type) {
        this.name = name;
        this.reference = reference;
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "ARRAY: " + name;
    }
}
