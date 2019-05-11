package ast.node.definition;

import ast.node.Node;
import type.typetype.Type;
import type.typetype.TypeBuilder;

public class ArrayDefinitionNode extends DefinitionNode {
    public ArrayDefinitionNode(Type componentType, int dimension) {
        super(TypeBuilder.generateArrayType(componentType, dimension));
    }
}
