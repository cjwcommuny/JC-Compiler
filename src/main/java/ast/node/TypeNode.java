package ast.node;

public class TypeNode extends Node {
    private String name;

    public TypeNode(String name) {
        this.name = name;
    }

    @Override
    protected String visualInfo() {
        return "TYPE: " + name;
    }

    public String getTypeName() {
        return name;
    }
}
