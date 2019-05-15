package codegen;

import classgen.provider.CodeInfo;
import classgen.provider.InstructionInfo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DefaultCodeInfo implements CodeInfo {
    private List<InstructionInfo> instructions = new LinkedList<>();
    private int maxStack;
    private int maxLocals;

    @Override
    public int getMaxStack() {
        //TODO
        return maxStack;
    }

    @Override
    public int getMaxLocals() {
        return maxLocals;
    }

    @Override
    public List<InstructionInfo> getInstructions() {
        return instructions;
    }

    public void addInstruction(InstructionInfo instruction) {
        instructions.add(instruction);
    }


    public void setMaxLocals(int maxLocals) {
        this.maxLocals = maxLocals;
    }

    public void setInstructions(List<InstructionInfo> instructions) {
        this.instructions = instructions;
    }

    public void setMaxStack(int maxStack) {
        this.maxStack = maxStack;
    }
}
