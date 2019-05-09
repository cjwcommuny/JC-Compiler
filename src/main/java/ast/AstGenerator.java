package ast;

import ast.node.*;
import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.rulesBaseVisitor;
import parser.rulesLexer;
import parser.rulesParser;
import symbol.ScopeHandler;
import symbol.SymbolTableGenerator;
import type.Type;
import type.TypeBuilder;
import type.base.IntType;

import java.util.List;

public class AstGenerator extends rulesBaseVisitor<AstGeneratorResult> {
    private SymbolTableGenerator symbolTableGenerator = new SymbolTableGenerator();

    private ScopeHandler scopeHandler = new ScopeHandler();

    @Override
    public AstGeneratorResult visitProgram(rulesParser.ProgramContext ctx) {
        scopeHandler.enterScope(
                symbolTableGenerator.visit(ctx).getTable(),
                null,
                false);
        ProgramNode thisNode = new ProgramNode();
        for (rulesParser.NamespaceDefinitionContext context: ctx.namespaceDefinition()) {
            AstGeneratorResult visitResult = visit(context);
            thisNode.addChildren(visitResult.getNodes());
        }
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        String namespaceName = ctx.IDENTIFIER().getText();
        scopeHandler.enterScope(
                symbolTableGenerator.visit(ctx).getTable(),
                namespaceName,
                true);

        NamespaceNode thisNode = new NamespaceNode(namespaceName);
        scopeHandler.putContextNode(ctx, thisNode);
        for (rulesParser.CodeContentContext context: ctx.codeContent()) {
            AstGeneratorResult visitResult = visit(context);
            thisNode.addChildren(visitResult.getNodes());
        }
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitCodeContent(rulesParser.CodeContentContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitVariableDefinition(rulesParser.VariableDefinitionContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx) {
        VariableDefinitionNode thisNode = new VariableDefinitionNode();
        scopeHandler.putContextNode(ctx, thisNode);
        String typeName = ctx.IDENTIFIER(0).getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        Type type = TypeBuilder.generateBaseOrObjectType(typeName, restrictNames);
        String variableName = ctx.IDENTIFIER(1).getText();
        VariableNameNode variableNameNode = new VariableNameNode(variableName, null, type);
        thisNode.addChild(variableNameNode);

        AstGeneratorResult visitResult = visit(ctx.rValue());
        thisNode.addChildren(visitResult.getNodes());
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitRValue(rulesParser.RValueContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitLiteral(rulesParser.LiteralContext ctx) {
        return visit(ctx.getChild(0));
    }

    /**
     * handle token
     * */
    @Override
    public AstGeneratorResult visitTerminal(TerminalNode thisNode) {
        String symbol = thisNode.getSymbol().getText();
        switch (thisNode.getSymbol().getType()) {
            case rulesLexer.INT_LITERAL:
                LiteralNode<Integer> node = new LiteralNode<Integer>(new IntType(), Integer.valueOf(symbol));
                return new AstGeneratorResult(node);
            case rulesLexer.DOUBLE_LITERAL:
                return null;
            case rulesLexer.BOOL_LITERAL:
                return null;
            case rulesLexer.CHAR_LITERAL:
                return null;
            case rulesLexer.STRING_LITERAL:
                return null;
//            case rulesLexer.IDENTIFIER:
//                return new IdentifierNode(symbol);
            default:
                return null;//TODO: ERROR
        }
    }
}
