package ast.node;

import java.util.LinkedList;
import java.util.List;

public abstract class Node {
    protected List<Node> children = new LinkedList<>();

    public final void addChild(Node node) {
        children.add(node);
    }

    public final void printTree() {
        printSubTree("", true);
    }

    private void printSubTree(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + visualInfo());
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).printSubTree(prefix + (isTail ? "    " : "│   "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1)
                    .printSubTree(prefix + (isTail ?"    " : "│   "), true);
        }
    }

    protected String visualInfo() {
        //TODO
        return this.getClass().getSimpleName();
    }

    public final void addChildren(List<? extends Node> nodeList) {
        children.addAll(nodeList);
    }

    public final List<Node> getChildren() {
        return children;
    }
}
