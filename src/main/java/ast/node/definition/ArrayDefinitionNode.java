package ast.node.definition;

import ast.node.LiteralNode;
import ast.node.Node;
import ast.node.reference.ArrayNameNode;
import symbol.Scope;
import type.typetype.Type;
import type.typetype.TypeBuilder;

/**
 * child: NameNode
 * child: (int_literal)?
 * child: (rValue)?
 * */
public class ArrayDefinitionNode extends VariableDefinitionNode implements Assignable {
    public ArrayDefinitionNode(Type arrayType, Scope parentScope) {
        super(arrayType, parentScope);
    }

    public Node getArrayNameNode() {
        return getChild(0);
    }

    public boolean hasLengthNode() {
        boolean hasNotLengthNode = getChildrenCount() == 1 || !(getChild(1) instanceof LiteralNode);
        return !hasNotLengthNode;
    }

    public Node getArrayInitNode() {
        Node child = getChild(getChildrenCount() - 1);
        if (child instanceof ArrayNameNode || child instanceof LiteralNode) {
            return null;
        }
        return child;
    }

    @Override
    public boolean beAssigned() {
        return getArrayInitNode() != null;
    }
}
