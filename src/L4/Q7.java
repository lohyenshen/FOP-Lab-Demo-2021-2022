package L4;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double P = sc.nextInt();

        System.out.print("Enter interest in %: ");
        double i = sc.nextInt();

        System.out.print("Enter total number of month(s): ");
        double N = sc.nextInt();


        double M = (P*(i/1200)) / (1- Math.pow( (1+(i/1200)), -N) );
        double C, L, R;
        double totalInterest = 0;


        // output
        System.out.printf("%-7s %17s %11s %11s %17s %17s\n", "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        for (int n = 1; n <= N ; n++) {
            C = M * Math.pow( (1+(i/1200)), -(1+N-n) );
            L = M - C;
            R = L / (i/1200) - C;
            totalInterest += L;

            System.out.printf("%-7d %17.2f %11.2f %11.2f %17.2f %17.2f\n", n, M, C, L, R, totalInterest);
        }
    }
}
