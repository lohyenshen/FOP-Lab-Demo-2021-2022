package L3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int temp = (a*d) - (b*c);
        if (temp == 0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = 1.0 * ( (e*d)-(b*f) ) / temp;
            double y = 1.0 * ( (a*f)-(e*c) ) / temp;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
