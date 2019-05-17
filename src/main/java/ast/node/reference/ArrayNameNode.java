package ast.node.reference;

import ast.node.definition.DefinitionNode;
import type.typetype.ArrayType;
import type.typetype.Type;

public class ArrayNameNode extends RefNode {
    private String name;

    public ArrayNameNode(String name, DefinitionNode reference, ArrayType type) {
        super(type, reference);
        this.name = name;
    }

    @Override
    protected String visualInfo() {
        return "ARRAY: " + name;
    }

    @Override
    public String getName() {
        return name;
    }
}
