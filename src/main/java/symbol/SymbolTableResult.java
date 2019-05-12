package symbol;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.definition.DefinitionType;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.Map;

public class SymbolTableResult {
    private Map<String, DefinitionNode> table;
    private Token token;
    private DefinitionType definitionType; //TODO
    private ParserRuleContext context;

    public SymbolTableResult(Map<String, DefinitionNode> table) {
        this.table = table;
    }

    public SymbolTableResult(Token token, ParserRuleContext context) {
        this.token = token;
        this.context = context;
    }

    public SymbolTableResult(Token token, ParserRuleContext context, DefinitionType definitionType) {
        this.token = token;
        this.context = context;
        this.definitionType = definitionType;
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

    public SymbolTableResult(Map<String, DefinitionNode> table, Token token, ParserRuleContext context) {
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
}
