package classfile.attribute;

import java.util.List;

public class CodeAttribute extends AttributeInfo {
    private int maxStack; //u2
    private int max_locals; //u2
    private byte[] code;
    private int exceptionTableLength = 0; // no exception
    private List<AttributeInfo> attributes;

    public CodeAttribute(int attributeNameIndex, int maxStack, int max_locals, byte[] code, int exceptionTableLength, List<AttributeInfo> attributes) {
        super(attributeNameIndex);
        this.maxStack = maxStack;
        this.max_locals = max_locals;
        this.code = code;
        this.exceptionTableLength = exceptionTableLength;
        this.attributes = attributes;
    }

    public int getAttributesCount() {
        return attributes.size();
    }

    public int getCodeLength() {
        return code.length;
    }
}
