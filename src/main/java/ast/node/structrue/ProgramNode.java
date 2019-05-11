package ast.node.structrue;

import ast.node.Node;

/**
 * child 1...: namespace
 * */
public class ProgramNode extends Node {
    @Override
    protected String visualInfo() {
        return "Program";
    }
}
