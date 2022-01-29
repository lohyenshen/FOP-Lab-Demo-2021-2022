package L5;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of row of Pascal Triangle to generate: ");
        int n = sc.nextInt();

        int[][] m = generatePascalTriangle(n);



        System.out.printf("The Pascal Triangle with %d row(s)\n", n);
        printMatrix(m);
    }

    private static int[][] generatePascalTriangle(int n) {
        int[][] m = new int [n][n];

        for (int i = 0; i < m.length; i++) {
            m[i][0] = 1; // linear "1"
            m[i][i] = 1; // diagonal "1"

            for (int j = 1; j < i; j++)
                m[i][j] = m[i-1][j] + m[i-1][j-1];
        }

        return m;
    }

    private static void printMatrix( int[][] m) {
        for (int[] row : m){
            for (int col : row) {
                System.out.printf("%5d", col);
            }
            System.out.println();
        }
    }
}
