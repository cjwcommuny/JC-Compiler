package ast.node;

import java.util.List;

public class StatementListNode extends Node {
    @Override
    protected String visualInfo() {
        return "StatementList";
    }

    public List<Node> getStatements() {
        return getChildren();
    }
}
