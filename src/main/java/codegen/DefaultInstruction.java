package codegen;

import classgen.provider.InstructionInfo;

import java.util.Arrays;
import java.util.List;

public class DefaultInstruction implements InstructionInfo {
    private int opcode;
    private Object[] arguments;

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
}
