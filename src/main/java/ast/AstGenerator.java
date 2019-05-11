package ast;

import ast.node.*;
import ast.node.definition.DefinitionNode;
import ast.node.definition.NamespaceNode;
import ast.node.definition.VariableDefinitionNode;
import ast.node.reference.RefNode;
import ast.node.reference.RefNodeBuilder;
import ast.node.reference.VariableNameNode;
import ast.node.structure.ProgramNode;
import ast.node.value.InfixExpressionNode;
import ast.node.value.UnaryExpressionNode;
import ast.node.value.ValueNode;
import operation.InfixOperation;
import operation.Operation;
import operation.UnaryOperation;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.rulesBaseVisitor;
import parser.rulesLexer;
import parser.rulesParser;
import symbol.ScopeHandler;
import symbol.SymbolTableGenerator;
import type.TypeCheckerAndInference;
import type.typetype.Type;
import type.typetype.TypeBuilder;
import type.typetype.IntType;
import value.Value;

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
        String typeName = ctx.IDENTIFIER(0).getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        Type type = TypeBuilder.generateBaseOrObjectType(typeName, restrictNames);
        VariableDefinitionNode thisNode = new VariableDefinitionNode(type);

        scopeHandler.putContextNode(ctx, thisNode);
        String variableName = ctx.IDENTIFIER(1).getText();
        VariableNameNode variableNameNode = new VariableNameNode(variableName, null, type);
        thisNode.addChild(variableNameNode);

        AstGeneratorResult visitResult = visit(ctx.rValue());
        ValueNode rightSideNode = (ValueNode) visitResult.getNodes().get(0);
        Type rightSideType = rightSideNode.getType();
        if (!TypeCheckerAndInference.checkAssignment(type, rightSideType)) {
            //TODO: assignment type mismatch
            System.err.println("assignment type mismatch");
        }
        thisNode.addChild(rightSideNode);
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
            case rulesLexer.INT_LITERAL: {
                LiteralNode<Integer> node = new LiteralNode<>(TypeBuilder.generateIntType(),
                        Integer.valueOf(symbol));
                return new AstGeneratorResult(node);
            }
            case rulesLexer.DOUBLE_LITERAL: {
                LiteralNode<Double> node = new LiteralNode<>(TypeBuilder.generateDoubleType(),
                        Double.parseDouble(symbol));
                return new AstGeneratorResult(node);
            }
            case rulesLexer.BOOL_LITERAL: {
                LiteralNode<Boolean> node = new LiteralNode<>(TypeBuilder.generateBoolType(),
                        Boolean.parseBoolean(symbol));
                return new AstGeneratorResult(node);
            }
            case rulesLexer.CHAR_LITERAL: {
                LiteralNode<Character> node = new LiteralNode<>(TypeBuilder.generateCharType(),
                        symbol.charAt(1)); //symbol is like 'c'
                return new AstGeneratorResult(node);
            }
            case rulesLexer.STRING_LITERAL: {
                //TODO
            }
                return null;
            case rulesLexer.IDENTIFIER: {
                DefinitionNode defNode = scopeHandler.getNode(symbol);
                if (defNode == null) {
                    //TODO: symbol not resolved
                    System.err.println("symbol not resolved");
                }
                RefNode refNode = RefNodeBuilder.generateProperReNode(symbol, defNode);
                return new AstGeneratorResult(refNode);
            }
            default:
                return null;//TODO: ERROR
        }
    }

    @Override
    public AstGeneratorResult visitInfixExpression(rulesParser.InfixExpressionContext ctx) {
        String operationStr = ctx.getChild(1).getText();
        Operation operation = new InfixOperation(operationStr);
        ValueNode leftNode = (ValueNode) visit(ctx.getChild(0)).getNode();
        ValueNode rightNode = (ValueNode) visit(ctx.getChild(2)).getNode();
        Type resultType = TypeCheckerAndInference.checkInfixComputation(operation,
                leftNode.getType(),
                rightNode.getType());
        InfixExpressionNode thisNode = new InfixExpressionNode(operation, resultType);
        thisNode.addChild(leftNode);
        thisNode.addChild(rightNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitUnaryExpression(rulesParser.UnaryExpressionContext ctx) {
        String operationStr = ctx.getChild(0).getText();
        Operation operation = new UnaryOperation(operationStr);
        ValueNode valueNode = (ValueNode) visit(ctx.getChild(1)).getNode();
        Type resultType = TypeCheckerAndInference.checkUnaryComputation(operation, valueNode.getType());
        UnaryExpressionNode thisNode = new UnaryExpressionNode(operation, resultType);
        thisNode.addChild(valueNode);
        return new AstGeneratorResult(thisNode);
    }
}
