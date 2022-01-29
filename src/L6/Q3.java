package L6;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int [] array;
        array = new int[] {1,2,3,4,5,6,7,8,9,10};
//        array = new int[] {1,2,3,4};
//        array = new int[] {1,2,3,4,5};

        reverseArray( array );
        System.out.println(Arrays.toString(array));
    }

    private static void reverseArray( int[] array) {
        /**
         * ---------------
         * EVEN LENGTH
         * ---------------
         * length    = 4
         * mid_index = 2
         * 0 1 2 3
         *     ~
         *
         * ---------------
         * ODD LENGTH
         * ---------------
         * length = 5
         * mid_index = 2
         * 0 1 2 3 4
         *     ~
         */
        int middleIndex = array.length/2;
        int k;
        for (int i = 0; i < middleIndex; i++) {
            k = array.length-1-i;

            // swap
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    }
}
