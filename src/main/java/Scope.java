import java.util.Objects;

public class Scope {
    private String scopeIndex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scope scope = (Scope) o;
        return Objects.equals(scopeIndex, scope.scopeIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scopeIndex);
    }

    public Scope(String scopeIndex) {
        this.scopeIndex = scopeIndex;
    }
}
