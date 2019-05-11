package ast.node.definition;

import ast.node.Node;
import symbol.Scope;
import type.typetype.Type;

public class DefinitionNode extends Node {
    private Scope parentScope;
    protected Type type;

    public Type getType() {
        return type;
    }

    public DefinitionNode(Type type, Scope parentScope) {
        this.type = type;
        this.parentScope = parentScope;
    }

    public Scope getParentScope() {
        return parentScope;
    }
}
