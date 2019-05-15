package classfile;

import classfile.attribute.AttributeInfo;
import classfile.attribute.InnerClassesAttribute;
import classfile.attribute.MethodParametersAttribute;
import classfile.constantpool.ConstantClassInfo;
import classfile.constantpool.ConstantPoolInfo;
import classfile.constantpool.ConstantUtf8Info;
import classfile.provider.*;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ClassFileFactory {
    private ClassComponentProvider provider;
    private List<ConstantPoolInfo> constantPool = new ArrayList<>();
    private List<Integer> interfaces = new ArrayList<>();
    private List<FieldInfo> fields = new ArrayList<>();
    private List<MethodInfo> methods = new ArrayList<>();
    private List<AttributeInfo> attributes = new ArrayList<>();
    private ClassFile classFile = new ClassFile();
    private int thisClassIndex;

    private Map<String, Integer> constantStringIndexer = new HashMap<>();
    private Map<ConstantPoolInfo, Integer> constantPoolIndexer = new HashMap<>();


    public ClassFileFactory(ClassComponentProvider provider) {
        this.provider = provider;
    }

    private ConstantUtf8Info generateConstantUtf8Info(String str) {
        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(str);
        byte[] bytes = byteBuffer.array();
        return new ConstantUtf8Info(bytes.length, bytes);
    }

    public ClassFile generateClassFile() {
        //TODO
        generateClassMetaInfo();
        generateClassAccessFlag();
        generateFieldInfo();
        generateMethodInfo();
        generateClassAttributes();
        generateConstantPool();
        return classFile;
    }

    private void generateConstantPool() {
        classFile.setConstantPool(constantPool);
    }

    private void generateClassMetaInfo() {
        String className = provider.getFullRestrictClassName();
        String superClassName = provider.getFullRestrictSuperClassName();
        this.thisClassIndex = generateConstantClassInfo(className);
        classFile.setThisClass(thisClassIndex);
        classFile.setSuperClass(generateConstantClassInfo(superClassName));
    }

    private int generateConstantClassInfo(String fullRestrictClassName) {
        int utf8InfoIndex = addConstantUtf8Info(fullRestrictClassName);
        ConstantClassInfo classInfo = new ConstantClassInfo(utf8InfoIndex);
        int classInfoIndex = getNextConstantPoolIndex();
        constantPool.add(classInfo);
        constantPoolIndexer.put(classInfo, classInfoIndex);
        return classInfoIndex;
    }

    private int getNextConstantPoolIndex() {
        return constantPool.size();
    }

    private int addConstantUtf8Info(String str) {
        int index;
        if (constantStringIndexer.containsKey(str)) {
            index = constantStringIndexer.get(str);
        } else {
            ConstantUtf8Info utf8Info = generateConstantUtf8Info(str);
            index = getNextConstantPoolIndex();
            constantPool.add(utf8Info);
            constantPoolIndexer.put(utf8Info, index);
            constantStringIndexer.put(str, index);
        }
        return index;
    }

    private int generateAccessFlag(List<AccessFlag> accessFlags) {
        //TODO
        int result = 0;
        for (AccessFlag flag: accessFlags) {
            result &= flag.value();
        }
        return result;
    }

    private void generateClassAccessFlag() {
        int index = generateAccessFlag(provider.getClassAccessFlags());
        classFile.setAccessFlag(index);
    }

    private void generateFieldInfo() {
        List<FieldInfoProvided> fieldsInfo = provider.getAllFieldsInfo();
        List<FieldInfo> fieldInfos = new LinkedList<>();
        for (FieldInfoProvided fieldProvided: fieldsInfo) {
            FieldInfo fieldInfo = generateFieldInfo(fieldProvided);
            fieldInfos.add(fieldInfo);
        }
        classFile.setFields(fieldInfos);
    }

    private FieldInfo generateFieldInfo(FieldInfoProvided fieldProvided) {
        int accessFlags = generateAccessFlag(fieldProvided.getAccessFlags());
        int nameIndex = addConstantUtf8Info(fieldProvided.getFieldName());
        int descriptorIndex = addConstantUtf8Info(fieldProvided.getTypeDescriptor());
        List<AttributeInfo> attributeInfos = new LinkedList<>();
        /*
        * TODO: attributeInfos
        * ConstantValue
        *
        * */
        return new FieldInfo(accessFlags, nameIndex, descriptorIndex, attributeInfos);
    }

    private void generateMethodInfo() {
        List<MethodInfo> methodInfos = new LinkedList<>();
        for (MethodInfoProvided methodProvided: provider.getAllMethodsInfo()) {
            MethodInfo methodInfo = generateMethodInfo(methodProvided);
            methodInfos.add(methodInfo);
        }
        classFile.setMethods(methods);
    }

    private MethodInfo generateMethodInfo(MethodInfoProvided methodProvided) {
        int accessFlags = generateAccessFlag(methodProvided.getAccessFlags());
        int nameIndex = addConstantUtf8Info(methodProvided.getMethodName());
        int descriptorIndex = addConstantUtf8Info(methodProvided.getDescriptor());
        List<AttributeInfo> attributeInfos = new LinkedList<>();
        List<ParameterInfoProvided> parametersProvided = methodProvided.getParameterInfoProvided();
        attributeInfos.add(generateMethodParametersAttribute(parametersProvided));
        /*
        * TODO: attributeInfos
        *
        *
        * */
        return new MethodInfo(accessFlags, nameIndex, descriptorIndex, attributeInfos);
    }

    private MethodParametersAttribute generateMethodParametersAttribute(
            List<ParameterInfoProvided> parametersProvided) {
        int attributeNameIndex = addConstantUtf8Info("MethodParameters");
        List<MethodParametersAttribute.ParameterInfo> parameterInfos = new LinkedList<>();
        for (ParameterInfoProvided parameterProvided: parametersProvided) {
            MethodParametersAttribute.ParameterInfo parameterInfo = generateParameterInfo(parameterProvided);
            parameterInfos.add(parameterInfo);
        }
        return new MethodParametersAttribute(attributeNameIndex, parameterInfos);
    }

    private MethodParametersAttribute.ParameterInfo generateParameterInfo(ParameterInfoProvided parameterProvided) {
        int index = addConstantUtf8Info(parameterProvided.getName());
        int accessFlags = generateAccessFlag(parameterProvided.getAccessFlags());
        return new MethodParametersAttribute.ParameterInfo(index, accessFlags);
    }

    private void generateClassAttributes() {
        List<AttributeInfo> attributes = new LinkedList<>();
        attributes.add(generateInnerClassesAttribute(provider.getAllInnerClasses()));
        classFile.setAttributes(attributes);
    }

    private InnerClassesAttribute generateInnerClassesAttribute(List<ClassInfoProvided> classesInfoProvided) {
         int nameIndex = addConstantUtf8Info("InnerClasses");
         List<InnerClassesAttribute.InnerClassInfo> innerClasses = new LinkedList<>();
         for (ClassInfoProvided innerClass: classesInfoProvided) {
             InnerClassesAttribute.InnerClassInfo innerClassInfo = generateInnerClassInfo(innerClass);
             innerClasses.add(innerClassInfo);
         }
         return new InnerClassesAttribute(nameIndex, innerClasses);
    }

    private InnerClassesAttribute.InnerClassInfo generateInnerClassInfo(ClassInfoProvided innerClass) {
        int nameIndex = addConstantUtf8Info(innerClass.getClassName());
        int accessFlags = generateAccessFlag(innerClass.getAccessFlags());
        int outerClassIndex = thisClassIndex;
        int innerClassIndex = generateConstantClassInfo(innerClass.getClassName());
        return new InnerClassesAttribute.InnerClassInfo(innerClassIndex, outerClassIndex, nameIndex, accessFlags);
    }
}
