package ast.node;

import type.typetype.Type;

/**
 * child 1: return type
 * child 2: function name
 * child 3 ...: parameter
 * child 4: function body
 * */
public class FunctionDefinitionNode extends ValueNode {
    @Override
    protected String visualInfo() {
        return "FunctionDefinition";
    }

    public FunctionDefinitionNode(Node reference, Type type) {
        this.reference = reference;
        this.type = type;
    }
}
