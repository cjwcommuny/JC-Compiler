package ast.node;

/**
 * child 1...: codeContent
 * */
public class NamespaceNode extends Node {
    private String name;

    public String getName() {
        return name;
    }

    public NamespaceNode(String name) {
        this.name = name;
    }

    @Override
    protected String visualInfo() {
        return "Namespace: " + name;
    }
}
