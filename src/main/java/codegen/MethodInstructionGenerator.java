package codegen;

import ast.node.*;
import ast.node.definition.ArrayDefinitionNode;
import ast.node.definition.VariableDefinitionNode;
import ast.node.reference.RefNode;
import ast.node.reference.StructRefNode;
import ast.node.reference.VariableNameNode;
import ast.node.structrue.ForBlockNode;
import ast.node.structrue.LogicBlockNode;
import ast.node.structrue.WhileBlockNode;
import classgen.provider.InstructionInfo;
import jdk.internal.org.objectweb.asm.Opcodes;
import symbol.InitSymbolImporter;
import type.typetype.ArrayType;
import type.typetype.BaseType;
import type.typetype.ObjectType;
import type.typetype.Type;

import java.util.Arrays;
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
        if (statementNode instanceof ArrayDefinitionNode) {
            return handleArrayDefinition((ArrayDefinitionNode) statementNode);
        } else if (statementNode instanceof VariableDefinitionNode) {
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
        } else if (statementNode instanceof AssignmentNode) {
            return handleAssignment((AssignmentNode) statementNode);
        } else if (statementNode instanceof StructRefNode) {
            return null;
        } else if (statementNode instanceof ContinueNode) {
            return null;
        } else if (statementNode instanceof BreakNode) {
            return null;
        } else if (statementNode instanceof VariableNameNode) {
            return handleVariableName((VariableNameNode) statementNode);
        }
        else {
            return null;
        }
    }

    private List<InstructionInfo> handleArrayDefinition(ArrayDefinitionNode node) {
        List<InstructionInfo> instructions = new LinkedList<>();
        int localIndex = localIndexRemap.get(node.getLocalIndex());
        Object[] storeArguments = new Object[]{localIndex};
        int constOpcode = Opcodes.ACONST_NULL;
        int storeOpcode = Opcodes.ALOAD;
        if (node.beAssigned()) {
            List<InstructionInfo> rightSideInstructions = new MethodInstructionGenerator(node.getRightSide(),
                    localIndexRemap, namespaceName).generate();
            instructions.addAll(rightSideInstructions);
        } else {
            instructions.add(new DefaultInstruction(constOpcode, storeArguments));
        }
        instructions.add(new DefaultInstruction(storeOpcode, storeArguments)); //store value to local variable
        return instructions;
    }

    private List<InstructionInfo> handleVariableName(VariableNameNode node) {
        List<InstructionInfo> instructions = new LinkedList<>();
        int localIndex = localIndexRemap.get(((VariableDefinitionNode) node.getReference()).getLocalIndex());
        org.objectweb.asm.Type asmType = node.getType().getAsmType();
        int opcode = asmType.getOpcode(Opcodes.ILOAD);
        instructions.add(new DefaultInstruction(opcode, new Object[]{localIndex}));
        return instructions;
    }

    private List<InstructionInfo> handleAssignment(AssignmentNode node) {
        List<InstructionInfo> result = new LinkedList<>();
        Node leftNode = node.getLeftNode();
        Node rightNode = node.getRightNode();

        //right side
        List<InstructionInfo> rightSideInstruction = new MethodInstructionGenerator(rightNode,
                localIndexRemap, namespaceName).generate();

        //left side
        if (leftNode instanceof VariableNameNode) {
            VariableNameNode variableNameNode = (VariableNameNode) leftNode;
            int localIndex = ((VariableDefinitionNode) variableNameNode.getReference()).getLocalIndex();
            org.objectweb.asm.Type asmType = variableNameNode.getType().getAsmType();
            result.addAll(rightSideInstruction);
            result.add(new DefaultInstruction(asmType.getOpcode(Opcodes.ISTORE), new Object[]{localIndex}));
        } else if (leftNode instanceof StructRefNode) {
            StructRefNode structRefNode = (StructRefNode) leftNode;
            Node objectNode = structRefNode.getLeftSideNode();
            RefNode fieldNode = structRefNode.getRightSideNode();
            String classInternalName = ((HasType) objectNode).getType().generateDescriptor();
            String fieldName = fieldNode.getName();
            String fieldDescriptor = fieldNode.getType().generateDescriptor();
            result.addAll(new MethodInstructionGenerator(objectNode,
                    localIndexRemap, namespaceName).generate());//push objectRef to ValueStack
            result.addAll(rightSideInstruction);
            result.add(new DefaultInstruction(Opcodes.PUTFIELD, new String[]{classInternalName, fieldName, fieldDescriptor}));
        } else {
            //TODO: array index node
        }
        return result;
    }

