package ast.node;

import ast.node.reference.FunctionNameNode;
import type.typetype.Type;

/**
 * child: functionNameNode
 * child: argumentListNode
 * */
public class FunctionCallNode extends Node implements HasType {
    private Type returnType;

    @Override
    public Type getType() {
        return returnType;
    }

    public FunctionCallNode(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    protected String visualInfo() {
        return "FunctionCall: " + returnType.visualInfo();
    }

    public String getFunctionName() {
        return ((FunctionNameNode) getChild(0)).getName();
    }

    public ArgumentListNode getArguments() {
        return ((ArgumentListNode) getChild(1));
    }

    public Type getFunctionType() {
        return ((FunctionNameNode) getChild(0)).getType();
    }
}
