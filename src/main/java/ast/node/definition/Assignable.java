package ast.node.definition;

import ast.node.Node;

public interface Assignable {
    boolean beAssigned();
    Node getRightSide();
    String getVariableName();
}
