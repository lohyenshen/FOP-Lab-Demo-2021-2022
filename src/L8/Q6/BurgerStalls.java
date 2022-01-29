package L8.Q6;

public class BurgerStalls {
    private static int allBurgersSold;

    private int ID;
    private int burgersSold;

    public BurgerStalls( int ID, int burgersSold) {
        this.ID = ID;
        this.burgersSold = burgersSold;
        allBurgersSold += burgersSold;
    }

    public void sold ( int a){
        burgersSold += a;
        allBurgersSold += a;
    }
    public int getBurgersSold(){
        return burgersSold;
    }

    public static int getAllBurgersSold(){
        return allBurgersSold;
    }
}
