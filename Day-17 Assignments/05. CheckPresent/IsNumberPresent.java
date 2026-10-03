import java.util.Scanner;

public class IsNumberPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter a number , which you want to search on the array : ");
        int number = sc.nextInt();

        boolean isNumPresent = false;

        for (int i = 0; i < nums.length; i++) {
            if (number == nums[i]) {
                System.out.println(number + " is presnet on index " + i);
                isNumPresent = true;
                break;
            }
        }

        if (!isNumPresent) {
            System.out.println(number + " is not present in array");
        }

        sc.close();

    }
}
