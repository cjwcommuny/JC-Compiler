package operation;

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
}
