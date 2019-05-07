package ast.node;

public class FunctionCallNode extends ValueNode {
    public FunctionCallNode(Node reference, String type) {
        this.reference = reference;
        this.type = type;
    }
}
