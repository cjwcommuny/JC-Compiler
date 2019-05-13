package symbol;

import ast.node.definition.DefinitionNode;
import ast.node.definition.DefinitionNodeBuilder;
import ast.node.definition.FunctionDefinitionNode;
import ast.node.reference.FunctionNameNode;
import ast.node.reference.RefNodeBuilder;
import common.CommonInfrastructure;
import type.typetype.*;

import java.util.*;

public class InitSymbolImporter {
    private static String stringTypeName = "String";
    private static String[] stringRestrictNames = new String[]{"java", "lang"};
    ObjectType stringType;

    private static String printFunctionName = "print";

    public void importInitNames(Scope scope) {
        Map<String, DefinitionNode> table = new HashMap<>();
        table.put(stringTypeName, generatePlaceholderNode(stringTypeName, getStringRestrictNames()));
        table.put(printFunctionName, generatePrintNode());
        scope.putAll(table);
    }

    private DefinitionNode generatePlaceholderNode(String typeName, List<String> restrictNames) {
        ObjectType type = TypeBuilder.generateObjectType(typeName, restrictNames);
        stringType = type;
        return new DefinitionNode(type, null);
    }

    public static List<String> getStringRestrictNames() {
        return Arrays.asList(stringRestrictNames);
    }

    public static String getStringTypeName() {
        return stringTypeName;
    }

    private DefinitionNode generatePrintNode() {
        String functionName = "print";
        List<String> restrictNames = new LinkedList<>();
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(functionName, restrictNames);
        Type returnType = new VoidType();
        List<Type> parametersType = new LinkedList<>();
        parametersType.add(stringType);
        FunctionType functionType = TypeBuilder.generateFunctionType(parametersType, returnType);
        FunctionNameNode functionNameNode = new FunctionNameNode(functionName, null, functionType);
        FunctionDefinitionNode thisNode = DefinitionNodeBuilder.generateFunctionDefinitionNode(fullRestrictName,
                functionType,
                null);
        thisNode.addChild(functionNameNode);
        return thisNode;
    }
}
