package L6;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        final int MIN=0, MAX=12;
        int correctCount = 0;

        while (true){
            System.out.println("Enter negative number to quit.");
            int a = rd.nextInt(MAX-MIN+1)+MIN;
            int b = rd.nextInt(MAX-MIN+1)+MIN;

            System.out.printf("%d x %d = ", a, b);
            int c = sc.nextInt();
            if (c < 0)
                break;

            if (correctAnswer( a, b, c))
                correctCount++;
        }

        System.out.println("\n\nYour Score is " + correctCount);
    }

    private static boolean correctAnswer( int a, int b, int c) {
        return a*b == c;
    }
}
