package L2;

import java.util.Scanner;

/**
 * - input
 *      seconds
 *
 * - outputs
 *      hours   (1hour = 3600s)
 *      minutes (1min  = 60s)
 *      seconds
 */
public class Q4 {
    public static void main(String[] args) {

        // create a Scanner object to receive input
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of seconds: ");
        int sum = sc.nextInt();
        int initialSum = sum;   // store a copy to print later



        int hours = sum/3600;
        sum = sum%3600;

        int minutes = sum/60;
        sum = sum%60;

        int seconds = sum;



        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", initialSum, hours, minutes, seconds);
    }
}
