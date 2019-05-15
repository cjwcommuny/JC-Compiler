package type.typetype;

public class VoidType extends BaseType {
    private static VoidType voidType = new VoidType();

    public VoidType() {
        super("void");
    }

    @Override
    public String generateDescriptor() {
        return "V";
    }

    static VoidType getInstance() {
        return voidType;
    }

    @Override
    public Object generateDefaultValue() {
        return null;
    }
}
