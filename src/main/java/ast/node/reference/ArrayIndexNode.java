package ast.node.reference;

import ast.node.HasType;
import ast.node.Node;
import ast.node.definition.DefinitionNode;
import type.typetype.IntType;
import type.typetype.Type;

/**
 * child 1: array
 * child 2: index
 * */
public class ArrayIndexNode extends Node implements HasType  {
    private Type type;

    public ArrayIndexNode(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return type;
    }

    public Node getArrayNode() {
        return getChild(0);
    }

    public Node getIndexNode() {
        return getChild(1);
    }
}
