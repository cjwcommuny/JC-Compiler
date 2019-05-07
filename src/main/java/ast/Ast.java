package ast;

import org.antlr.v4.runtime.ParserRuleContext;
import symbol.SymbolTable;

import java.util.Map;

public class Ast {
    public static void semanticAnalyze(Node root,
                                       SymbolTable<String, ParserRuleContext> symbolTable,
                                       Map<ParserRuleContext, Node> contextMap) {
        System.out.println(symbolTable);
        System.out.println(contextMap);
    }
}
