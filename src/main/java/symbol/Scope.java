package symbol;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.Map;

public class Scope {
    private Map<String, ParserRuleContext> symbolTable = new HashMap<>();
    private Scope upperScope;
    private String scopeName;
    private boolean isRestrictDescriptiveScope;

    public ParserRuleContext get(String key) {
        return symbolTable.get(key);
    }

    public void put(String key, ParserRuleContext context) {
        symbolTable.put(key, context);
    }

    public Scope(Map<String, ParserRuleContext> symbolTable, Scope upperScope, String scopeName, boolean isRestrictDescriptiveScope) {
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
}
