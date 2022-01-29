package L9.Q2;

import java.io.*;
import java.util.Scanner;

/**
 * Derived a Student class from PersonProfile.
 * The Student class has a list of
 * course name and course code, semester, session, mark and a file name.
 * The class consists of a constructor with student profile and file input name.
 *
 *
 * Create a getGrade method for the mark base on the table below:
 *
 * The Student object can display the student profile as well as course details and the
 * result in grade
 */
public class Student extends PersonProfile{
    private String courseList[][];
    private String filename ;


    public Student( String name, String gender, String dateOfBirth, String filename) {
        super(name, gender, dateOfBirth);
        this.filename = filename;
        courseList = new String[ countCourse(filename) ][5];
        this.getCourse(filename);
    }

    private void getCourse(String filename){
        try {
            Scanner in = new Scanner(new FileInputStream(filename));

            ////////////////////////////////////////
            while (in.hasNextLine())
                for (String[] course : courseList)
                    for (int i = 0; i < course.length; i++)
                        course[i] = in.nextLine();
            ////////////////////////////////////////

            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    private int countCourse( String filename){
        int count = 0;
        try {
            Scanner in = new Scanner(new FileInputStream(filename));

            ////////////////////////////////////////
            while (in.hasNextLine()){
                count++;
                in.nextLine();
            }
            ////////////////////////////////////////

            in.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }

        return count/5; // 5 lines of infos make up 1 course
    }


    public void displayCourseList() {
        System.out.println("--- COURSE LIST ---");
        for (int i = 0; i < courseList.length; i++) {
            System.out.println("Course " + (i + 1) + "  : ");
            for (int j = 0; j < courseList[i].length; j++) {
                System.out.println(courseList[i][j]);
            }
        }
    }

    public void displayGrades() {
        System.out.println("--- GRADE --- ");

        for (int i = 0; i < courseList.length; i++) {
            String grade = "";
            int x = Integer.parseInt(courseList[i][4]);

            if (x >= 85) {
                grade = "A";
            } else if (x >= 75) {
                grade = "A-";
            } else if (x >= 70) {
                grade = "B+";
            } else if (x >= 65) {
                grade = "B";
            } else if (x >= 60) {
                grade = "B-";
            } else if (x >= 55) {
                grade = "C+";
            } else if (x >= 50) {
                grade = "C";
            } else if (x >= 45) {
                grade = "D";
            } else if (x >= 35) {
                grade = "E";
            } else {
                grade = "F";
            }
            System.out.println("The grade for " + courseList[i][1] + " is " + grade);
        }
    }
}
