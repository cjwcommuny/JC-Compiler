package type.typetype;

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
    public Object generateDefaultValue() {
        return 0;
    }
}
