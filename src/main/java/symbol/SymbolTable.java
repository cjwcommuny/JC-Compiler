package symbol;

import java.util.Map;
import java.util.Stack;

public class SymbolTable<S, T> {
    private Stack<Map<S, T>> scopeStack = new Stack<>();

    public void enterScope(Map<S, T> symbolTable) {
        scopeStack.push(symbolTable);
    }

    public Map<S, T> exitScope() {
        return scopeStack.pop();
    }

    public T search(S symbol) {
        for (var symbolTable: scopeStack) {
            T result = symbolTable.get(symbol);
            if (result != null) {
                return result;
            }
        }
        return null;
    }
}
