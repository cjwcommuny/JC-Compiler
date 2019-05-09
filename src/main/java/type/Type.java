package type;

import java.util.List;

public abstract class Type {
    abstract public String generateFieldDescriptor();
    public String visualInfo() {
        return this.getClass().getSimpleName();
    }
}
