package codegen;

import classgen.provider.CodeInfo;
import classgen.provider.InstructionInfo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DefaultCodeInfo implements CodeInfo {
    private List<InstructionInfo> instructions = new LinkedList<>();
    private Map<String, Integer> localSymbols = new HashMap<>();
    private int maxStack;

    @Override
    public int getMaxStack() {
        //TODO
        return maxStack;
    }

    @Override
    public int getMaxLocals() {
        return localSymbols.size();
    }

    @Override
    public List<InstructionInfo> getInstructions() {
        return instructions;
    }

    public void addInstruction(InstructionInfo instruction) {
        instructions.add(instruction);
    }

    public void addLocal(String localName) {
        localSymbols.put(localName, getNextLocalIndex());
    }

    private int getNextLocalIndex() {
        return localSymbols.size();
    }
}
