package type.typetype;

public class BoolType extends BaseType {
    private static BoolType boolType = new BoolType();



    @Override
    public String generateFieldDescriptor() {
        return "Z";
    }

    static BoolType getInstance() {
        return boolType;
    }
}
