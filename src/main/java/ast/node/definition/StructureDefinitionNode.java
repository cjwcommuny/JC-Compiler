package ast.node.definition;

import ast.node.StructFieldListNode;
import ast.node.structrue.HasScope;
import symbol.Scope;
import type.typetype.ObjectType;

/**
 * child: StructFieldListNode
 * */
public class StructureDefinitionNode extends DefinitionNode implements HasScope {
    public void setThisScope(Scope thisScope) {
        this.thisScope = thisScope;
    }

    private Scope thisScope;

    StructureDefinitionNode(ObjectType type, Scope thisScope, Scope parentScope) {
        super(type, parentScope);
        this.thisScope = thisScope;
    }

    @Override
    public Scope getThisScope() {
        return thisScope;
    }

    @Override
    protected String visualInfo() {
        return "Struct: " + type.visualInfo();
    }

    public StructFieldListNode getStructFieldListNode() {
        return (StructFieldListNode) getChild(0);
    }

    public String getStructName() {
        return thisScope.getScopeName();
    }
}
