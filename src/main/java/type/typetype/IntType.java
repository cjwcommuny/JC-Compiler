package type.typetype;

public class IntType extends BaseType {
    private static IntType intType = new IntType();

    @Override
    public String generateFieldDescriptor() {
        return "I";
    }

    static IntType getInstance() {
        return intType;
    }
}
