package L8.Q1;

import java.util.Arrays;
import java.util.Random;

/**
 * all items
 * even numbers
 * prime numbers
 * maximum number
 * minimum number
 * average
 * square number
 */
public class Number {
    private static final int NUM_OF_NUMBERS=10;
    private static final int MIN_VALUE=0, MAX_VALUE=100;
    private static Random rd = new Random();
    private int[] numbers;


    // constructors
    public Number(){
        numbers = new int[NUM_OF_NUMBERS];
        generateRandomNumbers( MAX_VALUE );
    }

    public Number( int num_of_numbers){
        numbers = new int[num_of_numbers];
        generateRandomNumbers( MAX_VALUE );
    }

    public Number( int num_of_numbers, int max_value){
        numbers = new int[num_of_numbers];
        generateRandomNumbers( max_value );
    }

    // this method is only used within this class
    private void generateRandomNumbers( int max_value) {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = rd.nextInt( max_value-MIN_VALUE+1) + MIN_VALUE;
    }

    public void all(){
        System.out.print("All numbers: ");
        for (int n : numbers)
            System.out.printf(n + " ");
        System.out.println();
    }

    public void even(){
        System.out.print("All even numbers: ");
        for (int n : numbers)
            if (n%2 == 0)
                System.out.printf(n + " ");
        System.out.println();
    }

    public void prime(){
        System.out.print("All prime numbers: ");
        for (int n : numbers)
            if (isPrime(n))
                System.out.printf(n + " ");
        System.out.println();
    }

    private boolean isPrime( int n){
        if (n < 2)
            return false;
        if (n == 2)
            return true;

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n%i == 0)
                return false;

        return true;
    }

    public void max(){
        System.out.print("Max number: ");
        int max = Integer.MIN_VALUE;
        for (int n : numbers)
            if (n > max)
                max = n;
        System.out.println(max);
    }

    public void min(){
        System.out.print("Min number: ");
        int min = Integer.MAX_VALUE;
        for (int n : numbers)
            if (n < min)
                min = n;
        System.out.println(min);
    }

    public void average(){
        System.out.print("Average: ");
        double sum = 0;
        for (int n : numbers)
            sum += n;
        System.out.println( sum/numbers.length );
    }

    public void square(){
        System.out.print("All square numbers: ");
        for (int n : numbers)
            if (isSquare(n))
                System.out.printf(n + " ");
        System.out.println();
    }

    /**
     * 0 1 2 3 4 5 6
     * 0 1 4 9 16 25
     *
     */
    public boolean isSquare( int n){
        return Math.sqrt(n)%1 == 0;
    }

    public void allMethods(){
        all();
        even();
        prime();
        max();
        min();
        average();
        square();
        System.out.println();
    }
}
