/*
13. Array Element Classification Write a Java program to input 15 integers into an array and classify every 
number as: Positive EvenPositive OddNegative EvenNegative OddZeroDisplay the count of each category.
*/

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[15];

        int countPositiveEven = 0;
        int countPositiveOdd = 0;
        int countNegativeEven = 0;
        int countNegativeOdd = 0;
        int countZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter num " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    countPositiveEven++;
                } else {
                    countPositiveOdd++;
                }
            } else if (nums[i] < 0) {
                if (nums[i] % 2 == 0) {
                    countNegativeEven++;
                } else {
                    countNegativeOdd++;
                }
            } else {
                countZeros++;
            }
        }

        System.out.print("All positive even intiger : ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 == 0) {
                    System.out.print(nums[i] + ", ");
                }
            }
        }

        System.out.print("\nAll positive odd intiger : ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[i] % 2 != 0) {
                    System.out.print(nums[i] + ", ");
                }
            }
        }

        System.out.print("\nAll negative even intiger : ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (nums[i] % 2 == 0) {
                    System.out.print(nums[i] + ", ");
                }
            }
        }

        System.out.print("\nAll negative odd intiger : ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (nums[i] % 2 != 0) {
                    System.out.print(nums[i] + ", ");
                }
            }
        }

        System.out.println("\nTotal numbers of postive even intiger : " + countPositiveEven);
        System.out.println("Total numbers of postive odd intiger : " + countPositiveOdd);
        System.out.println("Total numbers of negative even intiger : " + countNegativeEven);
        System.out.println("Total numbers of negative odd intiger : " + countNegativeOdd);
        System.out.println("Total numbers of zeros : " + countZeros);

        sc.close();
    }
}
