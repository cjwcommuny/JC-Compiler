package ast.node;

public class DoubleNode extends ValueNode {
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
