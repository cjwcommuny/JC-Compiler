package classfile;

import classfile.attribute.AttributeInfo;

import java.util.List;

public class FieldInfo {
    private int accessFlags;
    private int nameIndex;
    private int descriptorIndex;
    private List<AttributeInfo> attributes;

    public int getAttributesCount() {
        return attributes.size();
    }

    public FieldInfo(int accessFlags, int nameIndex, int descriptorIndex, List<AttributeInfo> attributes) {
        this.accessFlags = accessFlags;
        this.nameIndex = nameIndex;
        this.descriptorIndex = descriptorIndex;
        this.attributes = attributes;
    }
}
