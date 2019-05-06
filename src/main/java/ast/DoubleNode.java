package ast;

public class DoubleNode extends Node {
    private double value;

    public DoubleNode() {
    }

    public DoubleNode(double value) {
        this.value = value;
    }

    @Override
    protected String visualInfo() {
        return "DOUBLE: " + value;
    }
}
