package L4;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random rd = new Random();

        int p1 = 0, p2 = 0;
        int i = 1;
        int d1, d2, MIN=1, MAX=6, winningPoint=100;

        while (true){
            // player 1 rolls
            if (i%2 == 1){
                // roll dice, display dice, display player's current score
                d1 = rd.nextInt(MAX-MIN+1) + MIN;
                System.out.println("Dice 1 = " + d1);
                p1 += d1;
                System.out.println("Player 1 score = " + p1);

                // leaves game if point > winning point (100)
                if (p1 > winningPoint)
                    break;

                // roll again dice is 6
                if (d1 == 6)  {
                    System.out.println("ROLL AGAIN for player 1!");
                    continue;
                }

            }
            // player 2 rolls
            else{
                d2 = rd.nextInt(MAX-MIN+1) + MIN;
                System.out.println("Dice 2 = " + d2);
                p2 += d2;
                System.out.println("Player 2 score = " + p2);

                if (p2 > winningPoint)
                    break;

                if (d2 == 6) {
                    System.out.println("ROLL AGAIN for player 2!");
                    continue;
                }
            }

            i++;
            System.out.println();
        }


        // display result
        System.out.println("---------------- RESULT -----------------------------");
        System.out.println("Player 1 score: " +  p1);
        System.out.println("Player 2 score: " +  p2);
        if (i%2 == 1)
            System.out.println("Player 1 wins");
        else
            System.out.println("Player 2 wins");
    }
}
