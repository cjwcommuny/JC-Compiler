package ast.node;

public class ArrayDefinitionNode extends Node {
    private int dimension;

    public ArrayDefinitionNode(int dimension) {
        this.dimension = dimension;
    }
}
