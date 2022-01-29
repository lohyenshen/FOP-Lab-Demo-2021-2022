package L7;

import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream( new FileInputStream("person.dat") );

            int numOfRecord  = in.readInt();
            String[] names   = new String[numOfRecord];
            int[]    ages    = new int[numOfRecord];
            char[]   genders = new char[numOfRecord];


            // read each person
            for (int i = 0; i < numOfRecord; i++) {
                names[i]   = in.readUTF();
                ages[i]    = in.readInt();
                genders[i] = in.readChar();
            }

            System.out.println("BEFORE");
            print(  names, ages, genders);

            sortByName( names, ages, genders);

            System.out.println("AFTER");
            print(  names, ages, genders);

            in.close();
        }
        catch (FileNotFoundException e){
            System.out.print(e);
        }
        catch (IOException e){
            System.out.print(e);
        }
    }


    // same with bubble sort
    // difference (instead of swapping 1 array, we are swapping 3 arrays at the same time)
    private static void sortByName( String[] names, int[] ages, char[] genders) {
        for (int i = 0; i < names.length; i++) {
            for (int k = 1; k < names.length-i; k++) {

                    // swap if bigger name
                    if (names[k-1].compareTo(names[k]) > 0){

                        // swap name
                        String tempName = names[k-1];
                        names[k-1] = names[k];
                        names[k] = tempName;

                        // swap age
                        int tempAge = ages[k-1];
                        ages[k-1] = ages[k];
                        ages[k] = tempAge;

                        // swap gender
                        char tempGender = genders[k-1];
                        genders[k-1] = genders[k];
                        genders[k] = tempGender;
                    }
            }
        }
    }

    private static void print( String[] names, int[] ages, char[] genders) {
        System.out.printf("%-20s%-20s%-10s\n", "Name", "Age", "Gender");

        for (int i = 0; i < names.length; i++)
            System.out.printf("%-20s%-20d%-10c\n", names[i], ages[i], genders[i]);
        System.out.println();
    }
}