//    private List<InstructionInfo> handleStructRefAsLeftSide()

    private List<InstructionInfo> handleVariableDefinitionNode(VariableDefinitionNode node) {
        List<InstructionInfo> instructions = new LinkedList<>();
        int localIndex = localIndexRemap.get(node.getLocalIndex());
        Type type = node.getType();
        Object[] storeArguments = new Object[]{localIndex};
        int storeOpcode;
        int constOpcode;
        if (type instanceof ObjectType) {
            storeOpcode = Opcodes.ASTORE;
            constOpcode = Opcodes.ACONST_NULL;
        } else if (type instanceof BaseType) {
            org.objectweb.asm.Type asmType = ((BaseType) type).getAsmType();
            storeOpcode = asmType.getOpcode(Opcodes.ISTORE);
            constOpcode = asmType.getOpcode(Opcodes.ICONST_0);
        } else {
            //error
            storeOpcode = 0;
            constOpcode = 0;
        }
        if (node.beAssigned()) {
            List<InstructionInfo> rightSideInstructions = new MethodInstructionGenerator(node.getRightSide(),
                    localIndexRemap, namespaceName).generate();
            instructions.addAll(rightSideInstructions);
        } else {
            instructions.add(new DefaultInstruction(constOpcode, storeArguments));
        }
        instructions.add(new DefaultInstruction(storeOpcode, storeArguments));
        return instructions;
    }

    private List<InstructionInfo> handleReturnStatement(ReturnNode node) {
        List<InstructionInfo> instructions = new LinkedList<>();
        if (node.isReturnSomething()) {
            Type type = node.getType();
            List<InstructionInfo> returnValueInstructions = new MethodInstructionGenerator(node.getReturnValueNode(), localIndexRemap, namespaceName).generate();
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
        //TODO: handle
        String methodName = node.getFunctionName();
        List<InstructionInfo> result = new LinkedList<>();
        ArgumentListNode arguments = node.getArguments();
        if (InitSymbolImporter.printFunctionName.equals(methodName)) {
            result.addAll(handlePrintFunction(arguments));
        } else {
            String className = namespaceName;
            String descriptor = node.getType().generateDescriptor();
            for (Node argument: arguments.getChildren()) {
                List<InstructionInfo> argumentInstructions = new MethodInstructionGenerator(argument,
                        localIndexRemap,
                        namespaceName).generate();
                result.addAll(argumentInstructions);
            }
            InstructionInfo instruction = new DefaultInstruction(Opcodes.INVOKESTATIC, new Object[]{className,
                    methodName,
                    descriptor});
            result.add(instruction);
        }
        return result;
    }

    private List<InstructionInfo> handlePrintFunction(ArgumentListNode arguments) {
        List<InstructionInfo> result = new LinkedList<>();
        Object[] printStreamInstructionArguments = new Object[]{"java/lang/System",
                "out",
                "Ljava/io/PrintStream;"
        };
        List<InstructionInfo> argumentInstruction = new MethodInstructionGenerator(arguments.getChild(0),
                localIndexRemap, namespaceName).generate();
        result.addAll(argumentInstruction);
        result.add(new DefaultInstruction(Opcodes.GETSTATIC, printStreamInstructionArguments));
        Object[] printInstructionArguments = new Object[]{"java/io/PrintStream",
                "print",
                "(Ljava/lang/String;)V"};
        result.add(new DefaultInstruction(Opcodes.INVOKEVIRTUAL, printInstructionArguments));
        return result;
    }
}
