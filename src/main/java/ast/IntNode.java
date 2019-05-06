package ast;

public class IntNode extends Node {
    private int value;

    public IntNode() {
    }

    public IntNode(int value) {
        this.value = value;
    }

    @Override
    protected String visualInfo() {
        return "INT: " + value;
    }
}
