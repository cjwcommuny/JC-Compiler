package ast.node.definition;

import ast.node.Node;
import ast.node.structrue.HasScope;
import symbol.Scope;
import type.typetype.NamespaceType;
import type.typetype.Type;
import type.typetype.TypeBuilder;

/**
 * child 1...: codeContent
 * */
public class NamespaceNode extends DefinitionNode implements HasScope {
    private Scope scope;

    public String getName() {
        return ((NamespaceType) type).generateFieldDescriptor();
    }

    public NamespaceNode(String name, Scope thisScope, Scope parentScope) {
        super(TypeBuilder.generateNamespaceType(name), parentScope);
        this.scope = thisScope;
    }

    @Override
    public Scope getScope() {
        return scope;
    }

    @Override
    protected String visualInfo() {
        return "Namespace: " + type.visualInfo();
    }
}
