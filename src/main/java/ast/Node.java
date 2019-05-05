package ast;

import java.util.LinkedList;
import java.util.List;

public abstract class Node {
    private List<Node> children = new LinkedList<>();

    public void addChild(Node node) {
        children.add(node);
    }
}
