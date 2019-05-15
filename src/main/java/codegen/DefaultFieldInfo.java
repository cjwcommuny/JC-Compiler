package codegen;

import classgen.provider.FieldInfo;

import java.util.List;

public class DefaultFieldInfo implements FieldInfo {
    private String fieldName;
    private String descriptor;
    private int accessFlags;
    private Object value;

    public DefaultFieldInfo(String fieldName, String descriptor, int accessFlags, Object value) {
        this.fieldName = fieldName;
        this.descriptor = descriptor;
        this.accessFlags = accessFlags;
        this.value = value;
    }

    @Override
    public int getAccessFlags() {
        return accessFlags;
    }

    @Override
    public String getFieldName() {
        return fieldName;
    }

    @Override
    public String getDescriptor() {
        return descriptor;
    }

    @Override
    public Object getValue() {
        return value;
    }
}
