package ast.node;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import type.typetype.FunctionType;
import type.typetype.Type;

public class FunctionCallNode extends Node implements HasType {
    private Type type;

    @Override
    public Type getType() {
        return type;
    }

    public FunctionCallNode(Type type) {
        this.type = type;
    }
}
