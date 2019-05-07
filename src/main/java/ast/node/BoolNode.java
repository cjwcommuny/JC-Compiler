package ast.node;

import value.Value;

public class BoolNode extends ValueNode {
    private boolean value;

    public BoolNode() {
    }

    @Override
    protected String visualInfo() {
        return "BOOL: " + value;
    }

    public BoolNode(boolean value) {
        this.value = value;
    }
}
