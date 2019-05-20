package classgen;

import classgen.provider.*;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.LinkedList;
import java.util.List;

public class ClassFileGenerator {
    private ClassRaw classRaw;
    private List<OutputClassFile> outputClassFiles = new LinkedList<>();

    public ClassFileGenerator(ClassRaw classRaw) {
        this.classRaw = classRaw;
    }

    public List<OutputClassFile> generateOutputFilesInfo() {
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
        generateMetaInfo(classWriter);
        generateFieldsInfo(classWriter);
        generateInnerClasses(classWriter);
        generateMethodsInfo(classWriter);
        outputClassFiles.add(new OutputClassFile(classWriter.toByteArray(), classRaw.getClassFileName()));
        return outputClassFiles;
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
            case Opcodes.GETSTATIC:
                case Opcodes.PUTSTATIC:
                    case Opcodes.GETFIELD:
                        case Opcodes.PUTFIELD:
                methodVisitor.visitFieldInsn(opcode,
                        (String) arguments[0],
                        (String) arguments[1],
                        (String) arguments[2]);
                break;
            case Opcodes.BIPUSH: case Opcodes.SIPUSH: case Opcodes.NEWARRAY:
                methodVisitor.visitIntInsn(opcode, (int) arguments[0]);
                break;
            case Opcodes.LDC:
                methodVisitor.visitLdcInsn(arguments[0]);
                break;
            case Opcodes.INVOKEVIRTUAL:
                case Opcodes.INVOKESPECIAL:
                    case Opcodes.INVOKESTATIC:
                        case Opcodes.INVOKEINTERFACE:
                methodVisitor.visitMethodInsn(opcode,
                        (String) arguments[0],
                        (String) arguments[1],
                        (String) arguments[2],
                        false);
                break;
            case Opcodes.ILOAD: case Opcodes.LLOAD: case Opcodes.FLOAD: case Opcodes.DLOAD:
                case Opcodes.ALOAD: case Opcodes.ISTORE: case Opcodes.LSTORE: case Opcodes.FSTORE:
                    case Opcodes.DSTORE: case Opcodes.ASTORE: case Opcodes.RET:
                methodVisitor.visitVarInsn(opcode, (int) arguments[0]);
                break;
            case Opcodes.IFEQ: case Opcodes.IFNE: case Opcodes.IFLT: case Opcodes.IFGE:
                case Opcodes.IFGT:  case Opcodes.IFLE:  case Opcodes.IF_ICMPEQ:  case Opcodes.IF_ICMPNE:
                    case Opcodes.IF_ICMPLT:  case Opcodes.IF_ICMPGE:  case Opcodes.IF_ICMPGT: case Opcodes.IF_ICMPLE:
                        case Opcodes.IF_ACMPEQ: case Opcodes.IF_ACMPNE: case Opcodes.GOTO:  case Opcodes.JSR:
                            case Opcodes.IFNULL: case Opcodes.IFNONNULL:
                methodVisitor.visitJumpInsn(opcode, (Label) arguments[0]);
                break;
//            case :
//                methodVisitor.visitJumpInsn();
//                break;
            default:
                if (instruction.isLabel()) {
                    methodVisitor.visitLabel(instruction.getLabel());
                } else {
                    //zero parameter
                    methodVisitor.visitInsn(opcode);
                    break;
                }
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
        this.outputClassFiles.addAll(new ClassFileGenerator(innerClass).generateOutputFilesInfo());
    }
}
