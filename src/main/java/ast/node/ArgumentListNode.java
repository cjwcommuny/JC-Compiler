package ast.node;

import type.typetype.Type;

import java.util.LinkedList;
import java.util.List;

public class ArgumentListNode extends Node {
    public List<Type> getTypes() {
        List<Type> result = new LinkedList<>();
        for (Node child: getChildren()) {
            result.add(((HasType) child).getType());
        }
        return result;
    }
}
