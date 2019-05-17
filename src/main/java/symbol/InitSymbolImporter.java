package symbol;

import ast.node.definition.DefinitionNode;
import ast.node.definition.DefinitionNodeBuilder;
import ast.node.definition.FunctionDefinitionNode;
import ast.node.reference.FunctionNameNode;
import common.CommonInfrastructure;
import type.typetype.*;

import java.util.*;

public class InitSymbolImporter {
    private static String stringTypeName = "String";
    private static List<String> stringRestrictNames = new LinkedList<>(Arrays.asList("java", "lang"));
    private static ObjectType stringType = TypeBuilder.generateObjectType(stringTypeName, stringRestrictNames);

    public static String printFunctionName = "print";
    private static Type returnTypeOfPrintln = new VoidType();
    private static List<Type> parametersTypeOfPrintln = new LinkedList<>(Arrays.asList(stringType, new IntType()));

    public void importInitNames(Scope scope) {
        Map<String, DefinitionNode> table = new HashMap<>();
        table.put(stringTypeName, generatePlaceholderNode(stringTypeName, getStringRestrictNames()));
        table.put(printFunctionName,
                generateFunctionNode(printFunctionName,
                        returnTypeOfPrintln,
                        parametersTypeOfPrintln));
        scope.putAll(table);
    }

    private DefinitionNode generatePlaceholderNode(String typeName, List<String> restrictNames) {
        ObjectType type = TypeBuilder.generateObjectType(typeName, restrictNames);
        return new DefinitionNode(type, null);
    }

    public static List<String> getStringRestrictNames() {
        return stringRestrictNames;
    }

    public static String getStringTypeName() {
        return stringTypeName;
    }

    private DefinitionNode generateFunctionNode(String functionName, Type returnType, List<Type> parametersType) {
        List<String> restrictNames = new LinkedList<>();
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(functionName, restrictNames);
        FunctionType functionType = TypeBuilder.generateFunctionType(parametersType, returnType);
        FunctionNameNode functionNameNode = new FunctionNameNode(functionName, null, functionType);
        FunctionDefinitionNode thisNode = DefinitionNodeBuilder.generateFunctionDefinitionNode(fullRestrictName,
                functionType,
                null);
        thisNode.addChild(functionNameNode);
        return thisNode;
    }
}
