package L7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int numLine = 0, numWords = 0, numChar = 0;

        try {
            Scanner in = new Scanner( new FileInputStream("original.txt"));

            while (in.hasNextLine()){
                String line = in.nextLine();
                numLine++;

                                            // split by space
                String[] words = line.split("\\s+");
                numWords += words.length;

                for (String word : words)
                    numChar += word.length();
            }
            in.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e) {
            System.out.println("Problem with file output");
        }


        System.out.println("The number of lines is " + numLine);
        System.out.println("The number of words is " + numWords);
        System.out.println("The number of characters EXCLUDING space is " + numChar);
    }
}
