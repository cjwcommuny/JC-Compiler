import value.Value;

import java.util.HashMap;
import java.util.Map;

public class SymbolTableGenerator extends rulesBaseListener {
    private Map<Scope, Map<Symbol, Value>> scopeSymbolTable = new HashMap<>();
    private ParseTreeVisitor treeVisitor = new ParseTreeVisitor();

    public Map<Scope, Map<Symbol, Value>> getScopeSymbolTable() {
        return scopeSymbolTable;
    }

    @Override
    public void exitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
//        String namespaceName =
    }
}
