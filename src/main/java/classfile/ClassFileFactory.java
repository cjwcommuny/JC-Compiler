package classfile;

import classfile.attribute.AttributeInfo;
import classfile.constantpool.ConstantClassInfo;
import classfile.constantpool.ConstantPoolInfo;
import classfile.constantpool.ConstantUtf8Info;
import classfile.provider.ClassFileComponentProvider;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class ClassFileFactory {
    private ClassFileComponentProvider provider;
    private List<ConstantPoolInfo> constantPool = new ArrayList<>();
    private Map<ConstantPoolInfo, Integer> constantPoolIndexer = new HashMap<>();
    private List<Integer> interfaces = new ArrayList<>();
    private List<FieldInfo> fields = new ArrayList<>();
    private List<MethodInfo> methods = new ArrayList<>();
    private List<AttributeInfo> attributes = new ArrayList<>();
    private ClassFile classFile = new ClassFile();


    public ClassFileFactory(ClassFileComponentProvider provider) {
        this.provider = provider;
    }

    private ConstantUtf8Info generateConstantUtf8Info(String str) {
        ByteBuffer byteBuffer = StandardCharsets.UTF_8.encode(str);
        byte[] bytes = byteBuffer.array();
        return new ConstantUtf8Info(bytes.length, bytes);
    }

    public ClassFile generateClassFile() {
        generateClassMetaInfo();

        return classFile;
    }

    private void generateClassMetaInfo() {
        String className = provider.getFullRestrictClassName();
        String superClassName = provider.getFullRestrictSuperClassName();
        classFile.setThisClass(generateConstantClassInfo(className));
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
        ConstantUtf8Info utf8Info = generateConstantUtf8Info(str);
        int index = getNextConstantPoolIndex();
        constantPool.add(utf8Info);
        constantPoolIndexer.put(utf8Info, index);
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
}
