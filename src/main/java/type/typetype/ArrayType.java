package type.typetype;

import java.util.Objects;

public class ArrayType extends Type {
    private Type componentType;
    private int dimension;

    @Override
    public String generateDescriptor() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dimension; ++i) {
            sb.append("[");
        }
        sb.append(componentType.generateDescriptor());
        return sb.toString();
    }

    @Override
    public Object generateDefaultValue() {
        return null;
    }

    ArrayType(Type componentType, int dimension) {
        this.componentType = componentType;
        this.dimension = dimension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayType arrayType = (ArrayType) o;
        return dimension == arrayType.dimension &&
                Objects.equals(componentType, arrayType.componentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentType, dimension);
    }

    public Type extractComponentType() {
        return componentType;
    }

}
