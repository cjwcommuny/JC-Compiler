package symbol;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.definition.DefinitionType;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import type.typetype.Type;

import java.util.List;
import java.util.Map;

public class SymbolTableResult {
    private Map<String, DefinitionNode> table;
    private Token token;
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

    public SymbolTableResult(Type type, Token token, ParserRuleContext context) {
        this.type = type;
        this.token = token;
        this.context = context;
    }

    public SymbolTableResult(Type type, Token token, ParserRuleContext context, DefinitionType definitionType) {
        this.type = type;
        this.token = token;
        this.context = context;
        this.definitionType = definitionType;
    }

    public SymbolTableResult(Token token, ParserRuleContext context, DefinitionType definitionType) {
        this.token = token;
        this.definitionType = definitionType;
        this.context = context;
    }

    public Map<String, DefinitionNode> getTable() {
        return table;
    }

    public String getName() {
        return token.getText();
    }

    public ParserRuleContext getContext() {
        return context;
    }

    public SymbolTableResult(Type type, Map<String, DefinitionNode> table, Token token, ParserRuleContext context) {
        this.type = type;
        this.table = table;
        this.token = token;
        this.context = context;
    }

    public Token getToken() {
        return token;
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
}
