package ast;

public class IdentifierNode extends Node {
    private String name;

    public String getName() {
        return name;
    }

    public IdentifierNode(String name) {
        this.name = name;
    }
}
