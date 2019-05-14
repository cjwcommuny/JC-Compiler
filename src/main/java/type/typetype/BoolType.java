package type.typetype;

public class BoolType extends BaseType {
    private static BoolType boolType = new BoolType();


    public BoolType() {
        super("bool");
    }

    @Override
    public String generateFieldDescriptor() {
        return "Z";
    }

    static BoolType getInstance() {
        return boolType;
    }
}
