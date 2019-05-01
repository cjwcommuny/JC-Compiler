import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) throws Exception {
//        String inputFile = "/Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/sample.lang";
//
        Lexer lexer = new rulesLexer(CharStreams.fromStream(System.in));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        rulesParser parser = new rulesParser(tokenStream);
        ParseTree tree = parser.program();
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
//        walker.walk(new ShortToUnicodeString(), tree);
        System.out.println();
    }
}