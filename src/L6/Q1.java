package L6;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("List of triangular numbers");
        for (int i = 0; i < 20; i++) {
            int tn = triangularNumber(i);
            System.out.printf("%d) %d\n", (i+1), tn);
        }
    }

    private static int triangularNumber( int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++)
            sum += i;
        return sum;
    }
}
