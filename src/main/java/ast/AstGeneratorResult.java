package ast;

import ast.node.Node;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;
import java.util.List;

public class AstGeneratorResult {
    private List<Node> nodes = new LinkedList<>();
    private ParserRuleContext context;

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

    public AstGeneratorResult(Node node, ParserRuleContext context) {
        this(node);
        this.context = context;
    }

    public ParserRuleContext getContext() {
        return context;
    }
}
