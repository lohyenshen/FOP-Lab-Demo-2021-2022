package L8.Q5;

public class Test_Q5 {
    public static void main(String[] args) {
        final int GAME_POINT=100;
        Game p1 = new Game("Ali");
        Game p2 = new Game("Bob");

        while (true){
            p1.rollDice();
            System.out.println(p1);
            if (p1.getScore() > GAME_POINT){
                System.out.println(p1.getName() + " wins!");
                break;
            }


            p2.rollDice();
            System.out.println(p2);
            if (p2.getScore() > GAME_POINT){
                System.out.println(p2.getName() + " wins!");
                break;
            }
        }
    }
}
