package classgen.provider;

public interface FieldInfo {
    int getAccessFlags();
    String getFieldName();
    String getDescriptor();

    default String getSignature() {
        return null;
    }

    Object getValue();
}
