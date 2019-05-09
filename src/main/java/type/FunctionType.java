package type;

import java.util.List;

public class FunctionType extends Type {
    private List<Type> parameterTypes;
    private Type returnType;

    @Override
    public String generateFieldDescriptor() {
        return "(" + generateParameterDescriptor() + ")" + returnType.generateFieldDescriptor();
    }

    private String generateParameterDescriptor() {
        StringBuilder sb = new StringBuilder();
        for (Type type: parameterTypes) {
            sb.append(type.generateFieldDescriptor());
        }
        return sb.toString();
    }

    public FunctionType(List<Type> parameterTypes, Type returnType) {
        this.parameterTypes = parameterTypes;
        this.returnType = returnType;
    }
}
