package symbol;

import ast.AstGenerator;
import ast.VisitLater;
import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.definition.DefinitionNodeBuilder;
import ast.node.definition.DefinitionType;
import ast.node.definition.StructureDefinitionNode;
import common.CommonInfrastructure;
import error.exception.NameDuplicateException;
import error.exception.SymbolNotResolvedException;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import parser.*;
import type.typetype.BaseType;
import type.typetype.ObjectType;
import type.typetype.Type;
import type.typetype.TypeBuilder;

public class SymbolTableGenerator extends rulesBaseVisitor<SymbolTableResult> {
    //traverse the parse tree to generateBaseOrObjectType the symbol table
    private ScopeHandler scopeHandler;
    private AstGenerator astGenerator;

    public SymbolTableGenerator(ScopeHandler scopeHandler, AstGenerator astGenerator) {
        this.scopeHandler = scopeHandler;
        this.astGenerator = astGenerator;
    }

    private void visitNow(List<VisitLater> visitLaters, Map<String, DefinitionNode> table) {
        for (VisitLater visitLater: visitLaters) {
            SymbolTableResult StructVisitResult = visitLater.visit();
            String name = StructVisitResult.getTokenText();
            StructureDefinitionNode structNode = (StructureDefinitionNode) table.get(name); // not null
            VisitLater visitFieldLater = StructVisitResult.getVisitLater();
            SymbolTableResult fieldVisitResult = visitFieldLater.visit();
            Scope structInnerScope =  new Scope(fieldVisitResult.getTable(),
                    scopeHandler.getCurrentScope(),
                    name,
                    true);
            structNode.setThisScope(structInnerScope);
        }
    }

