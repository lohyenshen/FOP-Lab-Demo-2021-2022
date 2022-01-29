package L8.Q6;

public class Test_Q6 {
    public static void main(String[] args) {
        BurgerStalls a =  new BurgerStalls(1, 0);
        a.sold(200);
        System.out.println( a.getBurgersSold() );

        BurgerStalls b =  new BurgerStalls(2, 0);
        b.sold(300);
        System.out.println( b.getBurgersSold() );

        BurgerStalls c =  new BurgerStalls(3, 0);
        c.sold(400);
        System.out.println( c.getBurgersSold() );

        System.out.println( BurgerStalls.getAllBurgersSold() );
    }
}
