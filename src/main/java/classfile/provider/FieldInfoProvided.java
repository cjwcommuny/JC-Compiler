package classfile.provider;

import classfile.AccessFlag;

import java.util.List;

public interface FieldInfoProvided {
    String getFieldName();
    String getDescriptor();
    List<AccessFlag> getAccessFlags();
}
