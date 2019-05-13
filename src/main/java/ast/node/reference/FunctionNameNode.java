package ast.node.reference;

import ast.node.definition.DefinitionNode;
import type.typetype.FunctionType;
import type.typetype.Type;

public class FunctionNameNode extends RefNode {
    private String name;

    @Override
    protected String visualInfo() {
        return "FUNCTION: " + name;
    }

    public FunctionNameNode(String name, DefinitionNode reference, FunctionType type) {
        super(type, reference);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
