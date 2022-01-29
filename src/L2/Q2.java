package L2;

/**
 * - (calculate) the monthly payment for car loan
 * - inputs
 *      P The price of the car
 *      D Down payment
 *      R Interest Rate in %
 *      Y Loan duration in year
 *      M Monthly Payment
 *
 * - process
 *      M = (P – D) * (1 + R*Y/100) / (Y *12)
 *
 * - output in (2 decimal places)
 */
public class Q2 {
    public static void main(String[] args) {
        double P = 100_000;
        double D = 20_000;
        double R = 6;
        double Y = 10;

        double M = (P-D) * (1 + (R*Y/100) ) / (Y*12);
        /**
         * =  80_000 * (1.6) / 120
         * = 128_000 / 120
         * = 1066.66666666667
         */
        System.out.printf("Monthly payment = %.2f", M);
    }
}
