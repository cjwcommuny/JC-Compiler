package ast.node.definition;

import type.typetype.ObjectType;
import type.typetype.Type;

public class StructureDefinitionNode extends DefinitionNode {
    public StructureDefinitionNode(ObjectType type) {
        super(type);
    }

    @Override
    protected String visualInfo() {
        return "Struct: " + type.visualInfo();
    }
}
