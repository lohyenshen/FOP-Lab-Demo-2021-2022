package L2;

import java.util.Scanner;

/**
 * Q = M * (final temperature – initial temperature) * 4184
 * M = Weight of water in kg
 * Q = Energy in joules
 * The temperature are in degree Celsius
 *
 *
 * - input weight = g
 * - formula weight = kg
 *
 * - input temp = F
 * - formula temp = C
 */

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of water in gram: ");
        int gram = sc.nextInt();
        double M = gram/1000.0;

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initial_F = sc.nextDouble();
        double initial_C = (initial_F-32) / 1.8;

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double final_F = sc.nextDouble();
        double final_C = (final_F-32) / 1.8;

        double Q = M * (final_C - initial_C) * 4184;
        System.out.println("The energy needed is " + Q);
    }
}
