public class Test {
    public static class MyStruct {
        public int a = f();
    }

    public static double d = 4;

    public static void main(String[] args) {
        System.out.println("Hello world!\n");
    }

    public static int f() {
        return 3;
    }
}