package ast;

public class InfixExpressionNode extends Node {
    private String typeName;
    private String operation;

    public InfixExpressionNode(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    @Override
    protected String visualInfo() {
        return "InfixExpression: " + operation;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
