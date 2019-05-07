package ast.node;

public class StringNode extends ValueNode {
    private String value;

    @Override
    protected String visualInfo() {
        return super.visualInfo();
    }

    public StringNode() {
    }

    public StringNode(String value) {
        this.value = value;
    }
}
