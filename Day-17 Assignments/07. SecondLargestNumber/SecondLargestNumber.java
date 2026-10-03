
import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        int largestElem = Integer.MIN_VALUE;
        int secondLargestElem = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestElem) {
                secondLargestElem = largestElem;
                largestElem = nums[i];
            } else if (nums[i] > secondLargestElem && nums[i] < largestElem) {
                secondLargestElem = nums[i];
            }
        }
        if (secondLargestElem == Integer.MIN_VALUE) {
            System.out.println("Thre is no distinct second largest number in array");
        } else {
            System.out.println("Second Largest element in array is : " + secondLargestElem);
        }
        sc.close();
    }
}
