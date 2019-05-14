package classfile.provider;

import classfile.AccessFlag;

import java.util.List;

public interface MethodInfoProvided {
    String getMethodName();
    String getDescriptor();
    List<AccessFlag> getAccessFlags();
}
