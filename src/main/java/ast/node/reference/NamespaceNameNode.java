package ast.node.reference;

import ast.node.definition.DefinitionNode;
import type.typetype.NamespaceType;
import type.typetype.Type;

public class NamespaceNameNode extends RefNode {
    private String name;

    public NamespaceNameNode(String name, NamespaceType type, DefinitionNode reference) {
        super(type, reference);
        this.name = name;
    }
}
