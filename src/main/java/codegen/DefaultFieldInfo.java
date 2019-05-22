package codegen;

import ast.node.definition.VariableDefinitionNode;
import classgen.provider.FieldInfo;
import type.typetype.DoubleType;
import type.typetype.Type;

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

    public static FieldInfo generateFieldInfo(VariableDefinitionNode fieldNode, int accessFlags) {
        String fieldName = fieldNode.getVariableName();
        Type type = fieldNode.getType();
        String descriptor = type.getDescriptor();
        Object value = fieldNode.getLiteralValue();
        if (type instanceof DoubleType && value instanceof Integer) {
            value = (double) ((Integer) value).intValue();
        }
        return new DefaultFieldInfo(fieldName, descriptor, accessFlags, value);
    }
}
