public class TestClass {
    String str = new String();

    public static void main(String[] args) {
        InnerTest innerTest = new InnerTest();
        int t = innerTest.a;
    }

    public static class InnerTest {
        public int a = 0;
    }
}