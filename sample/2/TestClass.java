public class TestClass {

    public static void main(String[] args) {
        InnerTest innerTest = new InnerTest();
        int t = innerTest.a;
    }

    public static class InnerTest {
        public int a = 0;
    }
}