package symbol;

import ast.VisitLater;
import ast.node.Node;
import ast.node.definition.DefinitionNode;
import ast.node.definition.FunctionDefinitionNode;
import ast.node.structrue.ForBlockNode;
import ast.node.structrue.WhileBlockNode;
import type.typetype.ObjectType;

import java.util.*;

public class ScopeHandler {
    private Stack<Scope> scopeStack = new Stack<>();

    public ScopeHandler() {
        InitSymbolImporter initSymbolImporter = new InitSymbolImporter();
        scopeStack.push(new Scope(new HashMap<>(), null, "OuterScope", false, ScopeType.ANONYMOUS));
        initSymbolImporter.importInitNames(scopeStack.peek());
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

    public void setNodeToCurrentScope(Node node) {
        scopeStack.peek().setCorrespondingNode(node);
    }

    public Scope getCurrentScope() {
        return scopeStack.peek();
    }

    public void exitScope() {
        scopeStack.pop();
    }


    public DefinitionNode getNode(String key) {
        for (int i = scopeStack.size() - 1; i >= 0; --i) {
            Scope scope = scopeStack.get(i);
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

    public Scope getClosestLoopBlockScope() {
        for (int i = scopeStack.size() - 1; i >= 0; --i) {
            Scope scope = scopeStack.get(i);
            Node node = scope.getCorrespondingNode();
            if (node == null) {
                return null;
            } else if (node instanceof ForBlockNode || node instanceof WhileBlockNode) {
                return scope;
            }
        }
        return null;
    }

    public Scope getClosestFunctionScope() {
        for (int i = scopeStack.size() - 1; i >= 0; --i) {
            Scope scope = scopeStack.get(i);
            Node node = scope.getCorrespondingNode();
            if (node == null) {
                return null;
            } else if (node instanceof FunctionDefinitionNode) {
                return scope;
            }
        }
        return null;
    }

    public boolean existInCurrentScope(String name) {
        return scopeStack.peek().get(name) != null;
    }


}
