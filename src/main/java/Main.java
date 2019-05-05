import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String inputFile = "/Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/sample.lang";

        Lexer lexer = new rulesLexer(CharStreams.fromStream(new FileInputStream(inputFile)));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        rulesParser parser = new rulesParser(tokenStream);
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
//        MyRulesVisitor visitor = new MyRulesVisitor();
//        visitor.visit(tree);

        //show ast in GUI
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
