package ast;

import ast.node.*;
import ast.node.definition.*;
import ast.node.reference.FunctionNameNode;
import ast.node.reference.RefNode;
import ast.node.reference.RefNodeBuilder;
import ast.node.reference.VariableNameNode;
import ast.node.structure.ProgramNode;
import ast.node.value.InfixExpressionNode;
import ast.node.value.UnaryExpressionNode;
import ast.node.value.ValueNode;
import error.exception.SymbolNotResolvedException;
import error.exception.TypeMismatchException;
import operation.InfixOperation;
import operation.Operation;
import operation.UnaryOperation;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.rulesBaseVisitor;
import parser.rulesLexer;
import parser.rulesParser;
import symbol.ScopeHandler;
import symbol.SymbolTableGenerator;
import type.TypeCheckerAndInference;
import type.typetype.FunctionType;
import type.typetype.ObjectType;
import type.typetype.Type;
import type.typetype.TypeBuilder;

import java.util.List;

public class AstGenerator extends rulesBaseVisitor<AstGeneratorResult> {
    private SymbolTableGenerator symbolTableGenerator = new SymbolTableGenerator();

    private ScopeHandler scopeHandler = new ScopeHandler();

    private CommonTokenStream commonTokenStream;

    public AstGenerator(CommonTokenStream commonTokenStream) {
        this.commonTokenStream = commonTokenStream;
    }

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
        AstGeneratorResult declarationVisitResult = visit(ctx.variableDeclaration());
        VariableNameNode variableNameNode = (VariableNameNode) declarationVisitResult.getNode();
        ParserRuleContext declarationContext = declarationVisitResult.getContext();

        Type type = variableNameNode.getType();
        VariableDefinitionNode thisNode = new VariableDefinitionNode(type);

        scopeHandler.putContextNode(ctx, thisNode);
        thisNode.addChild(variableNameNode);

        AstGeneratorResult visitResult = visit(ctx.rValue());
        ValueNode rightSideNode = (ValueNode) visitResult.getNodes().get(0);
        Type rightSideType = rightSideNode.getType();
        if (!TypeCheckerAndInference.checkAssignment(type, rightSideType)) {
            //TODO: assignment type mismatch
            Token assignToken = ctx.ASSIGN_SYMBOL().getSymbol();
            int[] tokenPosition = getTokenPosition(ctx, assignToken);
            throw new TypeMismatchException(tokenPosition, type, rightSideType);
        }
        thisNode.addChild(rightSideNode);
        return new AstGeneratorResult(thisNode, declarationContext);
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
                    int[] errorPosition = getTokenPosition((ParserRuleContext) thisNode.getParent(),
                            thisNode.getSymbol());
                    throw new SymbolNotResolvedException(errorPosition, symbol);
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

    @Override
    public AstGeneratorResult visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        String returnTypeStr = ctx.getChild(1).getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String functionName = ctx.getChild(2).getText();
        scopeHandler.enterScope(symbolTableGenerator.visit(ctx).getTable(), functionName, false);

        ParameterListNode parametersNode = (ParameterListNode) visit(ctx.getChild(3)).getNode();
        List<Type> parameterTypes = parametersNode.getTypes();
        StatementListNode statements = (StatementListNode) visit(ctx.getChild(4)).getNode();
        FunctionType functionType = TypeBuilder.generateFunctionType(returnTypeStr,
                restrictNames,
                parameterTypes);
        FunctionDefinitionNode thisNode = new FunctionDefinitionNode(functionType);
        FunctionNameNode functionNameNode = new FunctionNameNode(functionName, null, functionType);
        scopeHandler.putContextNode(ctx, thisNode);
        thisNode.addChild(functionNameNode);
        thisNode.addChild(parametersNode);
        thisNode.addChild(statements);
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx) {
        return visit(ctx.parameterList());
    }

    @Override
    public AstGeneratorResult visitFunctionBody(rulesParser.FunctionBodyContext ctx) {
        return visit(ctx.blockBodyCode());
    }

    @Override
    public AstGeneratorResult visitParameterList(rulesParser.ParameterListContext ctx) {
        ParameterListNode thisNode = new ParameterListNode();
        for (rulesParser.VariableDeclarationContext child: ctx.variableDeclaration()) {
            //convert to definition node
            AstGeneratorResult astGeneratorResult = visit(child);
            VariableNameNode nameNode = (VariableNameNode) astGeneratorResult.getNode();
            VariableDefinitionNode definitionNode = new VariableDefinitionNode(nameNode.getType());
            definitionNode.addChild(nameNode);
            scopeHandler.putContextNode(astGeneratorResult.getContext(), definitionNode);
            thisNode.addChild(definitionNode);
        }
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitOrdinaryVariableDeclaration(rulesParser.OrdinaryVariableDeclarationContext ctx) {
        String typeName = ctx.IDENTIFIER(0).getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String variableName = ctx.IDENTIFIER(1).getText();
        Type type = TypeBuilder.generateBaseOrObjectType(typeName, restrictNames);
        VariableNameNode thisNode = new VariableNameNode(variableName, null, type);
        return new AstGeneratorResult(thisNode, ctx);
    }

    @Override
    public AstGeneratorResult visitStatementList(rulesParser.StatementListContext ctx) {
        StatementListNode statementListNode = new StatementListNode();
        for (int i = 0; i < ctx.getChildCount(); ++i) {
            ParseTree parseTree = ctx.getChild(i);
            Node node = visit(parseTree).getNode();
            statementListNode.addChild(node);
        }
        return new AstGeneratorResult(statementListNode);
    }

    @Override
    public AstGeneratorResult visitStatement(rulesParser.StatementContext ctx) {
        return visit(ctx.statementWithoutSemicolon());
    }

    @Override
    public AstGeneratorResult visitVariableDefinitionInStatement(rulesParser.VariableDefinitionInStatementContext ctx) {
        AstGeneratorResult result = visit(ctx.variableDefinition());
        VariableDefinitionNode node = (VariableDefinitionNode) result.getNode();
        scopeHandler.putSymbol(node.getVariableName(), ctx.variableDefinition(), node); //put symbol
        return result;
    }

    private int[] getTokenPosition(ParserRuleContext ctx, Token token) {
        Interval sourceInterval = ctx.getSourceInterval();
        Token firstToken = commonTokenStream.get(sourceInterval.a);
        int lineRowNumber = firstToken.getLine();
        int columnColumnNumber = token.getCharPositionInLine();
        return new int[]{lineRowNumber, columnColumnNumber};
    }

    @Override
    public AstGeneratorResult visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        String structName = ctx.IDENTIFIER().getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        ObjectType type = TypeBuilder.generateObjectType(structName, restrictNames);
        StructureDefinitionNode thisNode = new StructureDefinitionNode(type);
        scopeHandler.putContextNode(ctx, thisNode);
        scopeHandler.enterScope(symbolTableGenerator.visit(ctx).getTable(), structName, true);
        StructFieldListNode fieldDefinitionNode = (StructFieldListNode)
                visit(ctx.structFieldStatementList()).getNode();
        scopeHandler.exitScope();
        thisNode.addChild(fieldDefinitionNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        StructFieldListNode fieldsNode = new StructFieldListNode();
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            AstGeneratorResult visitResult = visit(context);
            DefinitionNode definitionNode = (DefinitionNode) visitResult.getNode();
            fieldsNode.addChild(definitionNode);
            ParserRuleContext definitionContext = visitResult.getContext();
            scopeHandler.putContextNode(definitionContext, definitionNode);
        }
        return new AstGeneratorResult(fieldsNode);
    }
}
