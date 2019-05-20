package type.typetype;

import java.util.List;
import java.util.Objects;

public abstract class Type {
    abstract public String generateDescriptor();

    public String visualInfo() {
        return this.getClass().getSimpleName();
    }

    public String getSimpleName() {
        return visualInfo();
    }

    abstract public Object generateDefaultValue();

    abstract public org.objectweb.asm.Type getAsmType();

    public static Type getLowestUpperType(Type type1, Type type2) {
        Type result;
        if (type1 instanceof DoubleType) {
            result = TypeBuilder.generateDoubleType();
        } else if (type2 instanceof DoubleType) {
            result = TypeBuilder.generateDoubleType();
        } else {
            result = TypeBuilder.generateIntType();
        }
        return result;
    }
}
