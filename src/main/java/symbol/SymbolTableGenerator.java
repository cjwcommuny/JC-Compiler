package symbol;

import ast.AstGenerator;
import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.definition.DefinitionNodeBuilder;
import ast.node.definition.DefinitionType;
import common.CommonInfrastructure;
import error.exception.SymbolNotResolvedException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import parser.*;
import type.typetype.FunctionType;

public class SymbolTableGenerator extends rulesBaseVisitor<SymbolTableResult> {
    //traverse the parse tree to generateBaseOrObjectType the symbol table

    private ScopeHandler scopeHandler;
    private AstGenerator astGenerator;

    public SymbolTableGenerator(ScopeHandler scopeHandler, AstGenerator astGenerator) {
        this.scopeHandler = scopeHandler;
        this.astGenerator = astGenerator;
    }

    @Override
    public SymbolTableResult visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        Map<String, DefinitionNode> table = new HashMap<>();
        for (rulesParser.CodeContentContext context: ctx.codeContent()) {
            SymbolTableResult result = visit(context);
            String name = result.getName();
            if (table.containsKey(name)) {
                int[] errorPosition = astGenerator.getTokenPosition(ctx, result.getToken());
                throw new SymbolNotResolvedException(errorPosition, name);
            }
            List<String> restrictNames = scopeHandler.getRestrictNames();
            String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(name, restrictNames);
            table.put(name,
                    DefinitionNodeBuilder.generateNodeFromType(result.getDefinitionType(),
                        fullRestrictName,
                        scopeHandler.getCurrentScope()));
        }
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
        SymbolTableResult result = visit(ctx.getChild(0));
        return new SymbolTableResult(result.getToken(), result.getContext(), result.getDefinitionType());
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
        Token token = ctx.IDENTIFIER(1).getSymbol();
        return new SymbolTableResult(token, ctx);
    }


    /**
     * only add parameter declarations
     * */
    @Override
    public SymbolTableResult visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        Token token = ctx.IDENTIFIER(1).getSymbol();
        return new SymbolTableResult(token, ctx, DefinitionType.FUNCTION);
    }

    @Override
    public SymbolTableResult visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        Map<String, DefinitionNode> table = new HashMap<>();
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            SymbolTableResult result = visit(context);
            String name = result.getName();
            if (table.containsKey(name)) {
                int[] errorPosition = astGenerator.getTokenPosition(ctx, result.getToken());
                throw new SymbolNotResolvedException(errorPosition, name);
            }
            List<String> restrictNames = scopeHandler.getRestrictNames();
            String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(name, restrictNames);
            table.put(name, DefinitionNodeBuilder.generateVariableDefinitionNode(fullRestrictName, null, scopeHandler.getCurrentScope()));
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        String structName = ctx.IDENTIFIER().getText();
        scopeHandler.enterScope(null, structName, true);
        Map<String, DefinitionNode> table = visit(ctx.structFieldStatementList()).getTable();
        scopeHandler.exitScope();
        return new SymbolTableResult(table, ctx.IDENTIFIER().getSymbol(), ctx);
    }

}
