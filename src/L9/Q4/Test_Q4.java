package L9.Q4;

public class Test_Q4 {
    public static void main(String[] args) {
        PlayerGame1 p1 = new PlayerGame1("A");
        PlayerGame1 p2 = new PlayerGame1("B");

        System.out.println("Dice Game 1");
        DiceGame game1 = new DiceGame(p1,p2);
        game1.start();
        System.out.println("\n\n");



        PlayerGame2 player3 = new PlayerGame2("C");
        PlayerGame2 player4 = new PlayerGame2("D");
        DiceGame game2 = new DiceGame(player3,player4);
        game2.start();
    }
}
