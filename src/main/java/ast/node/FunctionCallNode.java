package ast.node;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.reference.FunctionNameNode;
import type.typetype.FunctionType;
import type.typetype.Type;

/**
 * child: functionNameNode
 * child: argumentListNode
 * */
public class FunctionCallNode extends Node implements HasType {
    private Type type;

    @Override
    public Type getType() {
        return type;
    }

    public FunctionCallNode(Type type) {
        this.type = type;
    }

    @Override
    protected String visualInfo() {
        return "FunctionCall: " + type.visualInfo();
    }

    public String getFunctionName() {
        return ((FunctionNameNode) getChild(0)).getName();
    }
}
