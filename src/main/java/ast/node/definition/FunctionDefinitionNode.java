package ast.node.definition;

import ast.node.definition.DefinitionNode;
import type.typetype.Type;

/**
 * child 1: return type
 * child 2: function name
 * child 3 ...: parameter
 * child 4: function body
 * */
public class FunctionDefinitionNode extends DefinitionNode {
    @Override
    protected String visualInfo() {
        return "FunctionDefinition";
    }

    public FunctionDefinitionNode(Type type) {
        super(type);
    }
}
