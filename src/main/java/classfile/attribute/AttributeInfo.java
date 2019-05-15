package classfile.attribute;

public class AttributeInfo {
    private int attributeNameIndex; //u2

    public int getAttributeLength() {
        //TODO
        return 0;
    }

    public AttributeInfo(int attributeNameIndex) {
        this.attributeNameIndex = attributeNameIndex;
    }
}
