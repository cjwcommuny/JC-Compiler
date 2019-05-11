package ast.node.definition;

import ast.node.Node;
import type.typetype.Type;

public class DefinitionNode extends Node {
    protected Type type;

    public Type getType() {
        return type;
    }

    public DefinitionNode(Type type) {
        this.type = type;
    }
}
