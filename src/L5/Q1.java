package L5;

import java.util.Random;
import java.util.Scanner;

/**
 * input:
 *      - N (number of students)
 *
 * process:
 *      - generate N scores (random)
 *
 * output:
 *      - list of score
 *      - highest
 *      - lowest
 *      - average
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        // some predefined variables
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        int score;
        int[] scores = new int[N];

        for (int i = 0; i < scores.length; i++) {
            score = rd.nextInt(101);
            scores[i] = score;

            // highest
            if (score > max)
                max = score;

            // lowest
            if (score < min)
                min = score;

            // average
            sum += score;
        }

        System.out.println("List of scores");
        for (int i = 0; i < scores.length; i++)
            System.out.println(scores[i]);

        System.out.println("\n\n");
        System.out.println("Highest = " + max);
        System.out.println("Lowest = " + min);
        System.out.println("Average = " + (sum/N));
    }
}
