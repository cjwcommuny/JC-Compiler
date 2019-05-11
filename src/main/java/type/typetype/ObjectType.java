package type.typetype;

import java.util.List;
import java.util.Objects;

public class ObjectType extends Type {
    private String fullRestrictClassName;

    @Override
    public String generateFieldDescriptor() {
        return "L" + fullRestrictClassName + ";";
    }

    ObjectType(String simpleClassName, List<String> restrictNames) {
        this.fullRestrictClassName = constructFullRestrictClassName(simpleClassName, restrictNames);
    }

    private String constructFullRestrictClassName(String simpleClassName, List<String> restrictNames) {
        StringBuilder sb = new StringBuilder();
        for (String restrictName: restrictNames) {
            sb.append(restrictName);
            sb.append("/");
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
}
