package type.typetype;

import type.typetype.Type;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public abstract class BaseType extends Type {
    private static HashSet<String> baseTypes = new HashSet<>(Arrays.asList("int", "bool", "char", "double"));
    private String simpleName;

    public static boolean isBaseType(String typeName) {
        return baseTypes.contains(typeName);
    }

    /**
     * equals when class are the same
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass().getSimpleName());
    }

    public BaseType(String simpleName) {
        this.simpleName = simpleName;
    }

    @Override
    public String visualInfo() {
        return simpleName;
    }

    abstract public org.objectweb.asm.Type getAsmType();
}
