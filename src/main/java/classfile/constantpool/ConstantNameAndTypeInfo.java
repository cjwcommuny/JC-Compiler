package classfile.constantpool;

public class ConstantNameAndTypeInfo {
    private ConstantPoolTag tag = ConstantPoolTag.NAME_AND_TYPE;
    private int nameIndex; //name of method or field
    private int descriptorIndex;
}
