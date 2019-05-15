package type.typetype;

public class IntType extends BaseType {
    private static IntType intType = new IntType();

    public IntType() {
        super("int");
    }

    @Override
    public String generateDescriptor() {
        return "I";
    }

    static IntType getInstance() {
        return intType;
    }

    @Override
    public Object generateDefaultValue() {
        return 0;
    }
}
