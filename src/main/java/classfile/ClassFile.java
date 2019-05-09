package classfile;

import java.util.ArrayList;
import java.util.List;

public class ClassFile {
    private static int magic = 0xCAFEBABE;
    private int minorVersion = 0;
    private int majorVersion = 8;
    private int constantPoolCount;
    private ConstantPool<ConstantInfo> constantPool;
    private AccessFlag accessFlag;
    private int thisClass;
    private int superClass;
    private int interfacesCount;
    private List<Integer> interfaces = new ArrayList<>();
    private int fieldsCount;
    private List<FieldInfo> fields = new ArrayList<>();
    private int methodsCount;
    private List<MethodInfo> methods = new ArrayList<>();
    private int attributesCount;
    private List<AttributeInfo> attributes = new ArrayList<>();

}


