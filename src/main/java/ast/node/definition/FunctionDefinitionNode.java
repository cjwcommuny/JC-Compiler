package ast.node.definition;

import ast.node.definition.DefinitionNode;
import ast.node.structrue.HasScope;
import symbol.Scope;
import type.typetype.FunctionType;
import type.typetype.ObjectType;
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

    FunctionDefinitionNode(Type type, Scope parentScope) {
        super(type, parentScope);
    }
}
