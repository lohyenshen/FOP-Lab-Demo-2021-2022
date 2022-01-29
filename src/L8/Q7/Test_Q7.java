package L8.Q7;

public class Test_Q7 {
    public static void main(String[] args) {
        Money m1 = new Money(15320);
        System.out.println( m1 );

        Money m2 = new Money(18976);
        System.out.println( m2 );

        Money m3 = m2.add(m1);
        System.out.println(m3);

        Money m4 = m2.minus(m1);
        System.out.println(m4);


//        int m = 10_10;
//        for (int i = 0; i < 10; i++) {
//            Money mm =  new Money(m);
//            System.out.println( "Before round up: " + mm.getRM() );
//
//            mm.roundUp();
//            System.out.println( "After round up: " + mm.getRM()  );
//            System.out.println();
//
//            m += 1;
//        }
    }
}
