package L5;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = {57, 53, 46, 83, 74, 99, 30, 75, 61, 89, 28, 30, 56, 41, 27, 32, 79, 48, 46, 88};
        System.out.println("BEFORE SORTING");
        System.out.println(Arrays.toString(nums));

        sortDescending(nums);
        System.out.println("AFTER SORTING");
        System.out.println(Arrays.toString(nums));


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int n = sc.nextInt();

        System.out.println("Linear Search: " + linearSearchCount( nums, n)+ " loop(s)");
        System.out.println("Binary Search: " + binarySearchCount( nums, n)+ " loop(s)");
    }

    private static int binarySearchCount(int[] nums, int n) {
        int cnt = 0;
        int low = 0;
        int high = nums.length-1;
        int mid;

        while (low <= high){
            cnt++;
            mid = (low+high)/2;

            if (nums[mid] > n)
                low = mid+1;
            else if (nums[mid] == n){
                System.out.println(n + " found");
                return cnt;
            }
            else // nums[mid] < n
                high = mid-1;
        }

        System.out.println(n + " NOT found");
        return cnt;
    }

    private static int linearSearchCount(int[] nums, int n) {
        int cnt = 0;

        for (int num : nums){
            cnt++;

            if (num == n){
                System.out.println(n + " found");
                return cnt;
            }
        }

        System.out.println(n + " NOT found");
        return cnt;
    }

    private static void sortDescending(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i; j++) {

                if (nums[j-1] < nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
