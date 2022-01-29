package L9.Q4;
import  java.util.*;
/**\
 * Create a Dice game.
 *
 * The first dice game allows the player to roll (((two))) dices each time.
 * If both dice is equal, the player can roll again.
 *
     * The player score each time they roll the dices.
     * Player that reaches 100 points or more wins the game.
 *
 *
 * The second dice game allows the player to roll (((one))) dice each time.
 * When the dice is 6, the player can roll one more time.
 * However, if the player rolls 6 again in second attempt,
 * the player won’t have any score.
 *
 * Player that reaches 100 point wins the game.
 * If the player scores more than 100,
 * the last score is not counted and the player needs to roll again in next turn.
 *
 * Create a Tester class to test the program.
 */
public class DiceGame {
    private Player player1 , player2;
    private int round;

    public DiceGame( Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.round = 1;
    }

    public void start(){
        this.round = 1;
        while (!isWin(player1) && !isWin(player2)) {
            System.out.println("Round " + round);


            player1.roll();
            if (isWin(player1)) {
                System.out.println(player1.getName() + " wins ");
                break;
            }


            player2.roll();
            if (isWin(player2)) {
                System.out.println(player2.getName() + " wins ");
                break;
            }

            System.out.println();
            round ++;
        }
    }

    private boolean isWin(Player player){
        return player.getScore() >= 100;
    }
}

// Abstract class
// a restricted class that cannot be used to create objects
// (to access it, it must be inherited from another class)
abstract class Player {

    protected int score = 0;
    protected String name;
    protected final int MAX=6, MIN=1;



    public Player(String a) {
        name = a;
    }

    public void display() {
        System.out.println("The score for " + name + " is " + score);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void roll();

}

class PlayerGame1 extends Player {

    private int dice1, dice2;
    private Random rd = new Random();

    public PlayerGame1(String a) {
        super(a);
    }

    public void roll() {
        this.dice1 = 0;
        this.dice2 = 0;

        do{
            this.dice1 = rd.nextInt(MAX-MIN+1) + MIN;
            this.score += this.dice1;

            this.dice2 = rd.nextInt(MAX-MIN+1) + MIN;
            this.score += this.dice2;

            System.out.println(this.getName() + " rolls " + this.dice1 + " and " + this.dice2);
            this.display();
        } while((this.dice1 == this.dice2)); // repeat if dice values are the same
    }
}



class PlayerGame2 extends Player {

    private int dice;
    private Random rd = new Random();

    public PlayerGame2(String a) {
        super(a);
    }

    public void roll() {
        this.dice = rd.nextInt(MAX-MIN+1) + MIN;
        this.score += this.dice;

        //current score = 98
        //dice1 = 3
        //score + 3= 101
        System.out.println(this.getName() + " rolls " + this.dice );
        //score more than 100 not count
        if (this.score > 100) {
            System.out.println(this.getName() + " excees 100, score = " + this.score);
            this.score -= this.dice;
        }

        //current score = 98
        this.display();


        // roll again
        if (this.dice == 6) {
            this.dice = this.rd.nextInt(6) + 1;
            System.out.println(this.getName() + " rolls " + this.dice );

            if (this.dice == 6) {
                //roll 6 again for 2nd time, score not count
            }
            else {
                this.score += this.dice;
                //score more than 100 not count
                if (this.score > 100) {
                    System.out.println(this.getName() + " excees 100, score = " + this.score);
                    this.score -= this.dice;
                }
                this.display();
            }
        }
    }
}
