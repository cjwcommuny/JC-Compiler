package classfile.constantpool;

public class ConstantUtf8Info extends ConstantPoolInfo {
    private ConstantPoolTag tag = ConstantPoolTag.UTF8;
    private int length;
    private byte[] bytes;

    public ConstantUtf8Info(int length, byte[] bytes) {
        this.length = length;
        this.bytes = bytes;
    }
}
