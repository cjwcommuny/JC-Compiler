package classgen.provider;

import java.util.List;

public interface CodeInfo {
    int getMaxStack();
    int getMaxLocals();
    List<InstructionInfo> getInstructions();
}
