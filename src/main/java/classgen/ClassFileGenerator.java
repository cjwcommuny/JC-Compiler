package classgen;

import classgen.provider.*;
import jdk.internal.org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;

import java.util.List;

public class ClassFileGenerator {
    private ClassRaw classRaw;

    public ClassFileGenerator(ClassRaw classRaw) {
        this.classRaw = classRaw;
    }

    public byte[] generateByteArray() {
        ClassWriter classWriter = new ClassWriter(0);
        generateMetaInfo(classWriter);
        generateFieldsInfo(classWriter);
        generateInnerClasses(classWriter);
        //TODO
        return classWriter.toByteArray();
    }

    private void generateMetaInfo(ClassWriter classWriter) {
        classWriter.visit(
                classRaw.getClassVersion(),
                classRaw.getClassAccessFlags(),
                classRaw.getInternalClassName(),
                classRaw.getSignature(),
                classRaw.getInternalSuperClassName(),
                classRaw.getInterfaces());
    }

    private void generateFieldsInfo(ClassWriter classWriter) {
        List<FieldInfo> fieldsInfo = classRaw.getFieldsInfo();
        for (FieldInfo fieldInfo: fieldsInfo) {
            generateFieldInfo(classWriter, fieldInfo);
        }
    }

    private void generateFieldInfo(ClassWriter classWriter, FieldInfo fieldInfo) {
        classWriter.visitField(
                fieldInfo.getAccessFlags(),
                fieldInfo.getFieldName(),
                fieldInfo.getDescriptor(),
                fieldInfo.getSignature(),
                fieldInfo.getValue()).visitEnd();
    }

    private void generateMethodsInfo(ClassWriter classWriter) {
        List<MethodInfo> methodInfos = classRaw.getMethodsInfo();
        for (MethodInfo methodInfo: methodInfos) {
            generateMethodInfo(classWriter, methodInfo);
        }
    }

    private void generateMethodInfo(ClassWriter classWriter, MethodInfo methodInfo) {
        MethodVisitor methodVisitor = classWriter.visitMethod(
                methodInfo.getAccessFlag(),
                methodInfo.getMethodName(),
                methodInfo.getDescriptor(),
                methodInfo.getSignature(),
                methodInfo.getExceptions());
        generateMethodCodeInfo(methodVisitor, methodInfo.getCodeInfo());
        methodVisitor.visitEnd();
    }

    private void generateMethodCodeInfo(MethodVisitor methodVisitor, CodeInfo codeInfo) {
        List<InstructionInfo> instructions = codeInfo.getInstructions();
        for (InstructionInfo instruction: instructions) {
            generateInstruction(methodVisitor, instruction);
        }
        methodVisitor.visitMaxs(codeInfo.getMaxStack(), codeInfo.getMaxLocals());
    }

    private void generateInstruction(MethodVisitor methodVisitor, InstructionInfo instruction) {
        Object[] arguments = instruction.getArguments();
        int opcode = instruction.getOpcode();
        switch (opcode) {
            //TODO
        }
    }

    private void generateInnerClasses(ClassWriter classWriter) {
        List<ClassRaw> innerClasses = classRaw.getInnerClasses();
        for (ClassRaw innerClass: innerClasses) {
            generateInnerClass(classWriter, innerClass);
        }
    }

    private void generateInnerClass(ClassWriter classWriter, ClassRaw innerClass) {
        classWriter.visitInnerClass(
                innerClass.getInternalClassName(),
                classRaw.getInternalClassName(),
                innerClass.getSimpleName(),
                innerClass.getClassAccessFlags());
    }
}
