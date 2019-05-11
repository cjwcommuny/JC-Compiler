package ast.node.reference;

import ast.node.definition.DefinitionNode;
import type.typetype.*;

public class RefNodeBuilder {
    public static RefNode generateProperReNode(String name, DefinitionNode defNode) {
        Type type = defNode.getType();
        if (type instanceof ArrayType) {
            return new ArrayNameNode(name, defNode, (ArrayType) type);
        } else if (type instanceof NamespaceType) {
            return new NamespaceNameNode(name, (NamespaceType) type, defNode);
        } else if (type instanceof FunctionType) {
            return new FunctionNameNode(name, defNode, (FunctionType) type);
        } else {
            //base type or object type
            return new VariableNameNode(name, defNode, type);
        }
    }
}
