package ast.node.reference;

import ast.node.definition.DefinitionNode;
import type.typetype.Type;

public class StructNameNode extends RefNode {
    private String name;

    public StructNameNode(String name, Type type, DefinitionNode reference) {
        super(type, reference);
        this.name = name;
    }
}
