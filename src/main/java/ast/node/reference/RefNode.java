package ast.node.reference;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.value.ValueNode;
import type.typetype.Type;

public abstract class RefNode extends ValueNode {
    protected DefinitionNode reference;

    public Type getType() {
        return type;
    }

    public DefinitionNode getReference() {
        return reference;
    }

    public RefNode(Type type, DefinitionNode reference) {
        super(type);
        this.reference = reference;
    }
}
