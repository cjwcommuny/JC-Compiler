package symbol;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.definition.DefinitionType;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import type.typetype.Type;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SymbolTableResult {
    private Map<String, DefinitionNode> table;
    private List<Token> tokens = new LinkedList<>();
    private DefinitionType definitionType; //TODO
    private ParserRuleContext context;
    private Type type;
    private List<Type> types;

    public Type getType() {
        return type;
    }

    public List<Type> getTypes() {
        return types;
    }

    public SymbolTableResult(Map<String, DefinitionNode> table) {
        this.table = table;
    }

    public SymbolTableResult(Type type, List<Token> tokens, ParserRuleContext context) {
        this.type = type;
        this.tokens.addAll(tokens);
        this.context = context;
    }

    public SymbolTableResult(Map<String, DefinitionNode> table, Token token, DefinitionType definitionType, ParserRuleContext context, Type type) {
        this.table = table;
        this.tokens.add(token);
        this.definitionType = definitionType;
        this.context = context;
        this.type = type;
    }

    public SymbolTableResult(Token token, ParserRuleContext context, DefinitionType definitionType) {
        this.tokens.add(token);
        this.definitionType = definitionType;
        this.context = context;
    }

    public Map<String, DefinitionNode> getTable() {
        return table;
    }

    public String getTokenText() {
        return tokens.get(0).getText();
    }

    public String getTokenText(int i) {
        return tokens.get(i).getText();
    }

    public ParserRuleContext getContext() {
        return context;
    }

    public SymbolTableResult(Type type, Map<String, DefinitionNode> table, Token token, ParserRuleContext context) {
        this.type = type;
        this.table = table;
        this.context = context;
        this.tokens.add(token);
    }

    public Token getToken() {
        return tokens.get(0);
    }

    public DefinitionType getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(DefinitionType definitionType) {
        this.definitionType = definitionType;
    }

    public SymbolTableResult(List<Type> types) {
        this.types = types;
    }

    public SymbolTableResult(Map<String, DefinitionNode> table, List<Type> types) {
        this.table = table;
        this.types = types;
    }

    public Token getToken(int i) {
        return tokens.get(1);
    }
}
