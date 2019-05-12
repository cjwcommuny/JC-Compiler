package ast.node.structrue;

import ast.node.Node;
import symbol.Scope;

/**
 * child 1...: namespace
 * */
public class ProgramNode extends Node {
    Scope thisScope;

    public ProgramNode(Scope thisScope) {
        this.thisScope = thisScope;
    }

    @Override
    protected String visualInfo() {
        return "Program";
    }
}
