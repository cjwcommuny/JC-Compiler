package codegen;

import classgen.provider.CodeInfo;
import classgen.provider.MethodInfo;

public class DefaultMethodInfo implements MethodInfo {
    private String name;
    private int accessFlags;
    private String descriptor;
    private CodeInfo codeInfo;

    public DefaultMethodInfo(String name, int accessFlags, String descriptor, CodeInfo codeInfo) {
        this.name = name;
        this.accessFlags = accessFlags;
        this.descriptor = descriptor;
        this.codeInfo = codeInfo;
    }

    @Override
    public String getMethodName() {
        return null;
    }

    @Override
    public int getAccessFlag() {
        return 0;
    }

    @Override
    public String getDescriptor() {
        return null;
    }

    @Override
    public CodeInfo getCodeInfo() {
        return null;
    }
}
