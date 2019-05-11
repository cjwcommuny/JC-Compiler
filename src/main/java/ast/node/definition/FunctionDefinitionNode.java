package ast.node.definition;

import ast.node.definition.DefinitionNode;
import type.typetype.FunctionType;
import type.typetype.Type;

/**
 * child: functionName
 * child: parametersNode
 * child: statementListNode: function body
 * */
public class FunctionDefinitionNode extends DefinitionNode {

    @Override
    protected String visualInfo() {

        return this.type.visualInfo();
    }

    public FunctionDefinitionNode(Type type) {
        super(type);
    }

}
