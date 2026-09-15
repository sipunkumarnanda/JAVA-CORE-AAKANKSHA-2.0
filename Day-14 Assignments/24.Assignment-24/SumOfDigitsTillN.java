// 24.    Write a Java program to repeatedly accept numbers until the user enters 0, and then display the sum and count of all entered numbers using while.

import java.util.Scanner;

public class SumOfDigitsTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true){
            System.out.print("Enter number : ");
            int num = sc.nextInt();

            if(num == 0){
                break;
            }

            sum += num;
            count++;
        }

        System.out.println("sum is : " + sum + "\ncount of all entered number : " + count);
        sc.close();
    }
}
