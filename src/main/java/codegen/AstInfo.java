package codegen;

import ast.node.Node;
import ast.node.ParameterListNode;
import ast.node.StatementListNode;
import ast.node.StructFieldListNode;
import ast.node.definition.FunctionDefinitionNode;
import ast.node.definition.StructureDefinitionNode;
import ast.node.definition.VariableDefinitionNode;
import classgen.provider.*;
import com.sun.org.apache.bcel.internal.generic.IRETURN;
import org.objectweb.asm.Opcodes;
import type.typetype.BaseType;
import type.typetype.DoubleType;
import type.typetype.Type;
import type.typetype.VoidType;

import java.util.*;
import java.util.function.Function;

import static codegen.DefaultFieldInfo.generateFieldInfo;

public class AstInfo implements ClassRaw {
    private Node ast;
    private String simpleClassName;
    private List<FunctionDefinitionNode> functionNodes;
    private List<StructureDefinitionNode> structNodes; //TODO
    private List<VariableDefinitionNode> fieldNodes;

    public AstInfo(Node ast, String simpleClassName, List<FunctionDefinitionNode> functionNodes, List<StructureDefinitionNode> structNodes, List<VariableDefinitionNode> fieldNodes) {
        this.ast = ast;
        this.simpleClassName = simpleClassName;
        this.functionNodes = functionNodes;
        this.structNodes = structNodes;
        this.fieldNodes = fieldNodes;
    }

    @Override
    public int getClassAccessFlags() {
        return Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER;
    }

    @Override
    public String getInternalClassName() {
        return simpleClassName;
    }

    @Override
    public String getSimpleName() {
        return simpleClassName;
    }

    @Override
    public String[] getInterfaces() {
        return null;
    }

    @Override
    public List<FieldInfo> getFieldsInfo() {
        List<FieldInfo> fieldInfos = new LinkedList<>();
        for (VariableDefinitionNode fieldNode: fieldNodes) {
            fieldInfos.add(generateFieldInfo(fieldNode, Opcodes.ACC_STATIC + Opcodes.ACC_PUBLIC));
        }
        return fieldInfos;
    }

    @Override
    public List<MethodInfo> getMethodsInfo() {
        List<MethodInfo> methodInfos = new LinkedList<>();
        for (FunctionDefinitionNode functionDefinitionNode: functionNodes) {
            methodInfos.add(generateMethodInfo(functionDefinitionNode));
        }
        return methodInfos;
    }

    private MethodInfo generateMethodInfo(FunctionDefinitionNode functionNode) {
        String name = functionNode.getFunctionName();
        Type type = functionNode.getType();
        String descriptor = type.generateDescriptor();
        int accessFlags = Opcodes.ACC_STATIC + Opcodes.ACC_PUBLIC;
        CodeInfo codeInfo = generateCodeInfo(functionNode);
        return new DefaultMethodInfo(name, accessFlags, descriptor, codeInfo);
    }

    private CodeInfo generateCodeInfo(FunctionDefinitionNode functionNode) {
        final int NOT_MATTER = 20;
        DefaultCodeInfo codeInfo = new DefaultCodeInfo();
        codeInfo.setMaxStack(NOT_MATTER); // ASM lib will generate it automatically
        Map<Integer, Integer> localIndexRemap = generateLocalIndexer(codeInfo, functionNode);
        List<InstructionInfo> instructions = generateInstructions(localIndexRemap,
                functionNode.getStatementListNode());
        generateReturnAtEnd(functionNode, instructions);
        codeInfo.setInstructions(instructions);
        return codeInfo;
    }

    private void generateReturnAtEnd(FunctionDefinitionNode functionNode, List<InstructionInfo> instructions) {
        //add a return statement at the end of the code
        Type returnType = functionNode.getReturnType();
        if (returnType instanceof VoidType) {
            instructions.add(new DefaultInstruction(Opcodes.RETURN, null));
        } else if (returnType instanceof BaseType) {
            org.objectweb.asm.Type type = ((BaseType) returnType).getAsmType();
            instructions.add(new DefaultInstruction(type.getOpcode(Opcodes.IRETURN), null));
        } else {
            //object type
            instructions.add(new DefaultInstruction(Opcodes.ACONST_NULL, null));
            instructions.add(new DefaultInstruction(Opcodes.ARETURN, null));
        }
    }

    private Map<Integer, Integer> generateLocalIndexer(DefaultCodeInfo codeInfo,
                                                       FunctionDefinitionNode functionNode) {
        List<Type> localTypeList = functionNode.getLocalTypeList();
        //map variable index in FunctionDefinitionNode to JVM locals index
        Map<Integer, Integer> indexMap = new HashMap<>();
        int NextJvmLocalIndex = 0;
        for (int i = 0; i < localTypeList.size(); ++i) {
            Type type = localTypeList.get(i);
            indexMap.put(i, NextJvmLocalIndex);
            if (type instanceof DoubleType) {
                NextJvmLocalIndex += 2;
            } else {
                NextJvmLocalIndex += 1;
            }
        }
        codeInfo.setMaxLocals(NextJvmLocalIndex);
        return indexMap;
    }

    private List<InstructionInfo> generateInstructions(Map<Integer, Integer> localIndexRemap,
                                                       StatementListNode statementListNode) {
        List<InstructionInfo> instructions = new LinkedList<>();
        for (Node statementNode: statementListNode.getChildren()) {
            List<InstructionInfo> partInstructions =
                    new MethodInstructionGenerator(statementNode, localIndexRemap, simpleClassName).generate();
            instructions.addAll(partInstructions);
        }
        return instructions;
    }

    @Override
    public List<ClassRaw> getInnerClasses() {
        List<ClassRaw> classRaws = new LinkedList<>();
        for (StructureDefinitionNode node: structNodes) {
            classRaws.add(generateInnerClass(node));
        }
        return classRaws;
    }

    private ClassRaw generateInnerClass(StructureDefinitionNode structNode) {
        List<Node> variableNodes = structNode.getStructFieldListNode().getVariableDefinitionNodes();
        OuterClassInfo outerClassInfo = generateThisClassAsOuterClassInfo(structNode.getStructName());
        InnerClassInfo innerClassInfo =
                new InnerClassInfo(getInternalClassName(), structNode.getStructName(), variableNodes, outerClassInfo);
        return innerClassInfo;
    }

    private OuterClassInfo generateThisClassAsOuterClassInfo(String innerClassName) {
        return new DefaultOuterClassInfo(getInternalClassName(), null, null);
    }

    @Override
    public String getClassFileName() {
        return getSimpleName();
    }

    @Override
    public OuterClassInfo getOuterClassesInfo() {
        return null;
    }
}
