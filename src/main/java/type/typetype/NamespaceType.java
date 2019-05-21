package type.typetype;

import java.util.LinkedList;
import java.util.Objects;

public class NamespaceType extends Type {
    private ObjectType objectType;

    NamespaceType(String namespaceName) {
        this.objectType = TypeBuilder.generateObjectType(namespaceName, new LinkedList<>());
    }

    @Override
    public String getDescriptor() {
        return objectType.getDescriptor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NamespaceType that = (NamespaceType) o;
        return Objects.equals(objectType, that.objectType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectType);
    }

    @Override
    public String visualInfo() {
        return objectType.visualInfo();
    }

    @Override
    public Object generateDefaultValue() {
        return null;
    }

    @Override
    public org.objectweb.asm.Type getAsmType() {
        return org.objectweb.asm.Type.getObjectType(getDescriptor());
    }
}
