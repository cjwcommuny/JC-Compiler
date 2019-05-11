package type.typetype;

public class CharType extends BaseType {
    private static CharType charType = new CharType();

    @Override
    public String generateFieldDescriptor() {
        return "C";
    }

    static CharType getInstance() {
        return charType;
    }
}
