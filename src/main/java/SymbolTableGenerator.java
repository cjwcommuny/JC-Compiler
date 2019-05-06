import value.Value;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableGenerator extends rulesBaseListener {
    private Map<Scope, Map<Symbol, Value>> scopeSymbolTable = new HashMap<>();
    private MyRulesVisitor treeVisitor = new MyRulesVisitor();

    public Map<Scope, Map<Symbol, Value>> getScopeSymbolTable() {
        return scopeSymbolTable;
    }

    @Override
    public void exitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        String namespaceName = ctx.IDENTIFIER().getText();
        Scope scope = new Scope(namespaceName);
        if (scopeSymbolTable.containsKey(scope)) {
            //TODO: error, duplicate namespace name
        }
        scopeSymbolTable.put(scope, new HashMap<>());
    }

//    @Override
//    public void exitCodeContent(rulesParser.CodeContentContext ctx) {
////        Map<Symbol, Value> scope = ctx.parent.parent.
//    }
}
