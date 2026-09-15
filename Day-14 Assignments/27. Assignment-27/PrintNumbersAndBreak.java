// 27.    Write a Java program to print numbers from 1 to 100 and terminate the loop when the number reaches 50 using break.

import java.util.Scanner;

public class PrintNumbersAndBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + ", ");
            if (i == 50)
                break;

            if (i % 10 == 0) { // To print 10 numbers on each line
                System.out.println();
            }

        }
        sc.close();
    }
}
