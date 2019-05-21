package type.typetype;

import java.util.List;
import java.util.Objects;

public class FunctionType extends Type {
    private List<Type> parameterTypes;
    private Type returnType;

    public static String mainFunctionDescriptor = "([Ljava/lang/String;)V";

    @Override
    public String getDescriptor() {
        return "(" + generateParameterDescriptor() + ")" + returnType.getDescriptor();
    }

    private String generateParameterDescriptor() {
        StringBuilder sb = new StringBuilder();
        for (Type type: parameterTypes) {
            sb.append(type.getDescriptor());
        }
        return sb.toString();
    }

    @Override
    public org.objectweb.asm.Type getAsmType() {
        return org.objectweb.asm.Type.getObjectType(getDescriptor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FunctionType that = (FunctionType) o;
        return Objects.equals(parameterTypes, that.parameterTypes) &&
                Objects.equals(returnType, that.returnType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameterTypes, returnType);
    }

    FunctionType(List<Type> parameterTypes, Type returnType) {
        this.parameterTypes = parameterTypes;
        this.returnType = returnType;
    }

    public List<Type> getParameterTypes() {
        return parameterTypes;
    }

    public Type getReturnType() {
        return returnType;
    }

    @Override
    public String visualInfo() {
        return "FunctionDef: (" + generateVisualParameterRepresentations() + ") -> " + returnType.visualInfo();
    }

    private String generateVisualParameterRepresentations() {
        StringBuilder sb = new StringBuilder();
        for (Type type: parameterTypes) {
            sb.append(type.visualInfo());
            sb.append(", ");
        }
        int len = sb.length();
        if (parameterTypes.size() > 0) {
            sb.delete(len - 2, len);
        }
        return sb.toString();
    }

    @Override
    public Object generateDefaultValue() {
        return null;
    }
}
