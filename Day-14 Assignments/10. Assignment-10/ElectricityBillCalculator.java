
// 10.    Write a Java program to input an electricity consumption unit and calculate the electricity bill using an else-if ladder.

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter electricity consumption units : ");
        double units = sc.nextFloat();

        double billAmount = 0.00;

        if (units < 0.00) {
            System.out.println("Invalid input , input can not be negative");
        } else if (units <= 100) {
            billAmount = units * 3.00;
        } else if (units <= 200) {
            billAmount = (100 * 3.00) + (units - 100) * 4.00;
        } else if (units <= 300) {
            billAmount = (100 * 3.00) + (100 * 4.00) + ((units - 200) * 5);
        } else {
            billAmount = (100 * 3.00) + (100 * 4.00) + (100 * 5.00) + ((units - 300) * 6);
        }

        if (units >= 0.00) {
            System.out.println("Electricity bill statements");
            System.out.println("Total units consumed : " + units);
            System.out.println("Payable Amount : " + billAmount);
        }
        sc.close();
    }
}
