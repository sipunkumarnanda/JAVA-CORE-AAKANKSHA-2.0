/*
12. Find Largest and Smallest Write a Java program to input 10 integers into an array and find the largest and smallest numbers.
Also display whether the difference between them is:Greater than 50Between 20 and 50Less than 20
*/

import java.util.Scanner;

public class FindLargestSmallestAndDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[10];

        int largestElem = Integer.MIN_VALUE;
        int smallestElem = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter num " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
            if (nums[i] > largestElem) {
                largestElem = nums[i];
            }
            if (nums[i] < smallestElem) {
                smallestElem = nums[i];
            }
        }

        int difference = largestElem - smallestElem;

        if (difference > 50) {
            System.out.println("Difference between " + smallestElem + " and " + largestElem + " is grater than 50");
        } else if (difference >= 20 && difference <= 50) {
            System.out.println("Difference between " + smallestElem + " and " + largestElem + " is between 20 and 50");
        } else {
            System.out.println("Difference between " + smallestElem + " and " + largestElem + " is less than 20");
        }
        sc.close();
    }
}
