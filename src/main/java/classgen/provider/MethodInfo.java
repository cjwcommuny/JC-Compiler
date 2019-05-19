package classgen.provider;

import ast.node.ParameterListNode;

public interface MethodInfo {
    String getMethodName();
    int getAccessFlag();
    String getDescriptor();
    default String getSignature() {
        return null;
    }
    default String[] getExceptions() {
        return null;
    }
    CodeInfo getCodeInfo();
}
