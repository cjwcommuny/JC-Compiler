public class Sum {
    public static int sum(int limit) {
        int sum = 0;
        for (int i = 0; i < limit; i = i + 1) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int s = sum(10);
        System.out.println(s);
    }
}
