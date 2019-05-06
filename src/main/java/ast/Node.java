package ast;

import java.util.LinkedList;
import java.util.List;

public abstract class Node {
    private List<Node> children = new LinkedList<>();

    public void addChild(Node node) {
        children.add(node);
    }

    public void printTree() {
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
        return this.toString();
    }
}
