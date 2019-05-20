package classgen.provider;

import org.objectweb.asm.Opcodes;

import java.util.List;

public interface ClassRaw {
    default int getClassVersion() {
        return Opcodes.V1_6; //Java 1.5
    }

    int getClassAccessFlags();
    String getInternalClassName();
    String getSimpleName();

    default String getInternalSuperClassName() {
        return "java/lang/Object";
    }

    /**
     * for generics
     * */
    default String getSignature() {

        return null;
    }

    String[] getInterfaces();

    List<FieldInfo> getFieldsInfo();
    List<MethodInfo> getMethodsInfo();
    List<ClassRaw> getInnerClasses();
}
