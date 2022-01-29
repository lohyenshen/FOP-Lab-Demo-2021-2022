package L4;

import java.util.Scanner;

/**
 * input:
 *      - enter year
 *      - enter first day of year [0,6]
 *      - 0 (Sunday)
 *      - 1 (Monday)
 *      - ....
 *      - 6 (Saturday)
 *
 * output:
 *      - calendar for May and August
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        System.out.print("Enter first day of the year: ");
        int first_day = sc.nextInt();


        //         Jan + Feb + Mar + April
        int days =  31 +  28 +  31 + 30;
        if (isLeapYear(year))
            days += 1;

        // move first_day to "May"
        first_day += days;
        printCalendar( "May", (first_day%7), 31);


        // move first_day to "August"
        //           May + June + July
        first_day +=  31 +   30 + 31;
        printCalendar( "August", (first_day%7), 31);
    }
    private static boolean isLeapYear( int y) {
        return (y%4==0 && y%100!=0)     ||     (y%400==0);
    }

    private static void printCalendar( String month, int day, int totalDaysInMonth){
        System.out.println("\n\n");
        System.out.printf("%s   %s   %s\n",          "-".repeat(10), month,  "-".repeat(10)  );
        System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun","Mon","Tue","Wed","Thu","Fri","Sat");


        // print the (empty spaces) before 1st day of month
        for (int i = 0; i < day; i++)
            System.out.printf("%5s", " ");


        // print the (days) in a month              /////
        for (int i=1; i <= totalDaysInMonth ; i++,  day++) {

            // move to next line if (sunday)
            if (day%7 == 0)
                System.out.println();

            System.out.printf("%5d", i);
        }
    }
}
