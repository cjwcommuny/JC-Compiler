package ast;

public class VariableNameNode extends Node {
    private String name;

    @Override
    protected String visualInfo() {
        return "VARIABLE: " + name;
    }

    public VariableNameNode(String name) {
        this.name = name;
    }
}
