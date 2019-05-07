package type;

import java.util.List;

public class Type {
    public static String INT = "int";
    public static String STRING = "String";
    public static String CHAR = "char";
    public static String DOUBLE = "double";
    public static String BOOL = "bool";

    public static String generateFunctionType(String functionName, List<String> parameterTypeList) {
        //TODO
        return null;
    }

    public static String generateArrayType(String primaryType, int dimension) {
        //TODO
        return null;
    }

//    public static String generateStructType(String structName) {
//        //TODO
//        return null;
//    }

    public static String generateNamespaceType(String namespace) {
        //TODO
        return null;
    }

    public static String extractPrimaryTypeFromArrayType(String arrayType) {
        //TODO
        return null;
    }

    public static boolean isArrayType(String type) {
        //TODO
        return true;
    }
}
