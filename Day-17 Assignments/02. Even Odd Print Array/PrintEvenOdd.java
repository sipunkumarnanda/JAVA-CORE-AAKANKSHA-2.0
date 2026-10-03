import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i] + " is Even");
            } else {
                System.out.println(nums[i] + " is Odd");
            }
        }

        sc.close();
    }
}
