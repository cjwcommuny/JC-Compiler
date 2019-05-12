package ast.node.definition;

import ast.node.Node;
import ast.node.reference.VariableNameNode;
import symbol.Scope;
import type.typetype.BaseType;
import type.typetype.FunctionType;
import type.typetype.ObjectType;
import type.typetype.Type;

import java.util.HashMap;
import java.util.Map;

public class DefinitionNodeBuilder {
    private static Map<String, DefinitionNode> nodeBuffer = new HashMap<>();//buffer for prototype

    public static VariableDefinitionNode generateVariableDefinitionNode(String fullRestrictName, Type type, Scope parentScope) {
        if (nodeBuffer.containsKey(fullRestrictName)) {
            VariableDefinitionNode node = (VariableDefinitionNode) nodeBuffer.get(fullRestrictName);
            node.setType(type);
            return node;
        } else {
            VariableDefinitionNode node = new VariableDefinitionNode(type, parentScope);
            nodeBuffer.put(fullRestrictName, node);
            return node;
        }
    }

    public static FunctionDefinitionNode generateFunctionDefinitionNode(String fullRestrictName, Type type, Scope parentScope) {
        if (nodeBuffer.containsKey(fullRestrictName)) {
            FunctionDefinitionNode node = (FunctionDefinitionNode) nodeBuffer.get(fullRestrictName);
            node.setType(type);
            return node;
        } else {
            FunctionDefinitionNode node = new FunctionDefinitionNode(type, parentScope);
            nodeBuffer.put(fullRestrictName, node);
            return node;
        }
    }

    public static NamespaceNode generateNamespaceNode(String fullRestrictName, Scope thisScope, Scope parentScope) {
        if (nodeBuffer.containsKey(fullRestrictName)) {
            return (NamespaceNode) nodeBuffer.get(fullRestrictName);
        } else {
            NamespaceNode node = new NamespaceNode(fullRestrictName, thisScope, parentScope);
            nodeBuffer.put(fullRestrictName, node);
            return node;
        }
    }

    public static StructureDefinitionNode generateStructureDefinitionNode(String fullRestrictName, ObjectType type, Scope thisScope, Scope parentScope) {
        if (nodeBuffer.containsKey(fullRestrictName)) {
            StructureDefinitionNode node = (StructureDefinitionNode) nodeBuffer.get(fullRestrictName);
            node.setThisScope(thisScope);
            node.setType(type);
            return node;
        } else {
            StructureDefinitionNode node = new StructureDefinitionNode(type, thisScope, parentScope);
            nodeBuffer.put(fullRestrictName, node);
            return node;
        }
    }

    public static VariableDefinitionNode generateVariableDefinitionNodeNotBuf(Type type, Scope parentScope) {
        return new VariableDefinitionNode(type, parentScope);
    }

    public static DefinitionNode generateNodeFromType(Type type, DefinitionType definitionType, String fullRestrictName, Scope parentScope) {
        if (nodeBuffer.containsKey(fullRestrictName)) {
            return nodeBuffer.get(fullRestrictName);
        }
        DefinitionNode node;
        if (definitionType == DefinitionType.VARIABLE) {
            node = new VariableDefinitionNode(type, parentScope);
        } else if (definitionType == DefinitionType.FUNCTION) {
            node = new FunctionDefinitionNode(type, parentScope);
        } else {
            //struct
            node = new StructureDefinitionNode((ObjectType) type, null, parentScope);
        }
        nodeBuffer.put(fullRestrictName, node);
        return node;
    }
}
