package classfile.provider;

import classfile.AccessFlag;

import java.util.List;

public interface ClassComponentProvider {
    List<MethodInfoProvided> getAllMethodsInfo();
    List<FieldInfoProvided> getAllFieldsInfo();
    String getFullRestrictClassName();
    String getFullRestrictSuperClassName();
    List<AccessFlag> getClassAccessFlags();
    List<ClassInfoProvided> getAllInnerClasses();
}
