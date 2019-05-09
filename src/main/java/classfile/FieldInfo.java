package classfile;

import java.util.List;

public class FieldInfo {
    private List<AccessFlag> accessFlags;
    private int nameIndex;
    private int descriptorIndex;
    private int attributesCount;
    private AttributeInfo[] attributes;
}
