package ast;

public class ArrayNameNode extends Node {
    private String name;

    @Override
    protected String visualInfo() {
        return "ARRAY: " + name;
    }

    public ArrayNameNode(String name) {
        this.name = name;
    }
}
