package codegen;

import classgen.provider.InstructionInfo;
import org.objectweb.asm.Label;

public class DefaultInstruction implements InstructionInfo {
    private int opcode;
    private Object[] arguments;
    private Label label;

    public DefaultInstruction(int opcode, Object[] arguments) {
        this.opcode = opcode;
        this.arguments = arguments;
    }

    public DefaultInstruction(Label label) {
        this.label = label;
    }

    @Override
    public int getOpcode() {
        return opcode;
    }

    @Override
    public Object[] getArguments() {
        return arguments;
    }

    @Override
    public boolean isLabel() {
        return label != null;
    }

    @Override
    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
