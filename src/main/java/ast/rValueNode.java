package ast;

public class rValueNode extends Node {
    private String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public rValueNode() {
    }

    public rValueNode(String typeName) {
        this.typeName = typeName;
    }
}
