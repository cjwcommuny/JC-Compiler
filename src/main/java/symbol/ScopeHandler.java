package symbol;

import ast.node.Node;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class ScopeHandler {
    private Stack<Scope> scopeStack = new Stack<>();
    private Map<ParserRuleContext, Node> contextNodeMap = new HashMap<>();//TODO: add hashcode() to visitor

    public void enterScope(Map<String, ParserRuleContext> table, String scopeName, boolean asRestrictiveDescriptor) {
        Scope upperScope;
        if (scopeStack.size() == 0) {
            upperScope = null;
        } else {
            upperScope = scopeStack.peek();
        }
        scopeStack.push(new Scope(table, upperScope, scopeName, asRestrictiveDescriptor));
    }

    public void exitScope() {
        scopeStack.pop();
    }

    public void putContextNode(ParserRuleContext context, Node node) {
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

    public Node getNode(String key) {
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
}
