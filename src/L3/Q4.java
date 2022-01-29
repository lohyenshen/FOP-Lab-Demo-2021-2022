package L3;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        Random rd = new Random();

        final int MIN = 1;
        final int MAX = 6;
        int p1=0, p2=0;

        for (int i = 0; i < 2; i++) {
            System.out.println("\nRound " + (i+1));

            int d1 = rd.nextInt(MAX-MIN+1)+MIN;
            System.out.println("Dice 1 = " + d1);
            p1 += d1;

            int d2 = rd.nextInt(MAX-MIN+1)+MIN;
            System.out.println("Dice 2 = " + d2);
            p2 += d2;
        }


        System.out.println();
        System.out.println("Player1 score: " + p1);
        System.out.println("Player2 score: " + p2);

        if (p1 > p2)
            System.out.println("Player 1 wins");
        else if (p1 < p2)
            System.out.println("Player 2 wins");
        else
            System.out.println("Tie");
    }
}
