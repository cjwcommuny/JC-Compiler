package ast.node.definition;

import ast.node.structrue.HasScope;
import symbol.Scope;
import type.typetype.NamespaceType;
import type.typetype.TypeBuilder;

/**
 * child 1...: codeContent
 * */
public class NamespaceNode extends DefinitionNode implements HasScope {
    private Scope thisScope;

    public String getName() {
        return ((NamespaceType) type).generateDescriptor();
    }

    public NamespaceNode(String name, Scope thisScope, Scope parentScope) {
        super(TypeBuilder.generateNamespaceType(name), parentScope);
        this.thisScope = thisScope;
    }

    @Override
    public Scope getThisScope() {
        return thisScope;
    }

    @Override
    protected String visualInfo() {
        return "Namespace: " + type.visualInfo();
    }

    public void setThisScope(Scope thisScope) {
        this.thisScope = thisScope;
    }
}
