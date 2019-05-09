package type.base;

import type.Type;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public abstract class BaseType extends Type {
    private static HashSet<String> baseTypes = new HashSet<>(Arrays.asList("int", "bool", "char", "double"));

    public static boolean isBaseType(String typeName) {
        return baseTypes.contains(typeName);
    }
}
