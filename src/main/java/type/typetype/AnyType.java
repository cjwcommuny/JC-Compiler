package type.typetype;

/**
 * used in function parameter
 * */
public class AnyType extends Type {
    public static AnyType anyType = new AnyType();

    @Override
    public String generateDescriptor() {
        return "**ANY**";
    }

    @Override
    public Object generateDefaultValue() {
        return null;
    }

    @Override
    public org.objectweb.asm.Type getAsmType() {
        return null;
    }

    static AnyType getInstance() {
        return anyType;
    }
}
