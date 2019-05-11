package ast.node.definition;

import ast.node.Node;
import symbol.Scope;
import type.typetype.Type;
import type.typetype.TypeBuilder;

public class ArrayDefinitionNode extends DefinitionNode {
    public ArrayDefinitionNode(Type componentType, int dimension, Scope parentScope) {
        super(TypeBuilder.generateArrayType(componentType, dimension), parentScope);
    }
}
