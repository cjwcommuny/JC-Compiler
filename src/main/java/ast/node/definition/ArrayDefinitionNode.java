package ast.node.definition;

import ast.node.Node;
import symbol.Scope;
import type.typetype.Type;
import type.typetype.TypeBuilder;

/**
 * child: NameNode
 * child: (rValue)?
 * */
public class ArrayDefinitionNode extends VariableDefinitionNode implements Assignable {
    public ArrayDefinitionNode(Type arrayType, Scope parentScope) {
        super(arrayType, parentScope);
    }

}
