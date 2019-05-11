package ast.node.definition;

import ast.node.structrue.HasScope;
import symbol.Scope;
import type.typetype.ObjectType;
import type.typetype.Type;

public class StructureDefinitionNode extends DefinitionNode implements HasScope {
    private Scope scope;

    public StructureDefinitionNode(ObjectType type, Scope thisScope, Scope parentScope) {
        super(type, parentScope);
        this.scope = thisScope;
    }

    @Override
    public Scope getScope() {
        return scope;
    }

    @Override
    protected String visualInfo() {
        return "Struct: " + type.visualInfo();
    }
}
