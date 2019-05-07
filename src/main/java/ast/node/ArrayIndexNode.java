package ast.node;

/**
 * child 1: array
 * child 2: index
 * */
public class ArrayIndexNode extends ValueNode {
    public ArrayIndexNode(Node reference, String type) {
        this.reference = reference;
        this.type = type;
    }
}
