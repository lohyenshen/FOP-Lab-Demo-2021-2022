package L4;

import java.util.Random;

public class Q8 {
    public static void main(String[] args) {

        Random rd = new Random();
        int count = rd.nextInt(100+1);
        System.out.println("First " + count + " prime numbers");

        int number = 0; // the starting number
        // loop for n times
        for (int i = 0; i < count; ) {
            if (isPrime(number)){
                System.out.println(number);
                i++;
            }
            number++; // move to next integer regardless of it prime properties
        }
    }

    private static boolean isPrime (int number){
        if (number < 2)
            return false;
        
        if (number == 2)
            return true;

        for (int i=2; i<=Math.sqrt(number); i++)
            if (number%i == 0)
                return false;

        return true;
    }
}
