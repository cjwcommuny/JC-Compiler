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
import org.apache.commons.cli.*;
import parser.*;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static boolean displayParseTree;
    private static boolean displaySyntaxTree;
    private static String inputFile;

    public static void main(String[] args)
            throws org.apache.commons.cli.ParseException, IOException {
        //handle command line
        if (args.length < 1) {
            System.out.println("arg required: input file path!");
            return;
        }
        inputFile = args[0];
        handleCommandLineOptions(Arrays.copyOfRange(args, 1, args.length));

        //tokenize and parse
        TokenizerAndParser tokenizerAndParser = new TokenizerAndParser().invoke();
        if (tokenizerAndParser.hasErrors()) return;
        ParseTree tree = tokenizerAndParser.getTree();
        AstGenerator astGenerator = tokenizerAndParser.getAstGenerator();

        //semantic analysis
        SemanticAnalysis semanticAnalysis = new SemanticAnalysis(tree, astGenerator).invoke();
        if (semanticAnalysis.errorHappen()) return;
        Node ast = semanticAnalysis.getAst();

        //generate class files
        generateClassFiles(astGenerator, ast);
    }

    private static void generateClassFiles(AstGenerator astGenerator, Node ast) throws IOException {
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
            String directory = Paths.get(inputFile).toAbsolutePath().getParent().toString();
            try (FileOutputStream stream =
                         new FileOutputStream(new File(directory, fileName + ".class"))
            ) {
                stream.write(bytes);
            }
        }
    }

    private static void handleCommandLineOptions(String[] args) throws org.apache.commons.cli.ParseException {
        Options options = new Options();
        options.addOption("p", "parsetree", false, "display parse tree");
        options.addOption("s", "syntaxtree", false, "display syntax tree");
        CommandLineParser commandLineParser = new DefaultParser();
        CommandLine cmd = commandLineParser.parse(options, args);
        displayParseTree = cmd.hasOption("p");
        displaySyntaxTree = cmd.hasOption("s");
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

    private static class SemanticAnalysis {
        private boolean hasError;
        private ParseTree tree;
        private AstGenerator astGenerator;
        private Node ast;

        public SemanticAnalysis(ParseTree tree, AstGenerator astGenerator) {
            this.tree = tree;
            this.astGenerator = astGenerator;
        }

        boolean errorHappen() {
            return hasError;
        }

        public Node getAst() {
            return ast;
        }

        public SemanticAnalysis invoke() {
            try {
                AstGeneratorResult visitResult = astGenerator.visit(tree);
                ast = visitResult.getNodes().get(0);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
                hasError = true;
                return this;
            }
            if (displaySyntaxTree) {
                ast.printTree();
            }
            hasError = false;
            return this;
        }
    }

    private static class TokenizerAndParser {
        private boolean hasErrors;
        private ParseTree tree;
        private AstGenerator astGenerator;

        boolean hasErrors() {
            return hasErrors;
        }

        public ParseTree getTree() {
            return tree;
        }

        public AstGenerator getAstGenerator() {
            return astGenerator;
        }

        public TokenizerAndParser invoke() throws IOException {
            //tokenize and parse
            Lexer lexer = new rulesLexer(CharStreams.fromStream(new FileInputStream(inputFile)));
            SyntaxErrorListener lexListener = new SyntaxErrorListener();
            lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
            lexer.addErrorListener(lexListener);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            rulesParser parser = new rulesParser(tokenStream);
            SyntaxErrorListener parserErrorListener = new SyntaxErrorListener();
            parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
            parser.addErrorListener(parserErrorListener);
            tree = parser.program();
            astGenerator = new AstGenerator(tokenStream);

            //parser error info display
            if (parserErrorListener.getSyntaxErrorsCount() != 0) {
                List<SyntaxError> syntaxErrors = parserErrorListener.getSyntaxErrors();
                for (SyntaxError error: syntaxErrors) {
                    System.out.print("line " + error.getLine() + ":" + error.getCharPositionInLine() + " ");
                    System.out.println(error.getMessage());
                }
                hasErrors = true;
                return this;
            }
            if (displayParseTree) {
                showAstInGUI(parser, tree);
            }
            hasErrors = false;
            return this;
        }
    }
}
