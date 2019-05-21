package type.typetype;

import org.objectweb.asm.Type;

public class VoidType extends BaseType {
    private static VoidType voidType = new VoidType();

    public VoidType() {
        super("void");
    }

    @Override
    public String getDescriptor() {
        return "V";
    }

    static VoidType getInstance() {
        return voidType;
    }

    @Override
    public Type getAsmType() {
        return Type.VOID_TYPE;
    }

    @Override
    public Object generateDefaultValue() {
        return null;
    }

    @Override
    public int getConstFieldValueType() {
        return 0;//meaningless
    }
}
