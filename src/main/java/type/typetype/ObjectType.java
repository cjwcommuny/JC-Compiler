package type.typetype;

import common.CommonInfrastructure;

import java.util.List;
import java.util.Objects;

public class ObjectType extends Type {
    private String simpleClassName;
    private List<String> restrictNames;
    private String fullRestrictClassName;

    @Override
    public String generateFieldDescriptor() {
        return "L" + fullRestrictClassName + ";";
    }

    ObjectType(String simpleClassName, List<String> restrictNames) {
        this.simpleClassName = simpleClassName;
        this.restrictNames = restrictNames;
        this.fullRestrictClassName = CommonInfrastructure.constructFullRestrictClassName(simpleClassName, restrictNames);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectType that = (ObjectType) o;
        return Objects.equals(fullRestrictClassName, that.fullRestrictClassName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullRestrictClassName);
    }

    @Override
    public String visualInfo() {
        return simpleClassName;
    }

    @Override
    public String getSimpleName() {
        return simpleClassName;
    }
}
