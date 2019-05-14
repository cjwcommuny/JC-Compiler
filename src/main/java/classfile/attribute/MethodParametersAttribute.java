package classfile.attribute;

import java.util.List;

public class MethodParametersAttribute extends AttributeInfo {
    private List<ParameterInfo> parameters;

    public MethodParametersAttribute(int attributeNameIndex, List<ParameterInfo> parameters) {
        super(attributeNameIndex);
        this.parameters = parameters;
    }

    public int getParametersCount() {
        return parameters.size();
    }

    public static class ParameterInfo {
        private int nameIndex;
        private int accessFlags;

        public ParameterInfo(int nameIndex, int accessFlags) {
            this.nameIndex = nameIndex;
            this.accessFlags = accessFlags;
        }
    }
}
