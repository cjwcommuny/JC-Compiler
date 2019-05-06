package ast;

public class StringNode extends Node {
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
