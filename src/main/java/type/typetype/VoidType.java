package type.typetype;

public class VoidType extends BaseType {
    private static VoidType voidType = new VoidType();

    @Override
    public String generateFieldDescriptor() {
        return "V";
    }

    static VoidType getInstance() {
        return voidType;
    }
}
