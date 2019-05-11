package type.typetype;

import java.util.LinkedList;
import java.util.List;

public class TypeBuilder {
    /**
     * for base type or object type
     * in "java/lang/Thread" restrict Names are ["java", "lang"]
     * */
    public static Type generateBaseOrObjectType(String typeName, List<String> restrictNames) {
        if (BaseType.isBaseType(typeName)) {
            return generateBaseType(typeName);
        } else {
            return generateObjectType(typeName, restrictNames);
        }
    }

    public static ArrayType generateArrayType(String componentTypeName,
                                              List<String> restrictNames,
                                              int dimension) {
        return generateArrayType(
                generateBaseOrObjectType(componentTypeName, restrictNames),
                dimension
        );
    }

    public static FunctionType generateFunctionType(String returnTypeName,
                                                    List<String> restrictNames,
                                                    List<String> parameterTypes) {
        return generateFunctionType(
                generateBaseOrObjectTypes(parameterTypes, restrictNames),
                generateBaseOrObjectType(returnTypeName, restrictNames)
        );
    }

    private static List<Type> generateBaseOrObjectTypes(List<String> typeNames,
                                                        List<String> restrictNames) {
        List<Type> types = new LinkedList<>();
        for (String typeName: typeNames) {
            types.add(generateBaseOrObjectType(typeName, restrictNames));
        }
        return types;
    }

    public static FunctionType generateFunctionType(List<Type> parameterTypes, Type returnType) {
        return new FunctionType(parameterTypes, returnType);
    }

    public static ArrayType generateArrayType(Type componentType, int dimension) {
        return new ArrayType(componentType, dimension);
    }

    public static ObjectType generateObjectType(String simpleClassName, List<String> restrictNames) {
        return new ObjectType(simpleClassName, restrictNames);
    }

    public static BoolType generateBoolType() {
        return BoolType.getInstance();
    }

    public static IntType generateIntType() {
        return IntType.getInstance();
    }

    public static CharType generateCharType() {
        return CharType.getInstance();
    }

    public static VoidType generateVoidType() {
        return VoidType.getInstance();
    }

    public static DoubleType generateDoubleType() {
        return DoubleType.getInstance();
    }

    private static BaseType generateBaseType(String typeName) {
        switch (typeName) {
            case "int":
                return generateIntType();
            case "bool":
                return generateBoolType();
            case "double":
                return generateDoubleType();
            case "char":
                return generateCharType();
            case "void":
                return generateVoidType();
            default:
                return null;//TODO: error handling
        }
    }

    public static NamespaceType generateNamespaceType(String name) {
        return new NamespaceType(name);
    }
}