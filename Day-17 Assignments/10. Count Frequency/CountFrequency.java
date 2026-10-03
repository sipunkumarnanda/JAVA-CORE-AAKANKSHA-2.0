/*
10. Count Frequency of an Element Write a Java program to input 10 integers into an array and input another number from the user. 
Find how many times that number occurs in the array.Example:Array: 10 20 10 30 10 40Search: 10Output: 10 occurs 3 times
*/

import java.util.Scanner;

public class CountFrequency {

    public static int countFrequency(int nums[], int target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        int stop = 1;
        while (stop != 0) {
            System.out.print("Enter the target number : ");
            int target = sc.nextInt();
            int result = countFrequency(nums, target);
            if (result > 0) {
                System.out.println(target + " occures " + result + " times");
            } else {
                System.out.println("Targeted number " + target + " does not appeared in array");
            }
            System.out.print("\nPress 0 for exist Or Pess 1 for continue : ");
            stop = sc.nextInt();
            System.out.println();
        }
        sc.close();
    }
}
