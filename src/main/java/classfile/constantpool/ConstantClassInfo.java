package classfile.constantpool;

public class ConstantClassInfo extends ConstantPoolInfo {
    private ConstantPoolTag tag = ConstantPoolTag.CLASS;
    private int nameIndex;

    public ConstantClassInfo(int nameIndex) {
        this.nameIndex = nameIndex;
    }
}
