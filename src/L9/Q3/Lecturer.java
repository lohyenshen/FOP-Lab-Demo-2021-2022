package L9.Q3;

import L9.Q2.PersonProfile;

import java.util.Scanner;
import java.io.*;
/**
 * Derived a class Lecturer from class PersonProfile.
 *
 * The class has a list of course name,course code, semester, session, credit hour and the number of students registered.
 * All information is retrieved from a text file named lecturer.txt.
 *
 *
 * Write a method to compute the credit hour.
 * If the number of students is more than or equal to 150,
 * multiply the credit hour by 3,
 *
 * if less than 150 and more than or equal to 100,
 * multiply the credit hour by 2.
 *
 * If less than 100 and more than or equal to 50,
 * multiply the credit hour by 1.5.
 *
 * Otherwise multiply the credit hour by 1.
 *
 * The lecture object can display the lecturer profile as well as the course profile with the updated credit hour.
 * Create a Tester class to test the program.
 */
public class Lecturer extends PersonProfile {
    private String[] courseName, courseCode;
    private int[] semester, session, numOfStudents;
    private double[] creditHour;

    public Lecturer( String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        this.inputCourse(filename);
        this.computeCreditHour();
    }

    private void inputCourse(String filename){
        int numberOfCourse = this.countCourse(filename);
        courseName    = new String[numberOfCourse];
        courseCode    = new String[numberOfCourse];
        semester      = new int[numberOfCourse];
        session       = new int[numberOfCourse];
        creditHour    = new double[numberOfCourse];
        numOfStudents = new int[numberOfCourse];

        try {
            Scanner in = new Scanner(new FileInputStream(filename));

            //////////////////////////////////////////////////////////////
            int i = 0;
            while (in.hasNextLine()) {
                courseCode[i] = in.nextLine();
                courseName[i] = in.nextLine();
                session[i] = in.nextInt();
                semester[i] = in.nextInt();
                creditHour[i] = in.nextDouble();
                numOfStudents[i] = in.nextInt();

                if (!in.hasNextLine())
                    break;

                i++;
                in.nextLine();
            }
            //////////////////////////////////////////////////////////////

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    private int countCourse(String filename){
        int count = 0;
        try {
            Scanner in = new Scanner(new FileInputStream(filename));

            //////////////////////////////////////////////////
            while (in.hasNextLine()) {
                count++;
                in.nextLine();
            }
            //////////////////////////////////////////////////

            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
        return count/6;
    }

    private void computeCreditHour() {
        for (int i = 0; i < creditHour.length; i++) {
            if (numOfStudents[i] >= 150)
                creditHour[i] *= 3;
            else if (numOfStudents[i] >= 100)
                creditHour[i] *= 2;
            else if (numOfStudents[i] >= 50)
                creditHour[i] *= 1.5;
        }
    }

    public void displayCourses() {
        for (int i = 0; i < creditHour.length; i++) {
            System.out.println("The course code is " + courseCode[i]);
            System.out.println("The course name is " + courseName[i]);
            System.out.println("It is semester  " + semester[i]);
            System.out.println("It is session " + session[i]);
            System.out.println("Its credit hour is " + creditHour[i]);
            System.out.println("The number of students is " + numOfStudents[i]);
            System.out.println();
        }
    }
}
