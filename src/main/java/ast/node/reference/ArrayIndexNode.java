package ast.node.reference;

import ast.node.definition.DefinitionNode;
import type.typetype.IntType;
import type.typetype.Type;

/**
 * child 1: array
 * child 2: index
 * */
public class ArrayIndexNode extends RefNode {
    public ArrayIndexNode(DefinitionNode reference, IntType type) {
        super(type, reference);
    }
}
