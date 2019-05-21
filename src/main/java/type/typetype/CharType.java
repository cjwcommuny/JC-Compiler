package type.typetype;

import org.objectweb.asm.Type;

public class CharType extends BaseType {
    private static CharType charType = new CharType();

    public CharType() {
        super("char");
    }

    @Override
    public String getDescriptor() {
        return "C";
    }

    static CharType getInstance() {
        return charType;
    }

    @Override
    public Type getAsmType() {
        return Type.CHAR_TYPE;
    }

    @Override
    public Object generateDefaultValue() {
        return '\u0000';
    }
}
