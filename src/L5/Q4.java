package L5;

public class Q4 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 5, 7},
                {3, 6, 9},
                {5, 3, 8}
        };

//        int[][] m = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}
//        };

        System.out.println("3 by 3 Matrix");
        printMatrix(m);

        int[][] rotatedM = rotateMatrix(m);

        System.out.println("\nAfter rotates 90 degrees clockwise");
        printMatrix(rotatedM);
    }

    private static int[][] rotateMatrix( int[][] m) {
        if (m.length == 0) // no rows
            throw new IllegalStateException("Cannot rotate matrix without row");
        if (m[0].length == 0) // no cols
            throw new IllegalStateException("Cannot rotate matrix without column");

        /**
         * ORIGINAL MATRIX
         * (0,0) (0,1) (0,2)    constant = 0(i), j++   move by column
         * (1,0) (1,1) (1,2)    constant = 1(i), j++
         *
         *
         * ROTATED MATRIX
         * (0,2) (1,2) (2,2)   constant = 2(length-1), i++ move by row
         * (0,1) (1,1) (2,1)   constant = 1(length-i), i++ move by row
         */

        int[][] rotatedM = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                rotatedM[j][m.length - 1 - i] = m[i][j];

        return rotatedM;
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
