package symbol;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Map<String, DefinitionNode> symbolTable = new HashMap<>();
    private Scope upperScope;
    private String scopeName;
    private boolean isRestrictDescriptiveScope;
    private ScopeType scopeType;
    private Node correspondingNode;

    public Node getCorrespondingNode() {
        return correspondingNode;
    }

    public DefinitionNode get(String key) {
        return symbolTable.get(key);
    }

    public void put(String key, DefinitionNode node) {
        symbolTable.put(key, node);
    }

    public Scope(Map<String, DefinitionNode> symbolTable, Scope upperScope, String scopeName, boolean isRestrictDescriptiveScope, ScopeType scopeType) {
        this.symbolTable = symbolTable;
        this.upperScope = upperScope;
        this.scopeName = scopeName;
        this.isRestrictDescriptiveScope = isRestrictDescriptiveScope;
        this.scopeType = scopeType;
    }

    public ScopeType getScopeType() {
        return scopeType;
    }

    public Scope(Scope upperScope, String scopeName, boolean isRestrictDescriptiveScope, ScopeType scopeType) {
        this.upperScope = upperScope;
        this.scopeName = scopeName;
        this.isRestrictDescriptiveScope = isRestrictDescriptiveScope;
        this.scopeType = scopeType;
    }

    public void setCorrespondingNode(Node correspondingNode) {
        this.correspondingNode = correspondingNode;
    }

    public void mergeSymbolTable(Map<String, DefinitionNode> symbolTable) {
        this.symbolTable.putAll(symbolTable);
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

    public void putAll(Map<String, ? extends DefinitionNode> table) {
        symbolTable.putAll(table);
    }

    public boolean isRestrictDescriptiveScope() {
        return isRestrictDescriptiveScope;
    }
}
