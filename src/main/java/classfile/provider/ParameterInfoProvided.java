package classfile.provider;

import classfile.AccessFlag;

import java.util.List;

public interface ParameterInfoProvided {
    String getName();
    List<AccessFlag> getAccessFlags();
}
