package type.typetype;

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
        this.fullRestrictClassName = constructFullRestrictClassName(simpleClassName, restrictNames);
    }

    private String constructFullRestrictClassName(String simpleClassName,
                                                  List<String> restrictNames) {
        return constructFullRestrictClassName(simpleClassName, restrictNames, "/");
    }

    private String constructFullRestrictClassName(String simpleClassName,
                                                  List<String> restrictNames,
                                                  String separator) {
        StringBuilder sb = new StringBuilder();
        for (String restrictName: restrictNames) {
            sb.append(restrictName);
            sb.append(separator);
        }
        sb.append(simpleClassName);
        return sb.toString();
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
        return constructFullRestrictClassName(simpleClassName, restrictNames, ".");
    }

    @Override
    public String getSimpleName() {
        return simpleClassName;
    }
}
