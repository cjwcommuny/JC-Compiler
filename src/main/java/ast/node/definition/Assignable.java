package ast.node.definition;

import ast.node.Node;
import type.typetype.Type;

public interface Assignable {
    boolean beAssigned();
    Node getRightSide();
    String getVariableName();
    Type getLeftType();
    Type getRightType();
}
