import java.util.Scanner;

public class SignNumberCalculator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int nums[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter num" + (i + 1) + " : ");
            nums[i] = sc.nextInt();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < 0){
                negativeCount++;
            }else if(nums[i] > 0){
                positiveCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.println("Total positive numbers : " +positiveCount);
        System.out.println("Total negative numbers : " +negativeCount);
        System.out.println("Total zeros : " +zeroCount);

        sc.close();
    }
}
