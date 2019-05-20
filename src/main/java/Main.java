import ast.AstGenerator;
import ast.AstGeneratorResult;
import ast.node.Node;
import classgen.ClassFileGenerator;
import classgen.OutputClassFile;
import codegen.AstInfo;
import error.SyntaxError;
import error.SyntaxErrorListener;
import error.exception.ParseException;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("args: input file path!");
        }
        String inputFile = args[0];
        Lexer lexer = new rulesLexer(CharStreams.fromStream(new FileInputStream(inputFile)));

        SyntaxErrorListener lexListener = new SyntaxErrorListener();
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        lexer.addErrorListener(lexListener);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        rulesParser parser = new rulesParser(tokenStream);

        SyntaxErrorListener parserErrorListener = new SyntaxErrorListener();
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.addErrorListener(parserErrorListener);
        ParseTree tree = parser.program();
        AstGenerator astGenerator = new AstGenerator(tokenStream);

        //parser info printing
        if (parserErrorListener.getSyntaxErrorsCount() != 0) {
            List<SyntaxError> syntaxErrors = parserErrorListener.getSyntaxErrors();
            for (SyntaxError error: syntaxErrors) {
                System.out.println(error.getMessage());
            }
            return;
        }
        try {
            AstGeneratorResult visitResult = astGenerator.visit(tree);
            Node ast = visitResult.getNodes().get(0);
            ast.printTree();
//            showAstInGUI(parser, tree);
            AstInfo astInfo = new AstInfo(ast,
                    astGenerator.getSimpleClassName(),
                    astGenerator.getFunctionNodes(),
                    astGenerator.getStructNodes(),
                    astGenerator.getFieldNodes());
            ClassFileGenerator classFileGenerator = new ClassFileGenerator(astInfo);
            List<OutputClassFile> outputClassFiles = classFileGenerator.generateOutputFilesInfo();
            for (OutputClassFile outputClassFile: outputClassFiles) {
                byte[] bytes = outputClassFile.getBytes();
                String fileName = outputClassFile.getFileName();
                String pathName = "./" + fileName + ".class";
                try (FileOutputStream stream = new FileOutputStream(pathName)) {
                    stream.write(bytes);
                }
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
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
