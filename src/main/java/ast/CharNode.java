package ast;

public class CharNode extends Node {
    private char value;

    @Override
    protected String visualInfo() {
        return "CHAR: " + value;
    }

    public CharNode(char value) {
        this.value = value;
    }

    public CharNode() {
    }
}
