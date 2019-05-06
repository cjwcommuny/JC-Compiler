package ast;

public class InfixExpressionNode extends Node {
    private String operation;

    public InfixExpressionNode(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
