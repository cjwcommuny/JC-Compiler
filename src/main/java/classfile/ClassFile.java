package classfile;

import classfile.constantpool.ConstantPoolInfo;
import classfile.constantpool.ConstantUtf8Info;
import classfile.provider.ClassFileComponentProvider;

import java.util.ArrayList;
import java.util.List;

public class ClassFile {
    private static int magic = 0xCAFEBABE; //u4
    private int minorVersion = 0; //u2
    private int majorVersion = 7; //u2
    private int constantPoolCount; //u2
    private List<ConstantPoolInfo> constantPool;
    private AccessFlag accessFlag; //u2, public
    private int thisClass; //u2, class name
    private int superClass; //u2, java/lang/Object
    private int interfacesCount; //u2
    private List<Integer> interfaces = new ArrayList<>();
    private int fieldsCount; //u2
    private List<FieldInfo> fields = new ArrayList<>();
    private int methodsCount;//u2
    private List<MethodInfo> methods = new ArrayList<>();
    private int attributesCount;//u2
    private List<AttributeInfo> attributes = new ArrayList<>();

    private ClassFileComponentProvider provider;

    public ClassFile(ClassFileComponentProvider provider) {
        this.provider = provider;
    }

    private int getConstantPoolCount() {
        return constantPool.size();
    }

    private int getInterfacesCount() {
        return interfaces.size();
    }

    private int getFieldsCount() {
        return fields.size();
    }

    private int getMethodsCount() {
        return methods.size();
    }

    private int getAttributesCount() {
        return attributes.size();
    }

    private ConstantUtf8Info generateConstantUtf8Info(String str) {

    }

}


