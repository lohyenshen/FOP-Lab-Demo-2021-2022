package L3;

import java.util.Scanner;

/**
 * calculates the total commission
 *
 * input:
 *      - sales volume
 *
 * output:
 *      - commissions (in two decimal places)
 */

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales volume: ");
        int sales = sc.nextInt();
        double commissions;

        if (sales < 0)
            throw new IllegalStateException("Sales must be a positive value");
        else if (sales <= 100)
            commissions = sales*0.05;
        else if (sales <= 500)
            commissions = sales*0.075;
        else if (sales <= 1000)
            commissions = sales*0.10;
        else
            commissions = sales*0.125;

        System.out.println("Comissions = " + commissions);
    }
}
