package ast.node;

import type.Type;

/**
 * child 1: array
 * child 2: index
 * */
public class ArrayIndexNode extends ValueNode {
    public ArrayIndexNode(Node reference, Type type) {
        this.reference = reference;
        this.type = type;
    }
}
