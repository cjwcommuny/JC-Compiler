package ast.node.definition;

import ast.node.ParameterListNode;
import ast.node.StatementListNode;
import ast.node.definition.DefinitionNode;
import ast.node.reference.FunctionNameNode;
import ast.node.structrue.HasScope;
import symbol.Scope;
import type.typetype.FunctionType;
import type.typetype.ObjectType;
import type.typetype.Type;

import java.util.List;

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

    public Type getReturnType() {
        FunctionType functionType = (FunctionType) getType();
        return functionType.getReturnType();
    }

    public String getFunctionName() {
        return ((FunctionNameNode) getChild(0)).getName();
    }

    public ParameterListNode getParameterListNode() {
        return (ParameterListNode) getChild(1);
    }

    public List<Type> getLocalTypeList() {
        //TODO
    }

    public StatementListNode getStatementListNode() {
        return (StatementListNode) getChild(2);
    }
}
