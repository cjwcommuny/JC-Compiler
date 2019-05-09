package ast.node;

public class RValueNode extends ValueNode {
    private String typeName;

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public RValueNode(String typeName, Node reference, String type) {
        this.typeName = typeName;
        this.reference = reference;
        this.type = type;
    }
}
