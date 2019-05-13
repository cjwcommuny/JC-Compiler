package ast.node;

import ast.node.definition.DefinitionNode;
import ast.node.value.ValueNode;
import type.typetype.Type;

public class LiteralNode<T> extends ValueNode {
//    private Type type;
    private T value;

    @Override
    protected String visualInfo() {
        return type.visualInfo() + ": " + value;
    }

    public T getValue() {
        return value;
    }

    public LiteralNode(Type type, T value) {
        super(type);
        this.value = value;
    }
}
