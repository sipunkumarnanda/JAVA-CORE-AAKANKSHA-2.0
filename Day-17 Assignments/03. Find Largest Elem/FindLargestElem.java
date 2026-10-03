import java.util.Scanner;

public class FindLargestElem {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        int largestElem = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > largestElem){
                largestElem = nums[i];
            }
        }
        System.out.println("Largest element in array is : " +largestElem);

        sc.close();
    }
}
