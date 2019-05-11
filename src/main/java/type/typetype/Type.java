package type.typetype;

import java.util.List;
import java.util.Objects;

public abstract class Type {
    abstract public String generateFieldDescriptor();
    public String visualInfo() {
        return this.getClass().getSimpleName();
    }
}
