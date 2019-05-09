package type;

import type.base.*;

import java.util.LinkedList;
import java.util.List;

public class TypeBuilder {
    /**
     * for base type or object type
     * in "java/lang/Thread" restrict Names are ["java", "lang"]
     * */
    public static Type generateBaseOrObjectType(String typeName, List<String> restrictNames) {
        if (BaseType.isBaseType(typeName)) {
            return BaseTypeBuilder.generate(typeName);
        } else {
            return new ObjectType(typeName, restrictNames);
        }
    }

    public static ArrayType generateArrayType(String componentTypeName,
                                              List<String> restrictNames,
                                              int dimension) {
        return new ArrayType(
                generateBaseOrObjectType(componentTypeName, restrictNames),
                dimension
        );
    }

    public static FunctionType generateFunctionType(String returnTypeName,
                                                    List<String> restrictNames,
                                                    List<String> parameterTypes) {
        return new FunctionType(
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
}

class BaseTypeBuilder {
    static BaseType generate(String typeName) {
        switch (typeName) {
            case "int":
                return new IntType();
            case "bool":
                return new BoolType();
            case "double":
                return new DoubleType();
            case "char":
                return new CharType();
            case "void":
                return new VoidType();
            default:
                return null;//TODO: error handling
        }
    }
}