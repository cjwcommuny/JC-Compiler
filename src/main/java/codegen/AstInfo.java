package codegen;

import ast.node.Node;
import ast.node.ParameterListNode;
import ast.node.StatementListNode;
import ast.node.definition.FunctionDefinitionNode;
import ast.node.definition.StructureDefinitionNode;
import ast.node.definition.VariableDefinitionNode;
import classgen.provider.*;
import org.objectweb.asm.Opcodes;
import type.typetype.DoubleType;
import type.typetype.Type;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class AstInfo implements ClassRaw {
    private Node ast;
    private String simpleClassName;
    private List<FunctionDefinitionNode> functionNodes;
    private List<StructureDefinitionNode> structNodes; //TODO
    private List<VariableDefinitionNode> fieldNodes;

    public AstInfo(Node ast) {
        this.ast = ast;
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
            fieldInfos.add(generateFieldInfo(fieldNode));
        }
        return fieldInfos;
    }

    private FieldInfo generateFieldInfo(VariableDefinitionNode fieldNode) {
        String fieldName = fieldNode.getVariableName();
        Type type = fieldNode.getType();
        String descriptor = type.generateDescriptor();
        int accessFlags = Opcodes.ACC_STATIC + Opcodes.ACC_PUBLIC;
        Object value = fieldNode.getValue();
        return new DefaultFieldInfo(fieldName, descriptor, accessFlags, value);
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
        DefaultCodeInfo codeInfo = new DefaultCodeInfo();
        Map<Integer, Integer> localIndexRemap = generateLocalIndexer(codeInfo, functionNode);
        List<InstructionInfo> instructions = generateInstructions(localIndexRemap,
                functionNode.getStatementListNode());
        codeInfo.setInstructions(instructions);
        return codeInfo;
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
        for (Node statement: statementListNode.getChildren()) {
            List<InstructionInfo> partInstructions =
                    new MethodInstructionGenerator(statement, localIndexRemap).generate();
            instructions.addAll(partInstructions);
        }
        return instructions;
    }

    @Override
    public List<ClassRaw> getInnerClasses() {
        return null;
    }
}
