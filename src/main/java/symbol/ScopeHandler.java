package symbol;

import ast.VisitLater;
import ast.node.definition.DefinitionNode;

import java.util.*;

public class ScopeHandler {
    private Stack<Scope> scopeStack = new Stack<>();

    public ScopeHandler() {
//        scopeStack.push(new Scope(new HashMap<>(), null, "Global", false));
    }

    public void enterScope(VisitLater visitLater, String scopeName, boolean asRestrictiveDescriptor, ScopeType scopeType) {
        Scope upperScope;
        if (scopeStack.size() == 0) {
            upperScope = null;
        } else {
            upperScope = scopeStack.peek();
        }
        scopeStack.push(new Scope(upperScope, scopeName, asRestrictiveDescriptor, scopeType));
        Map<String, DefinitionNode> table = visitLater.visit();
        scopeStack.peek().mergeSymbolTable(table);
    }

    public Scope getCurrentScope() {
        return scopeStack.peek();
    }

    public void exitScope() {
        scopeStack.pop();
    }


    public DefinitionNode getNode(String key) {
        for (Scope scope: scopeStack) {
            DefinitionNode result = scope.get(key);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public List<String> getRestrictNames() {
        LinkedList<String> result = new LinkedList<>();
        for (Scope scope: scopeStack) {
            if (scope.asRestrictDescriptiveScope()) {
                result.add(scope.getScopeName());
            }
        }
        return result;
    }

    public void putSymbol(String name, DefinitionNode node) {
        getCurrentScope().put(name, node);
    }

    public Scope getRestrictParentScope() {
        for (int i = 1; i < scopeStack.size(); ++i) {
            Scope scope = scopeStack.get(i);
            if (scope.asRestrictDescriptiveScope()) {
                return scope;
            }
        }
        return null;
    }

    public Scope getRestrictCurrentScope() {
        for (Scope scope: scopeStack) {
            if (scope.asRestrictDescriptiveScope()) {
                return scope;
            }
        }
        return null;
    }

    public boolean currentScopeContainsName(String name) {
        return getCurrentScope().containsKey(name);
    }

    public ScopeType getScopeType() {
        return scopeStack.peek().getScopeType();
    }
}
