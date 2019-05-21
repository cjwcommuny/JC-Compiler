package codegen;

import ast.node.Node;
import ast.node.definition.VariableDefinitionNode;
import classgen.provider.ClassRaw;
import classgen.provider.FieldInfo;
import classgen.provider.MethodInfo;
import classgen.provider.OuterClassInfo;
import com.sun.tools.classfile.Opcode;
import org.objectweb.asm.Opcodes;
import type.typetype.Type;

import java.util.LinkedList;
import java.util.List;

import static codegen.DefaultFieldInfo.generateFieldInfo;

public class InnerClassInfo implements ClassRaw {
    private String outerClassName;
    private String innerClassName;
    private List<Node> fieldNodes;
    private OuterClassInfo outerClassInfos;

    public InnerClassInfo(String outerClassName, String innerClassName, List<Node> fieldNodes, OuterClassInfo outerClassInfos) {
        this.outerClassName = outerClassName;
        this.innerClassName = innerClassName;
        this.fieldNodes = fieldNodes;
        this.outerClassInfos = outerClassInfos;
    }

    @Override
    public int getClassAccessFlags() {
        return Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;
    }

    @Override
    public String getInternalClassName() {
        return outerClassName + "$" + innerClassName;
    }

    @Override
    public String getSimpleName() {
        return innerClassName;
    }

    @Override
    public String[] getInterfaces() {
        return null;
    }

    @Override
    public List<FieldInfo> getFieldsInfo() {
        List<FieldInfo> fieldInfos = new LinkedList<>();
        for (Node fieldNode: fieldNodes) {
            fieldInfos.add(generateFieldInfo((VariableDefinitionNode) fieldNode));
        }
        return fieldInfos;
    }



    @Override
    public List<MethodInfo> getMethodsInfo() {
        return new LinkedList<>();
    }

    @Override
    public List<ClassRaw> getInnerClasses() {
        return new LinkedList<>();
    }

    @Override
    public String getClassFileName() {
        return getInternalClassName();
    }

    @Override
    public OuterClassInfo getOuterClassesInfo() {
        return outerClassInfos;
    }
}
