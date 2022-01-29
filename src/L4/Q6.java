package L4;

import java.util.Random;

public class Q6 {
    public static void main(String[] args) {
        Random rd = new Random();

        int n = rd.nextInt(10000);
        System.out.println("Number = " + n);

        // string approach                     /////////
        System.out.println( Integer.toString(n).length() );


        // loop approach
        int numberOfDigits = 0;
        while (n > 0){
            numberOfDigits++;
            n /= 10;
        }
        System.out.println(numberOfDigits);
    }
}
