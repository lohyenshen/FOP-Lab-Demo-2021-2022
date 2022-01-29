package L10.Q2;

import java.io.*;
import java.util.Scanner;

public class SubstitutionCipher implements MessageEncoder{
    private String inputFileName, outputFileName;
    private int shift;

    public SubstitutionCipher( String inputFileName, String outputFileName, int shift) {
        //the input is get from the inputFileName.txt
        this.inputFileName = inputFileName;

        //the output will be transferred into outputFileName.txt
        this.outputFileName = outputFileName;

        //set the number of shift
        this.shift = shift;
    }

    public void read_plain_output_cipher(){
        try {
            Scanner in = new Scanner(new FileInputStream(this.inputFileName));
            PrintWriter out = new PrintWriter(new FileOutputStream(this.outputFileName));

            ///////////////////////////////////////////////////////////////////////////////
            while (in.hasNextLine()) {
                String l = in.nextLine();
                               ////////
                out.println(   encode(l)   );
            }
            ///////////////////////////////////////////////////////////////////////////////

            in.close();
            out.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }

    public void read_cipher_output_plain(){
        try {
            Scanner in = new Scanner(new FileInputStream(this.inputFileName));
            PrintWriter out = new PrintWriter(new FileOutputStream(this.outputFileName));

            ///////////////////////////////////////////////////////////////////////////////
            while (in.hasNextLine()) {
                String l = in.nextLine();
                ////////
                out.println(   decode(l)   );
            }
            ///////////////////////////////////////////////////////////////////////////////

            in.close();
            out.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("The file is not found");
        }
    }




    // a + 3  = d
    @Override
    public String encode( String plainText) {
        StringBuilder sb = new StringBuilder();

        for (char c : plainText.toCharArray())
            sb.append( (char)(c+shift) );

        return sb.toString();
    }

    // d - 3 = a
    @Override
    public String decode(String cipherText) {
        StringBuilder sb = new StringBuilder();

        for (char c : cipherText.toCharArray())
            sb.append( (char)(c-shift) );

        return sb.toString();
    }
}
