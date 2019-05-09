package ast.node;

import java.util.LinkedList;
import java.util.List;

public class ParameterDefinitionNode extends Node {
    @Override
    protected String visualInfo() {
        return "ParameterDefinition";
    }

    public List<String> getParameterTypes() {
        List<String> result = new LinkedList<>();
        for (Node child: children) {
            TypeNode typeNode = (TypeNode) child.getChildren().get(0);
            result.add(typeNode.getTypeName());
        }
        return result;
    }
}
