import org.antlr.v4.runtime.ParserRuleContext;
import java.util.Map;

public class SymbolTableGenerator extends rulesBaseVisitor<Map<String, ParserRuleContext>> {
    //traverse the parse tree to generate the symbol table

    @Override
    public Map<String, ParserRuleContext> visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        return super.visitNamespaceDefinition(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitProgram(rulesParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitCodeContent(rulesParser.CodeContentContext ctx) {
        return super.visitCodeContent(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitBlock(rulesParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitPureBlock(rulesParser.PureBlockContext ctx) {
        return super.visitPureBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitBlockBodyCode(rulesParser.BlockBodyCodeContext ctx) {
        return super.visitBlockBodyCode(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        return super.visitFunctionDefinitionBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitFunctionBody(rulesParser.FunctionBodyContext ctx) {
        return super.visitFunctionBody(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitLogicBlock(rulesParser.LogicBlockContext ctx) {
        return super.visitLogicBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitIfBlock(rulesParser.IfBlockContext ctx) {
        return super.visitIfBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitElseIfBlock(rulesParser.ElseIfBlockContext ctx) {
        return super.visitElseIfBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitElseBlock(rulesParser.ElseBlockContext ctx) {
        return super.visitElseBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitForBlock(rulesParser.ForBlockContext ctx) {
        return super.visitForBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitNonEmptyInitOrStepCondition(rulesParser.NonEmptyInitOrStepConditionContext ctx) {
        return super.visitNonEmptyInitOrStepCondition(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitWhileBlock(rulesParser.WhileBlockContext ctx) {
        return super.visitWhileBlock(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitVariableDefinition(rulesParser.VariableDefinitionContext ctx) {
        return super.visitVariableDefinition(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx) {
        return super.visitOrdinaryVariableDefinition(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx) {
        return super.visitOrdinaryArrayDefinition(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx) {
        return super.visitArrayDeclaration(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        return super.visitStructFieldStatementList(ctx);
    }

    @Override
    public Map<String, ParserRuleContext> visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        return super.visitStructDefinition(ctx);
    }
}
