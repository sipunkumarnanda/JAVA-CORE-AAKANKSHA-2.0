/*
17. Reverse Array with Conditions Write a Java program to input 10 integers into an array and display the array in reverse order.
While displaying the reversed array:Replace positive even numbers with "EVEN"Replace positive odd numbers with "ODD"Replace negative numbers 
with "NEGATIVE"Replace zero with "ZERO"
*/

import java.util.Scanner;

public class ReverseArrayWithCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[10];

        // insert elem to array
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        String revArr[] = new String[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= 0) {
                if(nums[i] == 0){
                    revArr[(nums.length-1)-i] = "ZERO";
                }
                else if (nums[i] % 2 == 0) {
                    revArr[(nums.length-1)-i] = "EVEN";
                }else{
                    revArr[(nums.length-1)-i] = "ODD";
                }
            } else {
                if (nums[i] < 0) {
                    revArr[(nums.length-1)-i] = "NEGATIVE";
                }
            }
        }

        System.out.print("REVERSE ARRAY : ");
        for (int i = 0; i < revArr.length; i++) {
            System.out.print(revArr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
