package ast.node;

import type.Type;

public class FunctionCallNode extends ValueNode {
    public FunctionCallNode(Node reference, Type type) {
        this.reference = reference;
        this.type = type;
    }
}
