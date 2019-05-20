public class TestClass {
    public int m = 0;

    public static boolean inc(int m) {
        return m > 3 && m < 6;
    }
    
    public static void main(String[] args) {
        int m = 7;
        int n = m + -1;
        // int m = 8;
        // boolean b = inc(m);
        // b = !b;
        boolean b = m > n;
    }
}