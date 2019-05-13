package classfile.provider;

import java.util.List;

public interface ClassFileComponentProvider {
    List<MethodInfoProvided> getAllMethodsInfo();
    List<FieldInfoProvided> getAllFieldsInfo();
    String getFullRestrictClassName();

}
