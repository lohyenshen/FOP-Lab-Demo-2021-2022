package L4;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++)       // outer loop repeats process for 'n' times
            for (int j = 1; j <=i ; j++)   // inner loop repeats from 1 to 'i'   (where i increase by 1 on outer loop)
                sum += j;

        System.out.println(sum);
    }
}
