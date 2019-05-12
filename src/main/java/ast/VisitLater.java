package ast;

import ast.node.definition.DefinitionNode;
import org.antlr.v4.runtime.ParserRuleContext;
import symbol.SymbolTableGenerator;
import symbol.SymbolTableResult;

import java.util.Map;

public class VisitLater {
    private ParserRuleContext context;
    private SymbolTableGenerator symbolTableGenerator;

    public VisitLater(ParserRuleContext context, SymbolTableGenerator symbolTableGenerator) {
        this.context = context;
        this.symbolTableGenerator = symbolTableGenerator;
    }

    public Map<String, DefinitionNode> visit() {
        if (symbolTableGenerator == null || context == null) {
            //empty visitLater
            return null;
        }
        return symbolTableGenerator.visit(context).getTable();
    }
}
