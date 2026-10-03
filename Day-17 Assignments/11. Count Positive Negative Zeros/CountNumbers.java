/*
11. Separate Positive, Negative and Zero Write a Java program to input 15 integers into an array and separately 
display:Positive numbersNegative numbersZerosCount of each categorySum of positive numbersSum of negative numbers
*/

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[15];
        int sumOfPositive = 0;
        int sumOfNegative = 0;
        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter num " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
            if (nums[i] > 0) {
                sumOfPositive += nums[i];
                countPositive++;
            } else if (nums[i] < 0) {
                sumOfNegative += nums[i];
                countNegative++;
            } else {
                countZeros++;
            }
        }

        if (countPositive > 0) {
            System.out.print("All positive numbers in array are : ");
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    System.out.print(nums[i] + ", ");
                }
            }
        } else {
            System.out.println("\nThere is no positive number in the given array");
        }

        if (countNegative > 0) {
            System.out.print("\nAll negative numbers in array are : ");
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 0) {
                    System.out.print(nums[i] + ", ");
                }
            }
        } else {
            System.out.println("\nThere is no negative number in the given array");
        }

        if (countZeros > 0) {
            System.out.print("\nAll Zeros in array are : ");
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    System.out.print(nums[i] + ", ");
                }
            }
        } else {
            System.out.println("\nThere is no zero in the given array");
        }

        System.out.println();
        System.out.println("Total positive numbers in array is : " + countPositive);
        System.out.println("Total negative numbers in array is : " + countNegative);
        System.out.println("Total zeros in array is : " + countZeros);
        System.out.println("Sum of positive numbers in array is : " + sumOfPositive);
        System.out.println("Sum of negative numbers in array is : " + sumOfNegative);

        sc.close();

    }
}
