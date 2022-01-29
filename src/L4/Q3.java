package L4;

import java.util.Scanner;

/**
 * - quit if negative score is enter
 *
 * - min, max, mean
 * - standard deviation
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum_X = 0;
        double sum_X_2 = 0;

        while (true){
            System.out.print("Enter a score [negative score to quit]: ");
            int n = sc.nextInt();
            if (n < 0)
                break;

            N++;
            if (n < min)
                min = n;
            if (n > max)
                max = n;

            sum_X += n;
            sum_X_2 += (n*n);
        }

        // inputs end
        double mean = sum_X / N;
        double sd   = Math.sqrt( (sum_X_2 - ((sum_X*sum_X)/N)) / (N-1) );

        System.out.println("Minimum score: " + min );
        System.out.println("Maximum score: " + max );
        System.out.println("Average score: " + mean);
        System.out.printf("Standard Deviation: %.2f", sd);
    }
}
