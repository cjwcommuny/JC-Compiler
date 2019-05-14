package classfile;

import classfile.attribute.AttributeInfo;
import classfile.constantpool.ConstantPoolInfo;
import classfile.constantpool.ConstantUtf8Info;
import classfile.provider.ClassFileComponentProvider;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ClassFile {
    private static int magic = 0xCAFEBABE; //u4
    private int minorVersion = 0; //u2
    private int majorVersion = 7; //u2
//    private int constantPoolCount; //u2
    private List<ConstantPoolInfo> constantPool;
    private int accessFlag; //u2, public
    private int thisClass; //u2, class name
    private int superClass; //u2, java/lang/Object
//    private int interfacesCount; //u2
    private List<Integer> interfaces;
//    private int fieldsCount; //u2
    private List<FieldInfo> fields;
//    private int methodsCount;//u2
    private List<MethodInfo> methods;
//    private int attributesCount;//u2
    private List<AttributeInfo> attributes;


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

    ClassFile() {
    }

    void setThisClass(int thisClass) {
        this.thisClass = thisClass;
    }

    void setSuperClass(int superClass) {
        this.superClass = superClass;
    }

    public void setConstantPool(List<ConstantPoolInfo> constantPool) {
        this.constantPool = constantPool;
//        this.constantPoolCount = constantPool.size();
    }

    public void setAccessFlag(int accessFlag) {
        this.accessFlag = accessFlag;
    }

    public void setInterfaces(List<Integer> interfaces) {
        this.interfaces = interfaces;
//        this.interfacesCount = interfaces.size();
    }

    public void setFields(List<FieldInfo> fields) {
        this.fields = fields;
//        this.fieldsCount = fields.size();
    }

    public void setMethods(List<MethodInfo> methods) {
        this.methods = methods;
//        this.methodsCount = methods.size();
    }

    public void setAttributes(List<AttributeInfo> attributes) {
        this.attributes = attributes;
//        this.attributesCount = attributes.size();
    }
}


