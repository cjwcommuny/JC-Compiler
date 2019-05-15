package classfile.provider;

import classfile.AccessFlag;

import java.util.List;

public interface ClassInfoProvided {
    String getClassName();
    List<AccessFlag> getAccessFlags();
}
