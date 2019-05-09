package type;

public class ArrayType extends Type {
    private Type componentType;
    private int dimension;

    @Override
    public String generateFieldDescriptor() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dimension; ++i) {
            sb.append("[");
        }
        sb.append(componentType.generateFieldDescriptor());
        return sb.toString();
    }

    public ArrayType(Type componentType, int dimension) {
        this.componentType = componentType;
        this.dimension = dimension;
    }
}
