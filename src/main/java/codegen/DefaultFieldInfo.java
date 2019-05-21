package codegen;

import ast.node.definition.VariableDefinitionNode;
import classgen.provider.FieldInfo;
import org.objectweb.asm.Opcodes;
import type.typetype.Type;

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

    public static FieldInfo generateFieldInfo(VariableDefinitionNode fieldNode) {
        String fieldName = fieldNode.getVariableName();
        Type type = fieldNode.getType();
        String descriptor = type.generateDescriptor();
        int accessFlags = Opcodes.ACC_STATIC + Opcodes.ACC_PUBLIC;
        Object value = fieldNode.getValue();
        return new DefaultFieldInfo(fieldName, descriptor, accessFlags, value);
    }
}
