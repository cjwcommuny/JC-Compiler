package codegen;

import ast.node.FunctionCallNode;
import ast.node.Node;
import ast.node.ReturnNode;
import ast.node.definition.VariableDefinitionNode;
import ast.node.structrue.ForBlockNode;
import ast.node.structrue.LogicBlockNode;
import ast.node.structrue.WhileBlockNode;
import classgen.provider.InstructionInfo;
import jdk.internal.org.objectweb.asm.Opcodes;
import type.typetype.ArrayType;
import type.typetype.BaseType;
import type.typetype.ObjectType;
import type.typetype.Type;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MethodInstructionGenerator {
    private Node statementNode;
    private Map<Integer, Integer> localIndexRemap;
    private String namespaceName;

    public MethodInstructionGenerator(Node statementNode,
                                      Map<Integer, Integer> localIndexRemap,
                                      String namespaceName) {
        this.statementNode = statementNode;
        this.localIndexRemap = localIndexRemap;
        this.namespaceName = namespaceName;
    }

    public List<InstructionInfo> generate() {
        if (statementNode instanceof VariableDefinitionNode) {
            return handleVariableDefinitionNode((VariableDefinitionNode) statementNode);
        } else if (statementNode instanceof FunctionCallNode) {
            return handleFunctionCall((FunctionCallNode) statementNode);
        } else if (statementNode instanceof ReturnNode) {
            return handleReturnStatement((ReturnNode) statementNode);
        } else if (statementNode instanceof LogicBlockNode) {
            return null;
        } else if (statementNode instanceof ForBlockNode) {
            return null;
        } else if (statementNode instanceof WhileBlockNode) {
            return null;
        } else {
            return null;
        }
    }

    private List<InstructionInfo> handleVariableDefinitionNode(VariableDefinitionNode node) {
        List<InstructionInfo> instructions = new LinkedList<>();
        int localIndex = localIndexRemap.get(node.getLocalIndex());
        List<Object> storeArguments = new LinkedList<>();
        storeArguments.add(localIndex);
        Type type = node.getType();
        int loadOpcode;
        int constOpcode;
        if (type instanceof ObjectType) {
            loadOpcode = Opcodes.ASTORE;
            constOpcode = Opcodes.ACONST_NULL;
        } else if (type instanceof BaseType) {
            org.objectweb.asm.Type asmType = ((BaseType) type).getAsmType();
            loadOpcode = asmType.getOpcode(Opcodes.ISTORE);
            constOpcode = asmType.getOpcode(Opcodes.ICONST_0);
        } else {
            //error
            loadOpcode = 0;
            constOpcode = 0;
        }
        if (node.beAssigned()) {
            List<InstructionInfo> rightSideInstructions = new MethodInstructionGenerator(node.getRightSide(),
                    localIndexRemap).generate();
            instructions.addAll(rightSideInstructions);
        } else {
            instructions.add(new DefaultInstruction(constOpcode, storeArguments));
        }
        instructions.add(new DefaultInstruction(loadOpcode, storeArguments));
        return instructions;
    }

    private List<InstructionInfo> handleReturnStatement(ReturnNode node) {
        List<InstructionInfo> instructions = new LinkedList<>();
        if (node.isReturnSomething()) {
            Type type = node.getType();
            List<InstructionInfo> returnValueInstructions = new MethodInstructionGenerator(node.getReturnValueNode(),
                    localIndexRemap).generate();
            instructions.addAll(returnValueInstructions);
            int returnOpcode;
            if (type instanceof ObjectType || type instanceof ArrayType) {
                returnOpcode = Opcodes.ARETURN;
            } else {
                //baseType
                returnOpcode = ((BaseType) type).getAsmType().getOpcode(Opcodes.IRETURN);
            }
            instructions.add(new DefaultInstruction(returnOpcode, null));
        } else {
            instructions.add(new DefaultInstruction(Opcodes.RETURN, null));
        }
        return instructions;
    }

    private List<InstructionInfo> handleFunctionCall(FunctionCallNode node) {
        String methodName = node.getFunctionName();
        String className = namespaceName;
        String descriptor = node.getType().generateDescriptor();

    }
}
