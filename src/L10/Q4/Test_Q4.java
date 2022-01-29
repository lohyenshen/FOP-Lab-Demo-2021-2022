package L10.Q4;

/**
 * Create an interface Searchable
 * that has a single method search(dateStarttime, dateEndTime).
 * The method return true if the date and time is available.
 *
 * Create an Appointment class.
 * The appointment class has the day, month, year, startTime in hour and endTime in hour.
 * The class has the method to save the appointment in text file.
 * Define a method to search whether the appointment is available given the search date and time before adding new appointment.
 *
 *
 * Create a Tester class to test the program
 */
public class Test_Q4 {
    public static void main(String[] args) {
        /** let f = (10 - 12) */
        Appointment a1 = new Appointment(1,1,2000,1000,1200);

        Appointment a2 = new Appointment(1,1,2000,800,1400);
        Appointment a3 = new Appointment(1,1,2000,1100,1200);
        Appointment a4 = new Appointment(1,1,2000,800,900);   // accept
        Appointment a5 = new Appointment(1,1,2000,900,1100);
        Appointment a6 = new Appointment(1,1,2000,1300,1400); // accept
        Appointment a7 = new Appointment(1,1,2000,1100,1300);

        System.out.println("Appointment saved");
        Appointment[] as = {a1, a2, a3, a4, a5, a6, a7};
        for (Appointment a : as)
            if (a.search())
                a.save();
    }
}
