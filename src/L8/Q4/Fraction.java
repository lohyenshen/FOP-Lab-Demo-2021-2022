package L8.Q4;

public class Fraction {
    private int numerator, denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void displayFraction() {
        int gcd = gcd( denominator, numerator);

        // gcd = 3
        // 9/6 = 3/2
        denominator /= gcd;
        numerator   /= gcd;

        if (denominator == 1)
            System.out.println("The simplest fraction is " + numerator);
        else
            System.out.println("The simplest fraction is " + numerator + "/" + denominator);
    }

    // learnt in previous lab
    private int gcd( int a, int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        return gcd( b, a%b);
    }
}
