package L7;

import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;

public class Q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);


            ///////////////////////////////////////////////////////////////////////////////////////////
            PrintWriter out = new PrintWriter( new FileOutputStream("index.html") );

            // copy the content of website
            while (in.hasNextLine())
                out.println( in.nextLine() );
            ///////////////////////////////////////////////////////////////////////////////////////////


            in.close();
            out.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