    @Override
    public SymbolTableResult visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        Map<String, DefinitionNode> table = new HashMap<>();
        List<VisitLater> visitLaters = new LinkedList<>();
        for (rulesParser.CodeContentContext context: ctx.codeContent()) {
            SymbolTableResult result = visit(context);
            String name = result.getTokenText();
            if (table.containsKey(name)) {
                int[] errorPosition = astGenerator.getTokenPosition(ctx, result.getToken());
                throw new SymbolNotResolvedException(errorPosition, name);
            }
            List<String> restrictNames = scopeHandler.getRestrictNames();
            String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(name, restrictNames);
            DefinitionType definitionType = result.getDefinitionType();
            Scope parentScope = scopeHandler.getCurrentScope();
            DefinitionNode node;
            if (definitionType == DefinitionType.STRUCT) {
                visitLaters.add(new VisitLater(context, this));
                node = DefinitionNodeBuilder.generateStructureDefinitionNode(fullRestrictName,
                        (ObjectType) result.getType(),
                        null,
                        parentScope);
            } else if (definitionType == DefinitionType.VARIABLE) {
                node = DefinitionNodeBuilder.generateVariableDefinitionNode(fullRestrictName,
                        result.getType(),
                        parentScope);
            } else {
                //function
                node = DefinitionNodeBuilder.generateFunctionDefinitionNode(fullRestrictName,
                        result.getType(),
                        parentScope);
            }

            table.put(name, node);
        }
        visitNow(visitLaters, table);
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitProgram(rulesParser.ProgramContext ctx) {
        Map<String, DefinitionNode> table = new HashMap<>();
        for (rulesParser.NamespaceDefinitionContext context: ctx.namespaceDefinition()) {
            String name = context.IDENTIFIER().getText();
            if (table.containsKey(name)) {
                int[] errorPosition = astGenerator.getTokenPosition(ctx, context.IDENTIFIER().getSymbol());
                throw new SymbolNotResolvedException(errorPosition, name);
            }
            table.put(name,
                    DefinitionNodeBuilder.generateNamespaceNode(name,
                            null,
                            scopeHandler.getCurrentScope()));
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitCodeContent(rulesParser.CodeContentContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public SymbolTableResult visitVariableDefinition(rulesParser.VariableDefinitionContext ctx) {
        SymbolTableResult result = visit(ctx.getChild(0));
        result.setDefinitionType(DefinitionType.VARIABLE);
        return result;
    }

    @Override
    public SymbolTableResult visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx) {
        return visit(ctx.variableDeclaration());
    }

    @Override
    public SymbolTableResult visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public SymbolTableResult visitOrdinaryVariableDeclaration(rulesParser.OrdinaryVariableDeclarationContext ctx) {
        Token typeToken = ctx.IDENTIFIER(0).getSymbol();
        Token variableNameToken = ctx.IDENTIFIER(1).getSymbol();
        List<Token> tokens = new LinkedList<>();
        tokens.add(typeToken);
        tokens.add(variableNameToken);
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String simpleTypeName = typeToken.getText();
        Type type;
        if (BaseType.isBaseType(simpleTypeName)) {
            type = TypeBuilder.generateBaseType(simpleTypeName);
        } else {
            DefinitionNode typeNode = scopeHandler.getNode(simpleTypeName);
            if (typeNode == null) {
                int[] errorPosition = astGenerator.getTokenPosition(ctx, typeToken);
                throw new SymbolNotResolvedException(errorPosition, simpleTypeName);
            }
            type = typeNode.getType();
        }
        return new SymbolTableResult(type, tokens, ctx);
    }


    /**
     * only add parameter declarations
     * */
    @Override
    public SymbolTableResult visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        Token token = ctx.IDENTIFIER(1).getSymbol();
        SymbolTableResult parameterVisitResult = visit(ctx.functionParameterDefinition());
        List<Type> parametersType = parameterVisitResult.getTypes();
        String returnTypeStr = ctx.IDENTIFIER(0).getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        Type type = TypeBuilder.generateFunctionType(parametersType, TypeBuilder.generateBaseOrObjectType(returnTypeStr, restrictNames));
        return new SymbolTableResult(parameterVisitResult.getTable(), token, DefinitionType.FUNCTION, ctx, type);
    }

    @Override
    public SymbolTableResult visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        Map<String, DefinitionNode> table = new HashMap<>();
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            SymbolTableResult result = visit(context);
            Type type = result.getType();
            String variableName = result.getTokenText(1);
            if (table.containsKey(variableName)) {
                int[] errorPosition = astGenerator.getTokenPosition(ctx, result.getToken());
                throw new NameDuplicateException(errorPosition, variableName);
            }
            List<String> restrictNames = scopeHandler.getRestrictNames();
            String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(variableName, restrictNames);
            table.put(variableName, DefinitionNodeBuilder.generateVariableDefinitionNode(fullRestrictName, type, scopeHandler.getCurrentScope()));
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        String structName = ctx.IDENTIFIER().getText();
        scopeHandler.enterScope(new VisitLater(null, null), structName, true);
//        Map<String, DefinitionNode> table = visit(ctx.structFieldStatementList()).getTable();
        scopeHandler.exitScope();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        Type type = TypeBuilder.generateObjectType(structName, restrictNames);
        SymbolTableResult result = new SymbolTableResult(ctx.IDENTIFIER().getSymbol(),
                DefinitionType.STRUCT,
                ctx,
                type);
        result.setVisitLater(new VisitLater(ctx.structFieldStatementList(), this));
        return result;
    }

    @Override
    public SymbolTableResult visitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx) {
        return visit(ctx.parameterList());
    }

    @Override
    public SymbolTableResult visitParameterList(rulesParser.ParameterListContext ctx) {
        List<Type> types = new LinkedList<>();
        Map<String, DefinitionNode> parameterSymbolTable = new HashMap<>();
        for (rulesParser.VariableDeclarationContext context: ctx.variableDeclaration()) {
            SymbolTableResult visitResult = visit(context);
            Type type = visitResult.getType();
            types.add(type);
        }
        return new SymbolTableResult(parameterSymbolTable, types);
    }
}
