/*
14. Search and Position Write a Java program to input 10 integers into an array and search for a number entered by the user.
If found, display:Whether it existsIts first position/indexNumber of times it occursIf not found, display an appropriate message.
*/

import java.util.Scanner;

public class SearchAndPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        // insert elem to array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target element : ");
        int target = sc.nextInt();

        // search index
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] == target) {
                count++;
            }
        }

        if (position != -1) {
            System.out.println("Target element " + target + " first appeared at index " + position);
            System.out.println("Target element " + target + " appeared " + count + " times");
        } else {
            System.out.println("Target element " + target + " is not present in the given array");
        }

        sc.close();
    }
}
