package type.typetype;

public class CharType extends BaseType {
    private static CharType charType = new CharType();

    public CharType() {
        super("char");
    }

    @Override
    public String generateFieldDescriptor() {
        return "C";
    }

    static CharType getInstance() {
        return charType;
    }
}
