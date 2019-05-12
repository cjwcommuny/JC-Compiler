package symbol;

import ast.node.definition.DefinitionNode;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Map<String, DefinitionNode> symbolTable = new HashMap<>();
    private Scope upperScope;
    private String scopeName;
    private boolean isRestrictDescriptiveScope;

    public DefinitionNode get(String key) {
        return symbolTable.get(key);
    }

    public void put(String key, DefinitionNode node) {
        symbolTable.put(key, node);
    }

    public Scope(Map<String, DefinitionNode> symbolTable, Scope upperScope, String scopeName, boolean isRestrictDescriptiveScope) {
        this.symbolTable = symbolTable;
        this.upperScope = upperScope;
        this.scopeName = scopeName;
        this.isRestrictDescriptiveScope = isRestrictDescriptiveScope;
    }

    public String getScopeName() {
        return scopeName;
    }

    public boolean asRestrictDescriptiveScope() {
        return isRestrictDescriptiveScope;
    }

    public boolean containsKey(String key) {
        return symbolTable.containsKey(key);
    }
}
