package codegen;

import ast.node.*;
import ast.node.definition.ArrayDefinitionNode;
import ast.node.definition.Assignable;
import ast.node.definition.VariableDefinitionNode;
import ast.node.reference.RefNode;
import ast.node.reference.StructRefNode;
import ast.node.reference.VariableNameNode;
import ast.node.structrue.*;
import ast.node.value.InfixExpressionNode;
import ast.node.value.UnaryExpressionNode;
import classgen.provider.InstructionInfo;
import common.CommonInfrastructure;
import jdk.internal.org.objectweb.asm.Opcodes;
import operation.InfixOperation;
import operation.Operation;
import operation.UnaryOperation;
import org.objectweb.asm.Label;
import symbol.InitSymbolImporter;
import type.typetype.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MethodInstructionGenerator {
    private Node statementNode;
    private Map<Integer, Integer> localIndexRemap;
    private String namespaceName;
    private Label loopLabel;
    private Label endLabel;

    public MethodInstructionGenerator(Node statementNode,
                                      Map<Integer, Integer> localIndexRemap,
                                      String namespaceName) {
        this.statementNode = statementNode;
        this.localIndexRemap = localIndexRemap;
        this.namespaceName = namespaceName;
    }

    public MethodInstructionGenerator(Node statementNode,
                                      Map<Integer, Integer> localIndexRemap,
                                      String namespaceName,
                                      Label loopLabel,
                                      Label endLabel) {
        this.statementNode = statementNode;
        this.localIndexRemap = localIndexRemap;
        this.namespaceName = namespaceName;
        this.loopLabel = loopLabel;
        this.endLabel = endLabel;
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
            return handleLogicBlock((LogicBlockNode) statementNode);
        } else if (statementNode instanceof ForBlockNode) {
            return handleForBlock((ForBlockNode) statementNode);
        } else if (statementNode instanceof WhileBlockNode) {
            return handleWhileBlock((WhileBlockNode) statementNode);
        } else if (statementNode instanceof AssignmentNode) {
            return handleAssignment((AssignmentNode) statementNode);
        } else if (statementNode instanceof StructRefNode) {
            return handleStructRefNode((StructRefNode) statementNode);
        } else if (statementNode instanceof ContinueNode) {
            return handleContinueStatement((ContinueNode) statementNode, loopLabel);
        } else if (statementNode instanceof BreakNode) {
            return handleBreakStatement((BreakNode) statementNode, endLabel);
        } else if (statementNode instanceof VariableNameNode) {
            return handleVariableName((VariableNameNode) statementNode);
        } else if (statementNode instanceof LiteralNode) {
            return handleLiteral((LiteralNode) statementNode);
        } else if (statementNode instanceof InfixExpressionNode) {
            return handleInfixExpression((InfixExpressionNode) statementNode);
        } else if (statementNode instanceof UnaryExpressionNode) {
            return handleUnaryExpression((UnaryExpressionNode) statementNode);
        } else if (statementNode instanceof StatementListNode) {
            return handleStatementListNode((StatementListNode) statementNode);
        }
        else {
            return null;
        }
    }

    private List<InstructionInfo> handleStructRefNode(StructRefNode structRefNode) {
        return null;//TODO
    }

    private List<InstructionInfo> handleBreakStatement(BreakNode breakNode, Label endLabel) {
        List<InstructionInfo> result = new LinkedList<>();
        result.add(new DefaultInstruction(Opcodes.GOTO, new Object[]{endLabel}));
        return result;
    }

    private List<InstructionInfo> handleContinueStatement(ContinueNode continueNode, Label loopLabel) {
        List<InstructionInfo> result = new LinkedList<>();
        result.add(new DefaultInstruction(Opcodes.GOTO, new Object[]{loopLabel}));
        return result;
    }

    private List<InstructionInfo> handleWhileBlock(WhileBlockNode whileBlockNode) {
        List<InstructionInfo> result = new LinkedList<>();
        Label loopLabel = new Label();
        result.add(new DefaultInstruction(loopLabel));
        result.addAll(new MethodInstructionGenerator(whileBlockNode.getConditionNode(),
                localIndexRemap, namespaceName).generate());
        Label endLabel = new Label();
        result.add(new DefaultInstruction(Opcodes.IFEQ, new Object[]{endLabel}));
        result.addAll(new MethodInstructionGenerator(whileBlockNode.getBlockCode(),
                localIndexRemap, namespaceName, loopLabel, endLabel).generate());
        result.add(new DefaultInstruction(Opcodes.GOTO, new Object[]{loopLabel}));
        result.add(new DefaultInstruction(endLabel));
        return result;
    }

    private List<InstructionInfo> handleForBlock(ForBlockNode forLoopNode) {
        List<InstructionInfo> result = new LinkedList<>();
        result.addAll(new MethodInstructionGenerator(forLoopNode.getInitConditionNode(),
                localIndexRemap, namespaceName).generate());
        Label loopLabel = new Label();
        result.add(new DefaultInstruction(loopLabel));
        result.addAll(new MethodInstructionGenerator(forLoopNode.getTerminateConditionNode(),
                localIndexRemap, namespaceName).generate());
        Label endLabel = new Label();
        result.add(new DefaultInstruction(Opcodes.IFEQ, new Object[]{endLabel}));
        result.addAll(new MethodInstructionGenerator(forLoopNode.getBlockBodyNode(),
                localIndexRemap, namespaceName, loopLabel, endLabel).generate());
        result.addAll(new MethodInstructionGenerator(forLoopNode.getStepConditionNode(),
                localIndexRemap, namespaceName).generate());
        result.add(new DefaultInstruction(Opcodes.GOTO, new Object[]{loopLabel}));
        result.add(new DefaultInstruction(endLabel));
        return result;
    }

    private List<InstructionInfo> handleStatementListNode(StatementListNode statementListNode) {
        List<InstructionInfo> result = new LinkedList<>();
        for (Node node: statementListNode.getStatements()) {
            result.addAll(new MethodInstructionGenerator(node, localIndexRemap, namespaceName, this.loopLabel, this.endLabel).generate());
        }
        return result;
    }

    private List<InstructionInfo> handleLogicBlock(LogicBlockNode node) {
        List<InstructionInfo> result = new LinkedList<>();
        IfNode ifNode = node.getIfNode();
        List<ElseIfNode> elseIfNodes = node.getElseIfNodes();
        ElseNode elseNode = node.getElseNode();
        Label endLabel = new Label();
        result.addAll(handleIfNode(ifNode, endLabel));
        result.addAll(handleElseIfNodes(elseIfNodes, endLabel));
        if (elseNode != null) {
            result.addAll(handleElseNode(elseNode, endLabel));
        }
        result.add(new DefaultInstruction(endLabel));
        return result;
    }

    private List<InstructionInfo> handleIfNode(IfNode ifNode, Label endLabel) {
        return handleGeneralIfStructure(ifNode.getCondition(), ifNode.getStatementListNode(), endLabel);
    }

    private List<InstructionInfo> handleElseIfNodes(List<ElseIfNode> elseIfNodes, Label endLabel) {
        List<InstructionInfo> result = new LinkedList<>();
        for (ElseIfNode elseIfNode: elseIfNodes) {
            result.addAll(handleElseIfNode(elseIfNode, endLabel));
        }
        return result;
    }

    private List<InstructionInfo> handleGeneralIfStructure(Node conditionNode, Node statementListNode, Label endLabel) {
        List<InstructionInfo> result = new LinkedList<>();
        result.addAll(new MethodInstructionGenerator(conditionNode, localIndexRemap, namespaceName).generate());
        Label elseLabel = new Label();
        result.add(new DefaultInstruction(Opcodes.IFEQ, new Object[]{elseLabel}));
        result.addAll(new MethodInstructionGenerator(statementListNode,
                localIndexRemap,
                namespaceName, this.loopLabel, this.endLabel).generate());
        result.add(new DefaultInstruction(Opcodes.GOTO, new Object[]{endLabel}));
        result.add(new DefaultInstruction(elseLabel));
        return result;
    }

    private List<InstructionInfo> handleElseIfNode(ElseIfNode elseIfNode, Label endLabel) {
        return handleGeneralIfStructure(elseIfNode.getCondition(), elseIfNode.getStatementListNode(), endLabel);
    }

    private List<InstructionInfo> handleElseNode(ElseNode elseNode, Label endLabel) {
        return new MethodInstructionGenerator(elseNode.getStatementListNode(),
                localIndexRemap, namespaceName, this.loopLabel, this.endLabel).generate();
    }

    private List<InstructionInfo> handleInfixExpression(InfixExpressionNode node) {
        List<InstructionInfo> result = new LinkedList<>();
        Operation op = node.getOperation();
        Node leftNode = node.getLeftSide();
        Node rightNode = node.getRightSide();
        Type type1 = ((HasType) leftNode).getType();
        Type type2 = ((HasType) rightNode).getType();
        Type resultType = node.getType();

        //left-side value
        List<InstructionInfo> leftSideInstructions = new MethodInstructionGenerator(leftNode,
                localIndexRemap,
                namespaceName).generate();
        result.addAll(leftSideInstructions);

        //adjust left value
        result.addAll(adjustLeftValue(type1, resultType, op));

        //right-side value
        List<InstructionInfo> rightSideInstructions = new MethodInstructionGenerator(rightNode,
                localIndexRemap,
                namespaceName).generate();
        result.addAll(rightSideInstructions);

        //adjust right value
        result.addAll(adjustRightValue(type2, resultType, op));

        //operation instruction
        org.objectweb.asm.Type asmType = Type.getLowestUpperType(type1, type2).getAsmType();
        result.addAll(handleInfixOperation(op, asmType));
        return result;
    }

    private List<InstructionInfo> handleInfixOperation(Operation op, org.objectweb.asm.Type operatorAsmType) {
        List<InstructionInfo> result = new LinkedList<>();
        if (op.equals(InfixOperation.ADD)) {
            result.add(new DefaultInstruction(operatorAsmType.getOpcode(Opcodes.IADD), null));
        } else if (op.equals(InfixOperation.SUB)) {
            result.add(new DefaultInstruction(operatorAsmType.getOpcode(Opcodes.ISUB), null));
        } else if (op.equals(InfixOperation.MUL)) {
            result.add(new DefaultInstruction(operatorAsmType.getOpcode(Opcodes.IMUL), null));
        } else if (op.equals(InfixOperation.DIV)) {
            result.add(new DefaultInstruction(operatorAsmType.getOpcode(Opcodes.IDIV), null));
        } else if (op.equals(InfixOperation.AND)) {
            result.add(new DefaultInstruction(Opcodes.IAND, null));
        } else if (op.equals(InfixOperation.OR)) {
            result.add(new DefaultInstruction(Opcodes.IOR, null));
        }
        result.addAll(handleCompareExpression(op, operatorAsmType));
        return result;
    }

    private List<InstructionInfo> handleCompareExpression(Operation op, org.objectweb.asm.Type compareAsmType) {
        List<InstructionInfo> result = new LinkedList<>();
        boolean isBoolExpression = op.equals(InfixOperation.EQUAL)
                || op.equals(InfixOperation.GREATER)
                || op.equals(InfixOperation.LESS)
                || op.equals(InfixOperation.GREATER_EQUAL)
                || op.equals(InfixOperation.LESS_EQUAL)
                || op.equals(InfixOperation.NOT_EQUAL);
        if (!isBoolExpression) {
            return result;
        }
        if (compareAsmType.equals(org.objectweb.asm.Type.DOUBLE_TYPE)) {
            //firstly compare double and generate int value
            result.add(new DefaultInstruction(Opcodes.DCMPG, null));
            result.add(new DefaultInstruction(Opcodes.ICONST_0, null));
        }
        Label label1 = new Label();
        Object[] branchLabel1Argument = new Object[]{label1};
        if (op.equals(InfixOperation.EQUAL)) {
            result.add(new DefaultInstruction(compareAsmType.getOpcode(Opcodes.IF_ICMPNE), branchLabel1Argument));
        } else if (op.equals(InfixOperation.GREATER)) {
            result.add(new DefaultInstruction(compareAsmType.getOpcode(Opcodes.IF_ICMPLE), branchLabel1Argument));
        } else if (op.equals(InfixOperation.LESS)) {
            result.add(new DefaultInstruction(compareAsmType.getOpcode(Opcodes.IF_ICMPGE), branchLabel1Argument));
        } else if (op.equals(InfixOperation.GREATER_EQUAL)) {
            result.add(new DefaultInstruction(compareAsmType.getOpcode(Opcodes.IF_ICMPLT), branchLabel1Argument));
        } else if (op.equals(InfixOperation.LESS_EQUAL)) {
            result.add(new DefaultInstruction(compareAsmType.getOpcode(Opcodes.IF_ICMPGT), branchLabel1Argument));
        } else if (op.equals(InfixOperation.NOT_EQUAL)) {
            result.add(new DefaultInstruction(compareAsmType.getOpcode(Opcodes.IF_ICMPEQ), branchLabel1Argument));
        }
        result.add(new DefaultInstruction(Opcodes.ICONST_1, null));
        Label label2 = new Label();
        result.add(new DefaultInstruction(Opcodes.GOTO, new Object[]{label2}));
        result.add(new DefaultInstruction(label1));
        result.add(new DefaultInstruction(Opcodes.ICONST_0, null));
        result.add(new DefaultInstruction(label2));
        return result;
    }

    private List<InstructionInfo> adjustLeftValue(Type leftType, Type resultType, Operation op)  {
        List<InstructionInfo> result = new LinkedList<>();
        if (op.equals(InfixOperation.AND) || op.equals(InfixOperation.OR)) {
            return result;
        }
        if (resultType.equals(TypeBuilder.generateDoubleType())
                && leftType.equals(TypeBuilder.generateIntType())) {
            InstructionInfo instructionInfo = new DefaultInstruction(Opcodes.I2D, null);
            result.add(instructionInfo);
        }
        return result;
    }

    private List<InstructionInfo> adjustRightValue(Type rightType, Type resultType, Operation op)  {
        return adjustLeftValue(rightType, resultType, op);
    }


    private List<InstructionInfo> handleUnaryExpression(UnaryExpressionNode node) {
        List<InstructionInfo> result = new LinkedList<>();
        Operation operation = node.getOperation();
        Node valueNode = node.getValueNode();
        List<InstructionInfo> loadInstructions = new MethodInstructionGenerator(valueNode,
                localIndexRemap,
                namespaceName).generate();
        result.addAll(loadInstructions);

        org.objectweb.asm.Type asmType = ((HasType) valueNode).getType().getAsmType();
        if (operation.equals(UnaryOperation.NOT)) {
            result.add(new DefaultInstruction(Opcodes.ICONST_0, null));
            Label label1 = new Label();
            result.add(new DefaultInstruction(asmType.getOpcode(Opcodes.IF_ICMPEQ), new Object[]{label1}));
            result.add(new DefaultInstruction(Opcodes.ICONST_0, null));
            Label label2 = new Label();
            result.add(new DefaultInstruction(Opcodes.GOTO, new Object[]{label2}));
            result.add(new DefaultInstruction(label1));
            result.add(new DefaultInstruction(Opcodes.ICONST_1, null));
            result.add(new DefaultInstruction(label2));
        } else if (operation == UnaryOperation.NEGATIVE) {
            int opcode = asmType.getOpcode(Opcodes.INEG);
            result.add(opcode, null);
        } else {
            //error
        }
        return result;
    }

    private List<InstructionInfo> handleLiteral(LiteralNode statementNode) {
        List<InstructionInfo> result = new LinkedList<>();
        int opcode = Opcodes.LDC;
        Object value = statementNode.getValue();
        if (value instanceof String) {
            value = ((String) value).replace("\\n", "\n");
        }
        InstructionInfo instructionInfo = new DefaultInstruction(opcode, new Object[]{value});
        result.add(instructionInfo);
        return result;
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
        if (node.beAssigned()) {
            if (type instanceof BaseType) {
                instructions.addAll(handleBaseTypeDefinitionWithAssignment(node, localIndex));
            } else {
                instructions.addAll(handleObjectDefinitionWithAssignment(node, localIndex));
            }
        } else {
            if (type instanceof BaseType) {
                instructions.addAll(handleBaseTypeDefinitionWithoutAssignment(node, localIndex));
            } else {
                instructions.addAll(handleObjectDefinitionWithoutAssignment(node, localIndex));
            }
        }
        return instructions;
    }

    private List<InstructionInfo> handleBaseTypeDefinitionWithoutAssignment(VariableDefinitionNode node, int localIndex) {
        List<InstructionInfo> result = new LinkedList<>();
        Type type = node.getType();
        org.objectweb.asm.Type asmType = type.getAsmType();
        result.add(new DefaultInstruction(asmType.getOpcode(Opcodes.ICONST_0), null));
        result.add(new DefaultInstruction(asmType.getOpcode(Opcodes.ISTORE), new Object[]{localIndex}));
        return result;
    }

    private List<InstructionInfo> handleBaseTypeDefinitionWithAssignment(VariableDefinitionNode node, int localIndex) {
        List<InstructionInfo> result = new LinkedList<>();
        Type type = node.getType();
        org.objectweb.asm.Type asmType = type.getAsmType();
        result.addAll(new MethodInstructionGenerator(node.getRightSide(),
                localIndexRemap, namespaceName).generate());
        result.add(new DefaultInstruction(asmType.getOpcode(Opcodes.ISTORE), new Object[]{localIndex}));
        return result;
    }

    private List<InstructionInfo> handleObjectDefinitionWithoutAssignment(VariableDefinitionNode node, int localIndex) {
        List<InstructionInfo> result = new LinkedList<>();
        Type type = node.getType();
        result.add(new DefaultInstruction(Opcodes.NEW, new Object[]{type.generateDescriptor()}));
        result.add(new DefaultInstruction(Opcodes.DUP, null));
        result.add(new DefaultInstruction(Opcodes.INVOKESPECIAL,
                new Object[]{type.generateDescriptor(), "<init>", "()V"}));
        result.add(new DefaultInstruction(Opcodes.ASTORE, new Object[]{localIndex}));
        return result;
    }

    private List<InstructionInfo> handleObjectDefinitionWithAssignment(VariableDefinitionNode node, int localIndex) {
        List<InstructionInfo> result = new LinkedList<>();
        result.addAll(new MethodInstructionGenerator(node.getRightSide(),
                localIndexRemap, namespaceName).generate());
        result.add(new DefaultInstruction(Opcodes.ASTORE, new Object[]{localIndex}));
        return result;
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
            String descriptor = node.getFunctionType().generateDescriptor();
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
        Node argumentNode = arguments.getChild(0);
        Type argumentType = ((HasType) argumentNode).getType();
        List<InstructionInfo> argumentInstruction = new MethodInstructionGenerator(argumentNode,
                localIndexRemap, namespaceName).generate();
        result.add(new DefaultInstruction(Opcodes.GETSTATIC, printStreamInstructionArguments));
        result.addAll(argumentInstruction);
        result.add(generatePrintInstruction(argumentType));
        return result;
    }

    private InstructionInfo generatePrintInstruction(Type argumentType) {
        String functionDescriptor = "(" + argumentType.generateDescriptor() + ")V";
        Object[] printInstructionArguments = new Object[]{"java/io/PrintStream",
                "print",
                functionDescriptor};
        return new DefaultInstruction(Opcodes.INVOKEVIRTUAL, printInstructionArguments);
    }
}
