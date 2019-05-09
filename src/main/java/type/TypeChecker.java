package type;


import java.util.List;

public class TypeChecker {

    public static String checkInfixComputation(String operation, String type1, String type2) {
        switch (operation) {
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

    private static String checkAddition(String type1, String type2) {
        //TODO: support String
//        if (type1.equals(Type.INT) && type2.equals(Type.INT)) {
//            return Type.INT;
//        } else if ((type1.equals(Type.INT) && type2.equals(Type.DOUBLE))
//                || (type1.equals(Type.DOUBLE) && type2.equals(Type.INT))
//                || (type1.equals(Type.DOUBLE) && type2.equals(Type.DOUBLE))) {
//            return Type.DOUBLE;
//        } else {
//            //type match error
//            return null;
//        }
        return null;
    }

    private static String checkSubtraction(String type1, String type2) {
        //TODO support char
        return checkAddition(type1, type2);
    }

    private static String checkMultiplication(String type1, String type2) {
        //TODO: support String * int
        return checkAddition(type1, type2);
    }

    private static String checkDivision(String type1, String type2) {
        return checkAddition(type1, type2);
    }

    private static String checkBoolExpression(String type1, String type2) {
//        if (type1.equals(Type.BOOL) && type2.equals(Type.BOOL)) {
//            return Type.BOOL;
//        } else {
//            return null;
//        }
        return null;
    }

    private static String checkCompareExpression(String type1, String type2) {
//        String result = checkAddition(type1, type2);
//        if (result == null) {
//            return null;
//        } else {
//            return Type.BOOL;
//        }
        return null;
    }

    public static String checkUnaryComputation(String operation, String type) {
        switch (operation) {
            case "-":
                return checkNegative(type);
            case "!":
                return checkNotExpression(type);
            default:
                return null;
        }
    }

    private static String checkNotExpression(String type) {
//        return type.equals(Type.BOOL) ? Type.BOOL : null;
        return null;
    }

    private static String checkNegative(String type) {
//        if (type.equals(Type.INT) || type.equals(Type.DOUBLE)) {
//            return type;
//        } else {
//            return null;
//        }
        return null;
    }

    public static String checkArrayIndex(String arrayType, String indexType) {
//        if (Type.isArrayType(arrayType) && indexType.equals(Type.INT)) {
////            return Type.extractPrimaryTypeFromArrayType(arrayType);
////        } else {
////            return null;
////        }
        return null;
    }

    public static String checkFunctionParameter(String functionType,
                                                 List<String> parameterTypeList) {
        //TODO
        return null;
    }

    //other operation: XOR and so on
}
