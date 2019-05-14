package classfile.provider;

import classfile.AccessFlag;

import java.util.List;

public interface ClassFileComponentProvider {
    List<MethodInfoProvided> getAllMethodsInfo();
    List<FieldInfoProvided> getAllFieldsInfo();
    String getFullRestrictClassName();
    String getFullRestrictSuperClassName();
    List<AccessFlag> getClassAccessFlags();
}
