package ast;

public class FunctionNameNode extends Node {
    private String name;

    @Override
    protected String visualInfo() {
        return "FUNCTION: " + name;
    }

    public FunctionNameNode(String name) {
        this.name = name;
    }
}
