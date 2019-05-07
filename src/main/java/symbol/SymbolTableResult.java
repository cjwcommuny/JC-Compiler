package symbol;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Map;

public class SymbolTableResult {
    private Map<String, ParserRuleContext> table;
    private String name;
    private ParserRuleContext context;

    public SymbolTableResult(Map<String, ParserRuleContext> table) {
        this.table = table;
    }

    public SymbolTableResult(String name, ParserRuleContext context) {
        this.name = name;
        this.context = context;
    }

    public Map<String, ParserRuleContext> getTable() {
        return table;
    }

    public String getName() {
        return name;
    }

    public ParserRuleContext getContext() {
        return context;
    }

    public SymbolTableResult(Map<String, ParserRuleContext> table, String name, ParserRuleContext context) {
        this.table = table;
        this.name = name;
        this.context = context;
    }

}
