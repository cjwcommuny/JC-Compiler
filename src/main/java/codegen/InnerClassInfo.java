package codegen;

import classgen.provider.ClassRaw;
import classgen.provider.FieldInfo;
import classgen.provider.MethodInfo;

import java.util.List;

public class InnerClassInfo implements ClassRaw {
    @Override
    public int getClassAccessFlags() {
        return 0;
    }

    @Override
    public String getInternalClassName() {
        return null;
    }

    @Override
    public String getSimpleName() {
        return null;
    }

    @Override
    public String[] getInterfaces() {
        return new String[0];
    }

    @Override
    public List<FieldInfo> getFieldsInfo() {
        return null;
    }

    @Override
    public List<MethodInfo> getMethodsInfo() {
        return null;
    }

    @Override
    public List<ClassRaw> getInnerClasses() {
        return null;
    }

    @Override
    public String getClassFileName() {

    }
}
