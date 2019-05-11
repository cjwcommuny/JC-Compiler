package ast.node.definition;

import ast.node.Node;
import type.typetype.NamespaceType;
import type.typetype.Type;
import type.typetype.TypeBuilder;

/**
 * child 1...: codeContent
 * */
public class NamespaceNode extends DefinitionNode {

    public String getName() {
        return ((NamespaceType) type).generateFieldDescriptor();
    }

    public NamespaceNode(String name) {
        super(TypeBuilder.generateNamespaceType(name));
    }

    @Override
    protected String visualInfo() {
        return "Namespace: " + getName();
    }
}
