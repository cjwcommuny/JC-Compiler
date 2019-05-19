package operation;

import java.util.Objects;

public abstract class Operation {
    private String operation;



    @Override
    public String toString() {
        return operation;
    }

    public Operation(String operation) {
        this.operation = operation;
    }

    public String visualInfo() {
        return this.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation1 = (Operation) o;
        return Objects.equals(operation, operation1.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation);
    }
}
