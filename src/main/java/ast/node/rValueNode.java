package ast.node;

public class rValueNode extends ValueNode {
    private String typeName;

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public rValueNode(String typeName, Node reference, String type) {
        this.typeName = typeName;
        this.reference = reference;
        this.type = type;
    }
}
