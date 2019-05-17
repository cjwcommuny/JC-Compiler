package codegen;

import classgen.provider.InstructionInfo;
import org.objectweb.asm.Label;

public class DefaultInstruction implements InstructionInfo {
    private int opcode;
    private Object[] arguments;
    private boolean isLabel;
    private Label label;

    public DefaultInstruction(int opcode, Object[] arguments) {
        this.opcode = opcode;
        this.arguments = arguments;
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
        return isLabel;
    }

    public void setLabel(boolean label) {
        isLabel = label;
    }

    @Override
    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
