package symbol;

import ast.node.Node;
import ast.node.definition.DefinitionNode;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class ScopeHandler {
    private Stack<Scope> scopeStack = new Stack<>();
    private Map<ParserRuleContext, DefinitionNode> contextNodeMap = new HashMap<>();//TODO: add hashcode() to visitor

    public ScopeHandler() {
        scopeStack.push(new Scope(new HashMap<>(), null, "Global", false));
    }

    public void enterScope(Map<String, ParserRuleContext> table, String scopeName, boolean asRestrictiveDescriptor) {
        Scope upperScope;
        if (scopeStack.size() == 0) {
            upperScope = null;
        } else {
            upperScope = scopeStack.peek();
        }
        scopeStack.push(new Scope(table, upperScope, scopeName, asRestrictiveDescriptor));
    }

    public Scope getCurrentScope() {
        return scopeStack.peek();
    }

    public void exitScope() {
        scopeStack.pop();
    }

    public void putContextNode(ParserRuleContext context, DefinitionNode node) {
        contextNodeMap.put(context, node);
    }

    private ParserRuleContext getContext(String key) {
        for (Scope scope: scopeStack) {
            ParserRuleContext result = scope.get(key);
            if (result != null) {
                return result;
            }
        }
        return null;
    }

    public DefinitionNode getNode(String key) {
        ParserRuleContext context = getContext(key);
        if (context == null) {
            return null;
        }
        return contextNodeMap.get(context);
    }

    public List<String> getRestrictNames() {
        LinkedList<String> result = new LinkedList<>();
        for (Scope scope: scopeStack) {
            if (scope.asRestrictDescriptiveScope()) {
                result.addFirst(scope.getScopeName());
            }
        }
        return result;
    }

    public void putSymbol(String name, ParserRuleContext context, DefinitionNode node) {
        getCurrentScope().put(name, context);
        putContextNode(context, node);
    }

    public Node getNode(ParserRuleContext context) {
        return contextNodeMap.get(context);
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
}
