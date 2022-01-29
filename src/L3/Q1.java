package L3;

import java.util.Scanner;

/**
 * simple calculator
 *
 * input:
 *      - 2 integers
 *      - 1 character
 *
 * process:
 *      - sum (+)
 *      - difference (-)
 *      - multiply (*)
 *      - quotient (/)
 *      - remainder (%)
 */

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);

        c =
        switch (operand){
            case '+' -> a+b;
            case '-' -> a-b;
            case '*' -> a*b;
            case '/' -> a/b;
            case '%' -> a%b;
            default -> throw new IllegalStateException("Invalid operand: " + operand);
        };

        System.out.printf("%d %c %d = %d", a, operand, b, c);
    }
}
