package L8.Q5;

import java.util.Random;

public class Game {
    private static Random rd = new Random();
    private static final int MAX=6, MIN=1;

    private String name;
    private int score;

    // constructor
    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void rollDice(){
        int dice = rd.nextInt(MAX-MIN+1) + MIN;
        System.out.println(this.name + " rolls " + dice );
        score += dice;
    }

    @Override
    public String toString() {
        return String.format("Name: %10s Score:%5d\n", name, score);
    }
}
