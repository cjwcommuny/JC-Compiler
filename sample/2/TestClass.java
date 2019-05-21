public class TestClass {
    static int m = f();

    public static void main(String[] args) {

    }

    public static int f() {
        int m = 1;
        int n = m + 2;
        return n + 3;
    }
}