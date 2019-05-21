public class TestClass {
    
    public static void main(String[] args) {
        System.out.println(InnerTest.class.getName());
        System.out.println(InnerTest.class.getSimpleName());
    }

    public static class InnerTest {
        public static int a = 0;
    }
}