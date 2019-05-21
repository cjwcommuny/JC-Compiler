package codegen;

import ast.node.HasType;
import ast.node.Node;
import ast.node.definition.ArrayDefinitionNode;
import ast.node.definition.Assignable;
import ast.node.definition.VariableDefinitionNode;
import classgen.provider.*;
import org.objectweb.asm.Opcodes;
import type.typetype.ArrayType;
import type.typetype.ObjectType;
import type.typetype.Type;

import java.util.LinkedList;
import java.util.List;

import static codegen.DefaultFieldInfo.generateFieldInfo;

public class InnerClassInfo implements ClassRaw {
    private String outerClassName;
    private String innerClassName;
    private List<Node> fieldNodes;
    private OuterClassInfo outerClassInfos;

    public InnerClassInfo(String outerClassName, String innerClassName, List<Node> fieldNodes, OuterClassInfo outerClassInfos) {
        this.outerClassName = outerClassName;
        this.innerClassName = innerClassName;
        this.fieldNodes = fieldNodes;
        this.outerClassInfos = outerClassInfos;
    }

    @Override
    public int getClassAccessFlags() {
        return Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;
    }

    @Override
    public String getInternalClassName() {
        return outerClassName + "$" + innerClassName;
    }

    @Override
    public String getSimpleName() {
        return innerClassName;
    }

    @Override
    public String[] getInterfaces() {
        return null;
    }

    @Override
    public List<FieldInfo> getFieldsInfo() {
        List<FieldInfo> fieldInfos = new LinkedList<>();
        for (Node fieldNode: fieldNodes) {
            fieldInfos.add(generateFieldInfo((VariableDefinitionNode) fieldNode, Opcodes.ACC_PUBLIC));
        }
        return fieldInfos;
    }



    @Override
    public List<MethodInfo> getMethodsInfo() {
        List<MethodInfo> result = new LinkedList<>();
        result.add(generateDefaultConstructor());
        return result;
    }

    private MethodInfo generateDefaultConstructor() {
        final int NO_MATTER = 20;
        DefaultCodeInfo codeInfo = new DefaultCodeInfo();
        MethodInfo methodInfo = new DefaultMethodInfo("<init>", Opcodes.ACC_PUBLIC, "()V", codeInfo);
        codeInfo.setMaxLocals(NO_MATTER);
        codeInfo.setMaxStack(NO_MATTER);
        codeInfo.setInstructions(generateDefaultConstructorInstructions());
        return methodInfo;
    }

    private List<InstructionInfo> generateDefaultConstructorInstructions() {
        List<InstructionInfo> result = new LinkedList<>();
        result.addAll(generateSuperClassConstructorInstructions());
        result.addAll(generateFieldInitInstructions());
        result.add(new DefaultInstruction(Opcodes.RETURN, null));
        return result;
    }

    private List<InstructionInfo> generateSuperClassConstructorInstructions() {
        List<InstructionInfo> instructionInfos = new LinkedList<>();
        instructionInfos.add(new DefaultInstruction(Opcodes.ALOAD, new Object[]{0})); //load this pointer to value stack
        instructionInfos.add(new DefaultInstruction(Opcodes.INVOKESPECIAL,
                new Object[]{"java/lang/Object", "<init>", "()V"}));
        return instructionInfos;
    }

    private List<InstructionInfo> generateFieldInitInstructions() {
        List<InstructionInfo> result = new LinkedList<>();
        for (Node node: fieldNodes) {
            HasType definitionNode = (HasType) node;
            Assignable assignable = ((Assignable) node);
            if (assignable.beAssigned()) {
                result.addAll(handleAssignmentInit(assignable, definitionNode.getType()));
            } else if (definitionNode.getType() instanceof ObjectType) {
                result.addAll(generateObjectFieldInitInstruction((VariableDefinitionNode) node));
            } else if (definitionNode.getType() instanceof ArrayType) {
                result.addAll(generateArrayFieldInitInstruction((ArrayDefinitionNode) node));
            }
        }
        return result;
    }

    private List<InstructionInfo> handleAssignmentInit(Assignable node, Type type) {
        String fieldName = node.getVariableName();
        List<InstructionInfo> result = new LinkedList<>();
        result.add(new DefaultInstruction(Opcodes.ALOAD, new Object[]{0})); //load this pointer
        result.addAll(new MethodInstructionGenerator(node.getRightSide(),
                null, outerClassName).generate());
        result.add(new DefaultInstruction(Opcodes.PUTFIELD,
                new Object[]{getInternalClassName(), fieldName, type.getDescriptor()}));
        return result;
    }

    private List<InstructionInfo> generateObjectFieldInitInstruction(VariableDefinitionNode definitionNode) {
        ObjectType type = (ObjectType) definitionNode.getType();
        String fieldName = definitionNode.getVariableName();
        List<InstructionInfo> result = new LinkedList<>();
        result.add(new DefaultInstruction(Opcodes.ALOAD, new Object[]{0})); //load this pointer
        result.add(new DefaultInstruction(Opcodes.NEW, new Object[]{type.getInnerClassInternalName()}));
        result.add(new DefaultInstruction(Opcodes.DUP, null));
        result.add(new DefaultInstruction(Opcodes.INVOKESPECIAL,
                new Object[]{type.getDescriptor(), "<init>", "()V"}));
        result.add(new DefaultInstruction(Opcodes.PUTFIELD,
                new Object[]{getInternalClassName(), fieldName, type.getDescriptor()}));
        return result;
    }


    private List<InstructionInfo> generateArrayFieldInitInstruction(ArrayDefinitionNode definitionNode) {
        //TODO
        return null;
    }

    @Override
    public List<ClassRaw> getInnerClasses() {
        return new LinkedList<>();
    }

    @Override
    public String getClassFileName() {
        return getInternalClassName();
    }

    @Override
    public OuterClassInfo getOuterClassesInfo() {
        return outerClassInfos;
    }
}
