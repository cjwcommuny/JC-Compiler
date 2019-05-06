package ast;

public class BoolNode extends Node {
    private boolean value;

    public BoolNode() {
    }

    @Override
    protected String visualInfo() {
        return "BOOL: " + value;
    }

    public BoolNode(boolean value) {
        this.value = value;
    }
}
