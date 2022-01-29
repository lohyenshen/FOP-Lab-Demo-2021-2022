package L6;



public class Q6 {
    public static void main(String[] args) {
        int n = 0;



        // 2, 3, 5, 7, 11, 101, 131, 151, 181, 191, 313, 353, 373, 383, 727, 757, 787, 797, 919, 929
        // pC == palindromicCount
        System.out.println("first 20 PALINDROME PRIMES");
        for (int pC  = 0; pC  < 20;      ) {
            if (isPalindromicPrime(n)){
                pC++;
                System.out.println(n);
            }

            n++;
        }



        System.out.println("\n\n\n");



        n = 0;
        // 13, 17, 31, 37, 71, 73, 79, 97, 107, 113, 149, 157, 167, 179, 199, 311, 337, 347, 359, 389,
        // eC == emirpCount
        System.out.println("first 20 ERIMP");
        for (int eC = 0; eC < 20;      ) {
            if (isEmirp(n)){
                eC++;
                System.out.println(n);
            }

            n++;
        }
    }
    
    
    
    private static boolean isPalindromicPrime( int n) {
        // not a palindrome number
        if (n != reverse(n))
            return false;

        return isPrime(n);
    }
    private static int reverse(int n) {
        /**
         * input  123
         * output 321
         *
         * FORMULA
         * sum = (sum*10) + (n%10);
         * n  /= 10;
         *
         * (((0)))
         * n   = 123
         * sum = 0
         *
         * (((1)))
         * sum = (0*10) + (123%10)
         *     =   0    + 3
         *     = 3
         * n   = 123/10
         *     = 12
         *
         * (((2)))
         * sum = (3*10) + (12%10)
         *     =   30    + 2
         *     = 32
         * n   = 12/10
         *     = 1
         *
         * (((3)))
         * sum = (32*10) + (1%10)
         *     =  320    + 1
         *     = 321
         * n   = 1/10
         *     = 0
         */

        int sum = 0;

        while (n != 0){
            sum = (sum*10) + (n%10);
            n   /= 10;
        }

        return sum;
    }
    private static boolean isPrime( int n){
        if (n < 2)
            return false;
        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n%i == 0)
                return false;
        return true;
    }
    


   




    private static boolean isEmirp( int n) {
        return isPrime(n) && isPrime(reverse(n)) && !isPalindromicPrime(n);
    }
}
