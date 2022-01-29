package L7;

import java.io.*;
import java.util.Scanner;

public class Q1 {
    /**
     * System.getProperty("user.dir")
     *
     * This will print the absolute path of the current directory from where your application was initialized.
     *
     */

    public static void main(String[] args) {
        createDatFile();
        searchCourseName();
    }



    private static void createDatFile() {
        try {
            // initialize required variables
            String[][] arr = {
                    {"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}
            };
            ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream( "course.dat") );


            // print the string into the .dat file
            for (int i = 0; i < arr.length; i++)
                for (int k = 0; k < arr[i].length; k++)
                    out.writeUTF( arr[i][k] );


            out.close();
        }
        catch (IOException e) {
            System.out.println("Problem with dat file output");
        }
    }

    private static void searchCourseName() {
        Scanner sc = new Scanner(System.in);
        String courseCode=null, courseName=null;
        boolean courseFound = false;

        // obtain input from user
        System.out.print("Enter course code: ");
        String inputCourseCode = sc.next();

        // open dat file
        try {
            ObjectInputStream in = new ObjectInputStream( new FileInputStream("course.dat") );

            // read file until end of file
            try {
                while (true){
                    courseCode = in.readUTF();
                    courseName = in.readUTF();

                    // course found
                    if (courseCode.equals(inputCourseCode)){
                        courseFound = true;
                        break;
                    }
                }
            }
            catch (EOFException e){}

            in.close();
        }
        catch (IOException e ){
            System.out.println("Problem with dat file input");
        }


        // print course code if courseFound
        if (courseFound)
            System.out.println("The name is = " + courseName);
        else
            System.out.println("Course not found");
    }
}
