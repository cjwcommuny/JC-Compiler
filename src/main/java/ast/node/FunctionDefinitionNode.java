package ast.node;
/**
 * child 1: return type
 * child 2: function name
 * child 3 ...: parameter
 * child 4: function body
 * */
public class FunctionDefinitionNode extends Node {
    @Override
    protected String visualInfo() {
        return "FunctionDefinition";
    }
}
