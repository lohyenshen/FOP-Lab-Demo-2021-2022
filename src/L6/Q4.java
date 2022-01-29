package L6;

public class Q4 {
    public static void main(String[] args) {
        System.out.println( greatestCommonDivisor( 24,    8) );
        System.out.println( greatestCommonDivisor( 200, 625) );
    }


    private static int greatestCommonDivisor( int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return greatestCommonDivisor( b, a%b);
    }
    /**
     * https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm
     *
     *
     * If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.
     * If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.
     *
     * Write A in quotient remainder form (A = B⋅Q + R)
     * Find GCD(B,R) using the Euclidean Algorithm
     *      - since GCD(A,B) = GCD(B,R)
     */
}
