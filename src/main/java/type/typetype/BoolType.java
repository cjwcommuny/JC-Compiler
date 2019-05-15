package type.typetype;

import org.objectweb.asm.Type;

public class BoolType extends BaseType {
    private static BoolType boolType = new BoolType();


    public BoolType() {
        super("bool");
    }

    @Override
    public String generateDescriptor() {
        return "Z";
    }

    static BoolType getInstance() {
        return boolType;
    }

    @Override
    public Object generateDefaultValue() {
        return false;
    }

    @Override
    public Type getAsmType() {
        return Type.BOOLEAN_TYPE;
    }
}
