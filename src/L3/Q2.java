package L3;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(6); // 0-5

        switch (n) {
            case 0 -> System.out.println(n + " is zero");
            case 1 -> System.out.println(n + " is one");
            case 2 -> System.out.println(n + " is two");
            case 3 -> System.out.println(n + " is three");
            case 4 -> System.out.println(n + " is four");
            case 5 -> System.out.println(n + " is five");
        }
    }
}
