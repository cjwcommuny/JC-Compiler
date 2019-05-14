package classfile.attribute;

public class AttributeInfo {
    private int attributeNameIndex; //u2
    private int attributeLength; //u4
    private byte[] info; // = new byte[attributeLength]
}
