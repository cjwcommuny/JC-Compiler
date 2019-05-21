package codegen;

import classgen.provider.OuterClassInfo;

public class DefaultOuterClassInfo implements OuterClassInfo {
    private String owner;
    private String name;
    private String descriptor;

    public DefaultOuterClassInfo(String owner, String name, String descriptor) {
        this.owner = owner;
        this.name = name;
        this.descriptor = descriptor;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescriptor() {
        return descriptor;
    }
}
