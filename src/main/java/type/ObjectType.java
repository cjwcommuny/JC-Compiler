package type;

import java.util.List;

public class ObjectType extends Type {
    private String fullRestrictClassName;

    @Override
    public String generateFieldDescriptor() {
        return "L" + fullRestrictClassName + ";";
    }

    public ObjectType(String simpleClassName, List<String> restrictNames) {
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
}
