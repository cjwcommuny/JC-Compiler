package ast.node.reference;

import ast.node.definition.DefinitionNode;
import ast.node.reference.RefNode;
import type.typetype.Type;

public class VariableNameNode extends RefNode {
    private String name;

    public VariableNameNode(String name, DefinitionNode reference, Type type) {
        super(type, reference);
        this.name = name;
    }

    @Override
    protected String visualInfo() {
        return type.visualInfo() + ": " + name;
    }

    @Override
    public Type getType() {
        return type;
    }
}
