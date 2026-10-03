import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nums[] = new int[10];

        // insert elem to array
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            boolean hasSeen = false;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    hasSeen = true;
                    break;
                }
            }
            if (!hasSeen) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
            }
            if (count != 1) {
                System.out.println(nums[i] + " : " + count + " times");
            }
        }
        sc.close();
    }
}
