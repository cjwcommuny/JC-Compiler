package ast.node;

public class ContinueNode extends Node implements LoopControlNode {
    private Node loopBlockNode;

    public ContinueNode(Node loopBlockNode) {
        this.loopBlockNode = loopBlockNode;
    }

    @Override
    public Node getCorrespondingLoopBlockNode() {
        return loopBlockNode;
    }
}
