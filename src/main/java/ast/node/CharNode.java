package ast.node;

public class CharNode extends ValueNode {
    private char value;

    @Override
    protected String visualInfo() {
        return "CHAR: " + value;
    }

    public CharNode(char value) {
        this.value = value;
    }
}
