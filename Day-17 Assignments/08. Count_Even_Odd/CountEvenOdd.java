import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        int countEvenNumbers = 0;
        int countOddNumbers = 0;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        /*
         * for(int i=0; i<nums.length; i++){
         * if(nums[i] % 2 == 0){
         * countEvenNumbers++;
         * sumOfEvenNumbers += nums[i];
         * }else{
         * countOddNumbers++;
         * sumOfOddNumbers += nums[i];
         * }
         * }
         */

        // count even numbers and print
        System.out.print("All even numbers in array are : ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                countEvenNumbers++;
                sumOfEvenNumbers += nums[i];
                System.out.print(nums[i] + " ");
            }
        }

        // count Odd numbers and print
        System.out.print("\nAll odd numbers in array are : ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                countOddNumbers++;
                sumOfOddNumbers += nums[i];
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println("\nTotal even numbers in array : " + countEvenNumbers);
        System.out.println("Total odd numbers in array : " + countOddNumbers);
        System.out.println("Sum of total even numbers in array : " + sumOfEvenNumbers);
        System.out.println("Sum of total odd numbers in array : " + sumOfOddNumbers);

        sc.close();

    }
}
