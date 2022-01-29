package L6;

public class Q2 {
    public static void main(String[] args) {
        // TRIANGLE
        printTriangle( 5 );

        System.out.println();

        // DIAMOND
        printDiamond( 11 );
    }


    private static void printTriangle( int triangle_height) {
        for (int i=0 ; i<triangle_height ; i++){          //Printing triangle
            multiPrint (triangle_height-i,' ');      //left space
            multiPrint(i+1+i , '*');                 //number of stars
            System.out.println();                         //Space a line
        }
    }

    private static void printDiamond( int diamond_height) {
        int half_height = diamond_height/2;

        // UPPER part
        for (int i=0 ; i<half_height ; i++){
            multiPrint (half_height-i,' ');         //left space
            multiPrint(i+1+i , '*');                //number of stars
            System.out.println();                     //Space a line
        }

        // MIDDLE part (if height is ODD)
        if(diamond_height%2 == 1) {
            multiPrint(half_height + 1 + half_height, '*');
            System.out.println();
        }

        // DOWN part
        for(int i=half_height-1; i>=0; i--){             //Printing lower part of diamond
            multiPrint (half_height-i,' ');         //left space
            multiPrint(i+1+i , '*');                //number of stars
            System.out.println();                     //Space a line
        }
    }

    private static void multiPrint( int n, char c){
        for (int i = 0; i < n; i++)
            System.out.print(c);
    }
}
