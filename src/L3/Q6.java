package L3;

import java.util.Scanner;

/**
 * input:
 *      - radius of circle
 *      - coordinate point
 *
 * output:
 *      - point IN/OUT circle
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        int radius = sc.nextInt();

        System.out.print("Enter point (x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        double distanceFromOrigin = Math.sqrt( x*x + y*y );
        if (distanceFromOrigin <= radius)
            System.out.println("Point INSIDE circle");
        else
            System.out.println("Point OUTSIDE circle");
    }
}
