package L10.Q4;

import java.io.*;
import java.util.*;

/**
 * The appointment class has the day, month, year, startTime in hour and endTime in hour.
 * The class has the method to save the appointment in text file.
 */

// assumption = appointment is within (((SAME DAY)))
public class Appointment implements Searchable{
    private int day, month, year, startTime, endTime;

    public Appointment(  int day, int month, int year, int startTime, int endTime) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    @Override
    public boolean search() {
        try{
            Scanner in = new Scanner( new FileInputStream("appointment.txt"));

            ////////////////////////////////////////////////////
            while (in.hasNextLine()){
                // f = from text file
                String[] f      = in.nextLine().split("/");
                int day_f       = Integer.parseInt( f[0] );
                int month_f     = Integer.parseInt( f[1] );
                int year_f      = Integer.parseInt( f[2] );
                int startTime_f = Integer.parseInt( f[3] );
                int endTime_f   = Integer.parseInt( f[4] );


                // only check if same day, check for the time
                // if not same day, we just skip, cuz definitely not clash
                if (day_f==day && month_f==month && year_f==year){



                    if (
                            startTime == startTime_f ||
                            startTime == endTime_f   ||
                            endTime   == startTime_f ||
                            endTime   == endTime_f
                    )
                        return false;


                    /** let f = (10 - 12) */


                    // c (8 - 14)
                    if (startTime < startTime_f && endTime > endTime_f)
                        return false;

                    // c (11 - 12)
                    if (startTime>=startTime_f && endTime<=endTime_f)
                        return false;

                    // c (8 - 9)           accepted
                    // c (9 - anytime>10)  reject
                    if (startTime<startTime_f && endTime>=startTime_f)
                        return false;

                    // c (13 - 14)          accept
                    // c (anytime<10 - 13) reject
                    if (endTime>endTime_f && startTime<=endTime_f)
                        return false;
                }
            }
            ////////////////////////////////////////////////////

            in.close();
        }
        catch (FileNotFoundException e){
            System.out.println("The file not found");
        }

        // return true if "check" does not clash with any of the appointment in text file
        return true;
    }

    public void save(){
        try {
            //"true" == append to file
            PrintWriter out = new PrintWriter(new FileOutputStream("appointment.txt" ,true));

            ////////////////////////////////////////////////////
            out.println( day + "/" + month + "/" + year + "/" + startTime + "/" + endTime);
            out.close();
            ////////////////////////////////////////////////////

            System.out.println(
                    "Appointment{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    ", startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}');
        }
        catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}
