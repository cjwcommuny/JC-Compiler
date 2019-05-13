package ast.node;

public class BreakNode extends Node implements LoopControlNode {
    private Node loopBlockNode;

    public BreakNode(Node loopBlockNode) {
        this.loopBlockNode = loopBlockNode;
    }

    @Override
    public Node getCorrespondingLoopBlockNode() {
        return loopBlockNode;
    }
}
