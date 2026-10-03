/*
18. Menu-Driven Array Program Write a Java program using Scanner and switch to create a menu-driven program:1. Display all elements2. 
Find largest3. Find smallest4. Calculate sum5. Calculate average6. Count even numbers7. Count odd numbers8. Search an element9. 
ExitInput the array once and allow the user to select operations from the menu.
*/

import java.util.Scanner;

public class MenuDrivenArrayProgram {
    // Display all elements
    public static void displayAllElem(int nums[]) {
        System.out.print("All Elements of array are : ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // find largest element
    public static void findLargestElem(int nums[]) {
        // Find largest Element of array
        int largestElem = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestElem) {
                largestElem = nums[i];
            }
        }
        System.out.println("Largest element in array is : " + largestElem);
    }

    // find smallest element
    public static void findSmallestElem(int nums[]) {
        // Find largest Element of array
        int smallestElem = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallestElem) {
                smallestElem = nums[i];
            }
        }
        System.out.println("Smallest element in array is : " + smallestElem);
    }

    // calculate sum
    public static void calculateSum(int nums[]) {
        // Find largest Element of array
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum of all elements in array is : " + sum);
    }

    // calculate average
    public static void calculateAverage(int nums[]) {
        // Find largest Element of array
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Average of all elements in array is : " + (sum / nums.length));
    }

    // count even numbers
    public static void countEvenNumbers(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Total even numbers in array is : " + count);
    }

    // count odd numbers
    public static void countOddNumbers(int nums[]) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Total odd numbers in array is : " + count);
    }

    // search an element
    public static void searchAnElem(int nums[], int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(target + " is appeared first time at index : " + index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        // insert elem to array
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter num " + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        int exit = 1;
        while (exit != 0) {
            System.out.print("\nEnter 1 to display all elements\n" +
                    "Enter 2 to find the largest element\n" +
                    "Enter 3 to find the smallest element\n" +
                    "Enter 4 to calculate the sum of all elements\n" +
                    "Enter 5 to calculate the average\n" +
                    "Enter 6 to count even numbers\n" +
                    "Enter 7 to count odd numbers\n" +
                    "Enter 8 to search for an element\n" +
                    "Enter 9 to exit\n");
            System.out.print("Enter the menu number : ");
            int num = sc.nextInt();
            System.out.println();

            switch (num) {
                case 1:
                    displayAllElem(nums);
                    break;
                case 2:
                    findLargestElem(nums);
                    break;
                case 3:
                    findSmallestElem(nums);
                    break;
                case 4:
                    calculateSum(nums);
                    break;
                case 5:
                    calculateAverage(nums);
                    break;
                case 6:
                    countEvenNumbers(nums);
                    break;
                case 7:
                    countOddNumbers(nums);
                    break;
                case 8:
                    System.out.print("Enter the target number : ");
                    int target = sc.nextInt();
                    searchAnElem(nums, target);
                    break;
                case 9:
                    exit = 0;
                    break;
                default:
                    System.out.println("You have entered an invalid number, please try again");
                    break;
            }
        }
        sc.close();
    }

}
