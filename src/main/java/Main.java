import ast.Ast;
import ast.Node;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "/Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/sample.lang";

        Lexer lexer = new rulesLexer(CharStreams.fromStream(new FileInputStream(inputFile)));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        rulesParser parser = new rulesParser(tokenStream);
        ParseTree tree = parser.program();
        AstGenerator astGenerator = new AstGenerator();
        Node ast = astGenerator.visit(tree);
        ast.printTree();
        Ast.semanticAnalyze(ast, astGenerator.getSymbolTable(), astGenerator.getContextMap());
        showAstInGUI(parser, tree);
    }

    private static void showAstInGUI(rulesParser parser, ParseTree tree) {
        JFrame frame = new JFrame("Antlr ast");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }
}