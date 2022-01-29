package L5;

import java.util.Arrays;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int numberOfIntegers = 10;
        final int MIN=0, MAX=20;

        int[] verifyArray = new int [MAX+1];                 // index [0, 20], all values are 0
        int[] nonDuplicateArray = new int[numberOfIntegers];


        for (int i = 0; i < nonDuplicateArray.length; ) {
            int n = rd.nextInt(MAX-MIN+1) + MIN;

            //
            System.out.println(n);
            //
            if (verifyArray[n] == 0){
                verifyArray[n]++; // becomes 1 now
                nonDuplicateArray[i] = n;
                i++;
            }
            else{
                System.out.println(n + " is USED BEFORE!");
            }
        }

        System.out.println(Arrays.toString(nonDuplicateArray));
    }
}
