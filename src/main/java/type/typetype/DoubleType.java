package type.typetype;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

public class DoubleType extends BaseType {
    private static DoubleType doubleType = new DoubleType();

    public DoubleType() {
        super("double");
    }

    @Override
    public String getDescriptor() {
        return "D";
    }

    public static DoubleType getInstance() {
        return doubleType;
    }

    @Override
    public Type getAsmType() {
        return Type.DOUBLE_TYPE;
    }

    @Override
    public Object generateDefaultValue() {
        return 0;
    }

    public static DoubleType getDoubleType() {
        return doubleType;
    }

    @Override
    public int getConstFieldValueType() {
        return Opcodes.T_DOUBLE;
    }
}
