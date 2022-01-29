package L5;

import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random rd = new Random();
        final int N = 2;
        final int MIN=1, MAX=8;

        int[][] x = new int[N][7+1]; // 7 (work hours) + 1 (total)


        for (int i = 0; i < x.length; i++) { // N
            for (int k = 0; k < x[i].length-1; k++) { // avoid last index which is total
                int workHour = rd.nextInt(MAX-MIN+1)+MIN;
                x[i][k] = workHour;
                x[i][x[i].length-1] += workHour; // last index
            }
        }

        System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s\n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "SUM");
        for (int i = 0; i < x.length; i++) {
//            System.out.printf("%5d", (i+1));

            for (int k = 0; k < x[i].length; k++) {
                System.out.printf("%5d", x[i][k]);
            }

            System.out.println();
        }
    }
}
