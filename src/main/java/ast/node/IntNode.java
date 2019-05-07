package ast.node;

public class IntNode extends ValueNode {
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
