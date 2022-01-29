package L2;

import java.util.Random;

/**
 * - generates 3 random numbers
 * - range [10, 50]
 *
 * - display
 *      - the 3 numbers
 *      - sum
 *      - average
 *      - in 2 decimal places
 */
public class Q3 {
    public static void main(String[] args) {
        final int MAX = 50;
        final int MIN = 10;
        Random rd = new Random();

        int n1 = rd.nextInt( MAX-MIN+1 ) + MIN;
        int n2 = rd.nextInt( MAX-MIN+1 ) + MIN;
        int n3 = rd.nextInt( MAX-MIN+1 ) + MIN;

        System.out.println("Number 1 = " + n1);
        System.out.println("Number 2 = " + n2);
        System.out.println("Number 3 = " + n3);

        int sum =  n1 + n2 + n3;
        System.out.println("Sum = " + sum);

        double average = sum / 3.0;
        System.out.printf("Average = %.2f", average);
    }
}
