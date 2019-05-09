package symbol;

import common.CommonInfrastructure;
import org.antlr.v4.runtime.ParserRuleContext;
import symbol.SymbolTableResult;

import java.util.HashMap;
import java.util.Map;
import parser.*;

public class SymbolTableGenerator extends rulesBaseVisitor<SymbolTableResult> {
    //traverse the parse tree to generateBaseOrObjectType the symbol table

    @Override
    public SymbolTableResult visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        Map<String, ParserRuleContext> table = new HashMap<>();
        for (rulesParser.CodeContentContext context: ctx.codeContent()) {
            SymbolTableResult result = visit(context);
            String name = result.getName();
            ParserRuleContext correspondingContext = result.getContext();
            if (table.containsKey(name)) {
                //TODO: name duplication error
            }
            table.put(name, correspondingContext);
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitProgram(rulesParser.ProgramContext ctx) {
        Map<String, ParserRuleContext> table = new HashMap<>();
        for (rulesParser.NamespaceDefinitionContext context: ctx.namespaceDefinition()) {
            String name = context.IDENTIFIER().getText();
            if (table.containsKey(name)) {
                //TODO: name duplication error
            }
            table.put(name, context);
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitCodeContent(rulesParser.CodeContentContext ctx) {
        SymbolTableResult result = visit(ctx.getChild(0));
        return new SymbolTableResult(result.getName(), result.getContext());
    }

    @Override
    public SymbolTableResult visitVariableDefinition(rulesParser.VariableDefinitionContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public SymbolTableResult visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx) {
        String name = ctx.IDENTIFIER(1).getText();
        return new SymbolTableResult(name, ctx);
    }

    @Override
    public SymbolTableResult visitOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx) {
        String name = ctx.IDENTIFIER(1).getText();
        return new SymbolTableResult(name, ctx);
    }

    @Override
    public SymbolTableResult visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        String name = ctx.IDENTIFIER(1).getText();
        return new SymbolTableResult(name, ctx);
    }

    @Override
    public SymbolTableResult visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx) {
        String name = ctx.IDENTIFIER(1).getText();
        return new SymbolTableResult(name, ctx);
    }

    @Override
    public SymbolTableResult visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        String functionName = ctx.IDENTIFIER(1).getText();
        Map<String, ParserRuleContext> parameterResult = visit(ctx.functionParameterDefinition()).getTable();
        Map<String, ParserRuleContext> functionBodyResult = visit(ctx.functionBody()).getTable();
        boolean nameConflict = CommonInfrastructure.hasCommonKey(parameterResult, functionBodyResult);
        if (nameConflict) {
            //TODO: name conflict error
        }
        parameterResult.putAll(functionBodyResult);
        return new SymbolTableResult(parameterResult, functionName, ctx);
    }

    @Override
    public SymbolTableResult visitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx) {
        return visit(ctx.parameterList());
    }

    @Override
    public SymbolTableResult visitParameterList(rulesParser.ParameterListContext ctx) {
        Map<String, ParserRuleContext> table = new HashMap<>();
        for (rulesParser.VariableDeclarationContext context: ctx.variableDeclaration()) {
            SymbolTableResult result = visit(context);
            String name = result.getName();
            if (table.containsKey(name)) {
                //TODO: name conflict error
            }
            table.put(name, result.getContext());
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        Map<String, ParserRuleContext> table = new HashMap<>();
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            SymbolTableResult result = visit(context);
            String name = result.getName();
            if (table.containsKey(name)) {
                //TODO: name conflict error
            }
            table.put(name, result.getContext());
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        Map<String, ParserRuleContext> table = visit(ctx.structFieldStatementList()).getTable();
        return new SymbolTableResult(table, name, ctx);
    }

    @Override
    public SymbolTableResult visitFunctionBody(rulesParser.FunctionBodyContext ctx) {
        return visit(ctx.blockBodyCode());
    }

    @Override
    public SymbolTableResult visitBlockBodyCode(rulesParser.BlockBodyCodeContext ctx) {
        return visit(ctx.statementList());
    }

    @Override
    public SymbolTableResult visitStatementList(rulesParser.StatementListContext ctx) {
        Map<String, ParserRuleContext> table = new HashMap<>();
        for (rulesParser.StatementOrBlockContext context: ctx.statementOrBlock()) {
            SymbolTableResult result = visit(context);
            if (result == null) {
                continue;
            }
            String name = result.getName();
            if (table.containsKey(name)) {
                //TODO: name duplicate
            }
            table.put(name, result.getContext());
        }
        return new SymbolTableResult(table);
    }

    @Override
    public SymbolTableResult visitBlock(rulesParser.BlockContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public SymbolTableResult visitStatementOrBlock(rulesParser.StatementOrBlockContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public SymbolTableResult visitStatement(rulesParser.StatementContext ctx) {
        return visit(ctx.statementWithoutSemicolon());
    }

    @Override
    public SymbolTableResult visitStatementWithoutSemicolon(rulesParser.StatementWithoutSemicolonContext ctx) {
        return visit(ctx.getChild(0));
    }
}
