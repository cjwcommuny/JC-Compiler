package type;

public class ObjectType extends Type {
    private String fullRestrictClassName;

    @Override
    public String generateFieldDescriptor() {
        return "L" + fullRestrictClassName + ";";
    }
}
