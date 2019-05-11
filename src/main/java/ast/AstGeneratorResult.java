package ast;

import ast.node.Node;

import java.util.LinkedList;
import java.util.List;

public class AstGeneratorResult {
    private List<Node> nodes = new LinkedList<>();

    public void addChild(Node node) {
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public AstGeneratorResult(Node node) {
        nodes.add(node);
    }

    public Node getNode() {
        return nodes.get(0);
    }
}
