package L7;

import java.io.*;
import java.util.Scanner;

/**
 * Hi there,
 * This week lab is file
 * Good luck solving lab questions
 * Bye
 */


public class Q3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner( new FileInputStream("original.txt") );
            PrintWriter out = new PrintWriter( new FileOutputStream("reverse.txt") );

            while (in.hasNextLine()){
                String s = in.nextLine();

                // print in reverse
                for (int i=s.length()-1; i >=0 ; i--)
                    out.print( s.charAt(i) );

                out.println();
            }

            in.close();
            out.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
