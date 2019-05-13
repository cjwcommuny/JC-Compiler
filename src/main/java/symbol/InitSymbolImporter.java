package symbol;

import ast.node.definition.DefinitionNode;
import type.typetype.ObjectType;
import type.typetype.TypeBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitSymbolImporter {
    private static String stringTypeName = "String";
    private static String[] stringRestrictNames = new String[]{"java", "lang"};

    public void importInitNames(Scope scope) {
        Map<String, DefinitionNode> table = new HashMap<>();
        table.put(stringTypeName, generatePlaceholderNode(stringTypeName, getStringRestrictNames()));
        scope.putAll(table);
    }

    private DefinitionNode generatePlaceholderNode(String typeName, List<String> restrictNames) {
        ObjectType type = TypeBuilder.generateObjectType(typeName, restrictNames);
        return new DefinitionNode(type, null);
    }

    public static List<String> getStringRestrictNames() {
        return Arrays.asList(stringRestrictNames);
    }

    public static String getStringTypeName() {
        return stringTypeName;
    }
}
