package codegen;

import classgen.provider.InstructionInfo;

import java.util.List;

public class DefaultInstruction implements InstructionInfo {
    private int opcode;
    private List<Object> arguments;

    public DefaultInstruction(int opcode, List<Object> arguments) {
        this.opcode = opcode;
        this.arguments = arguments;
    }

    @Override
    public int getOpcode() {
        return opcode;
    }

    @Override
    public Object[] getArguments() {
        if (arguments == null || arguments.size() == 0) {
            return null;
        }
        return arguments.toArray();
    }
}
