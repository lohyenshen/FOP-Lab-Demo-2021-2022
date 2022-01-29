package L10.Q3;

import L10.Q2.MessageEncoder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShuffleCipher implements MessageEncoder {
    private String inputFileName, outputFileName;
    private int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
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


    /**
     *  **********************
     *  EVEN length
     *  **********************
     *  (6/2) = 3
     *
     *  012 345
     *  abc def
     *  adbecf
     *
     *
     *
     *  **********************
     *  ODD length
     *  **********************
     *  (5/2) = 2
     *  01 234
     *  ab cde
     *  acbde
     *
     *  (7/2) = 3
     *  012 3456
     *  abc defg
     *  adbecfg
     *
     *
     *
     *
     */
    @Override
    public String encode( String plainText) {
        StringBuilder sb  = new StringBuilder();
        int length        = plainText.length();
        int middle        = plainText.length()/2;

        // repeat for (N) times
        for (int n = 0; n < N; n++) {

            // repeat for (l/2) times
            for (int i = 0; i < length/2; i++) {
                sb.append( plainText.charAt(i) );
                sb.append( plainText.charAt(i+middle) );
            }
        }


        if (length%2 == 0)
            return sb.toString();
        else
            return sb.append( plainText.charAt(length-1) ).toString();
                              // last text
    }

    @Override
    public String decode( String cipherText) {
        StringBuilder front = new StringBuilder();
        StringBuilder back  = new StringBuilder();

        ////////////////////////////////////////
        int length = cipherText.length();
        if (length%2 == 1) //ODD
            length -= 1;
        ////////////////////////////////////////

        ////////////////////////////////////////
        for (int n = 0; n < N; n++) {

            for (int i = 0; i < length; i++) {
                char c = cipherText.charAt(i);

                if (i%2 == 0)
                    front.append(c);
                else
                    back.append(c);

            }
        }
        /**
         * length = 4
         * 0123   4
         * acbd   e
         *
         * front - ab
         * back  - cd
         *
         * front.append(back) - abcde
         */
        ////////////////////////////////////////

        StringBuilder combine = front.append(back);
        if (cipherText.length()%2 == 0)
            return combine.toString();
        else
            return combine.append( cipherText.charAt(cipherText.length()-1) ).toString();
                                   // last text
    }
}
