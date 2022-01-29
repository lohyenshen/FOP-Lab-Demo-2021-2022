package L2;

import java.util.Random;

/**
 * - random number range [0, 10000]
 * - display the number
 * - display the sum of all digits
 */

public class Q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(10000+1);
        System.out.println("Number = " + n);

        int sum = 0;
        while (n > 0){
            sum = sum + (n%10);
            n = n/10;
        }

        System.out.println("Sum of all digits = " + sum);
    }
}
