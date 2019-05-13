package type;


import error.exception.TypeMismatchException;
import operation.Operation;
import type.typetype.*;

import java.util.List;

public class TypeCheckerAndInference {

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
            case "<": case ">": case ">=": case "<=": case "==":
                return checkCompareExpression(type1, type2);
            case "||": case "&&":
                return checkBoolExpression(type1, type2);
            default:
                return null;//TODO: error handling
        }
    }

    private static Type checkAddition(Type type1, Type type2) {
        //TODO: support String
        if (type1.equals(TypeBuilder.generateIntType())
                && type2.equals(TypeBuilder.generateIntType())) {
            return TypeBuilder.generateIntType();
        } else if ((type1.equals(TypeBuilder.generateIntType()) && type2.equals(TypeBuilder.generateDoubleType()))
                || (type1.equals(TypeBuilder.generateDoubleType()) && type2.equals(TypeBuilder.generateIntType()))
                || (type1.equals(TypeBuilder.generateDoubleType()) && type2.equals(TypeBuilder.generateDoubleType()))) {
            return TypeBuilder.generateDoubleType();
        } else {
            //type match error

            return null;
        }
    }

    private static Type checkSubtraction(Type type1, Type type2) {
        //TODO support char
        return checkAddition(type1, type2);
    }

    private static Type checkMultiplication(Type type1, Type type2) {
        //TODO: support String * int
        return checkAddition(type1, type2);
    }

    private static Type checkDivision(Type type1, Type type2) {
        return checkAddition(type1, type2);
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
        if (!parameterTypes.equals(argumentTypes)) {
            return null;
        }
        return functionType.getReturnType();
    }

    //other operation: XOR and so on

    public static boolean checkAssignment(Type type1, Type type2) {
        return type1.equals(type2);
    }

    public static boolean checkConditionValue(Type type) {
        return type instanceof BoolType;
    }

}
