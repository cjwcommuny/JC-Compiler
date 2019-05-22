package type;


import ast.node.HasType;
import ast.node.Node;
import operation.Operation;
import type.typetype.*;

import java.util.List;

public class TypeChecker {

    public static Type checkInfixComputation(Operation operation, Type type1, Type type2) {
        switch (operation.toString()) {
            case "+":
                return checkAddition(type1, type2);
            case "-":
                return checkSubtraction(type1, type2);
            case "*":
                return checkMultiplication(type1, type2);
            case "/":
                return checkDivision(type1, type2);
            case "<": case ">": case ">=": case "<=": case "==": case "!=":
                return checkCompareExpression(type1, type2);
            case "||": case "&&":
                return checkBoolExpression(type1, type2);
            default:
                return null;//TODO: error handling
        }
    }

    private static Type checkAddition(Type type1, Type type2) {
        //TODO: support String
        return checkIntDoubleExpression(type1, type2);
    }

    private static Type checkIntDoubleExpression(Type type1, Type type2) {
        boolean bothInt = type1.equals(TypeBuilder.generateIntType())
                && type2.equals(TypeBuilder.generateIntType());
        boolean oneIntOneDouble = (type1.equals(TypeBuilder.generateIntType())
                && type2.equals(TypeBuilder.generateDoubleType()))
                || (type1.equals(TypeBuilder.generateDoubleType())
                && type2.equals(TypeBuilder.generateIntType()))
                || (type1.equals(TypeBuilder.generateDoubleType())
                && type2.equals(TypeBuilder.generateDoubleType()));
        if (bothInt) {
            return TypeBuilder.generateIntType();
        } else if (oneIntOneDouble) {
            return TypeBuilder.generateDoubleType();
        } else {
            //type match error
            return null;
        }
    }

    private static Type checkSubtraction(Type type1, Type type2) {
        //TODO support char
        return checkIntDoubleExpression(type1, type2);
    }

    private static Type checkMultiplication(Type type1, Type type2) {
        //TODO: support String * int
        return checkIntDoubleExpression(type1, type2);
    }

    private static Type checkDivision(Type type1, Type type2) {
        return checkIntDoubleExpression(type1, type2);
    }

    private static Type checkBoolExpression(Type type1, Type type2) {
        if (type1.equals(TypeBuilder.generateBoolType()) && type2.equals(TypeBuilder.generateBoolType())) {
            return TypeBuilder.generateBoolType();
        } else {
            return null;
        }
    }

    private static Type checkCompareExpression(Type type1, Type type2) {
        Type result = checkAddition(type1, type2);
        if (result == null) {
            return null;
        } else {
            return TypeBuilder.generateBoolType();
        }
    }

    public static Type checkUnaryComputation(Operation operation, Type type) {
        switch (operation.toString()) {
            case "-":
                return checkNegative(type);
            case "!":
                return checkNotExpression(type);
            default:
                return null;
        }
    }

    private static Type checkNotExpression(Type type) {
        return type.equals(TypeBuilder.generateBoolType()) ? TypeBuilder.generateBoolType() : null;
    }

    private static Type checkNegative(Type type) {
        if (type.equals(TypeBuilder.generateIntType()) || type.equals(TypeBuilder.generateDoubleType())) {
            return type;
        } else {
            return null;
        }
    }

    public static Type checkArrayIndex(Type arrayType, Type indexType) {
        if (arrayType instanceof ArrayType && indexType.equals(TypeBuilder.generateIntType())) {
            return ((ArrayType) arrayType).extractComponentType();
        } else {
            return null;
        }
    }

    public static Type checkFunctionParameter(FunctionType functionType,
                                                 List<Type> argumentTypes) {
        List<Type> parameterTypes = functionType.getParameterTypes();
        if (argumentTypes.size() != parameterTypes.size()) {
            return null;
        }
        for (int i = 0; i < argumentTypes.size(); ++i) {
            Type parameterType = parameterTypes.get(i);
            Type argumentType = argumentTypes.get(i);
            if (!(parameterType instanceof AnyType) && !canBeConverted(argumentType, parameterType)) {
                return null;
            }
        }
        return functionType.getReturnType();
    }

    //other operation: XOR and so on

    public static boolean checkAssignment(Type type1, Type type2) {
        return canBeConverted(type2, type1);
    }

    public static boolean checkConditionValue(Type type) {
        return type instanceof BoolType;
    }

    public static boolean areEquivalentType(Type type1, Type type2) {
        return type1.getClass() == type2.getClass();
    }

    public static Type checkArrayInit(List<Node> nodes) {
        Type resultType = ((HasType) nodes.get(0)).getType();
        for (Node node: nodes) {
            HasType hasType = (HasType) node;
            Type type = hasType.getType();
            if (!areCompatible(type, resultType)) {
                return null;
            }
            resultType = Type.getLowestUpperType(type, resultType);
        }
        return TypeBuilder.generateArrayType(resultType, 1);
    }

    private static boolean canBeConverted(Type convertFrom, Type convertTo) {
        if (convertFrom.equals(convertTo)) {
            return true;
        }
        if (convertFrom instanceof IntType && convertTo instanceof DoubleType) {
            return true;
        }
        return false;
    }

    private static boolean areCompatible(Type type1, Type type2) {
        return canBeConverted(type1, type2) || canBeConverted(type2, type1);
    }
}
