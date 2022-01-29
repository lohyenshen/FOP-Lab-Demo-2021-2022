package L2;

/**\
 * - (convert) Fahrenheit to Celsius
 * - display in (2 decimal places)
 */
public class Q1 {
    public static void main(String[] args) {
        double fahrenheit = 100;
        double celsius = (fahrenheit-32) / 1.8;

        // all decimal places
        System.out.println(celsius);

        // format into 2 decimal places
        System.out.printf("%.2f", celsius);
    }
}
