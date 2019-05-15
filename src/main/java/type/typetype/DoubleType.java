package type.typetype;

import org.objectweb.asm.Type;

public class DoubleType extends BaseType {
    private static DoubleType doubleType = new DoubleType();

    public DoubleType() {
        super("double");
    }

    @Override
    public String generateDescriptor() {
        return "D";
    }

    static DoubleType getInstance() {
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
}
