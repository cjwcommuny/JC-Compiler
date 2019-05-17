package classgen.provider;


import org.objectweb.asm.Label;

public interface InstructionInfo {
    int getOpcode();
    Object[] getArguments();
    boolean isLabel();
    Label getLabel();
}
