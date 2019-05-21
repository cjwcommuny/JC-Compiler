package type.typetype;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class IntType extends BaseType {
    private static IntType intType = new IntType();

    public IntType() {
        super("int");
    }

    @Override
    public String getDescriptor() {
        return "I";
    }

    public static IntType getInstance() {
        return intType;
    }

    @Override
    public Type getAsmType() {
        return Type.INT_TYPE;
    }

    @Override
    public Object generateDefaultValue() {
        return 0;
    }

    @Override
    public int getConstFieldValueType() {
        return Opcodes.T_INT;
    }
}
