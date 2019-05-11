package ast.node;

import ast.node.definition.VariableDefinitionNode;
import type.typetype.Type;

import java.util.LinkedList;
import java.util.List;

public class ParameterListNode extends Node {
    public List<Type> getTypes() {
        List<Type> types = new LinkedList<>();
        for (Node parameterNode: getChildren()) {
            types.add(((VariableDefinitionNode) parameterNode).getType());
        }
        return types;
    }
}
