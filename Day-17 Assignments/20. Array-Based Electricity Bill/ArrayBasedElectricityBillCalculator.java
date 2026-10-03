/*
20. Array-Based Electricity Bill Calculator Write a Java program to input the electricity units 
consumed by 10 customers into an array.
Calculate the bill for each customer using : Units 
Rate 0–100 ₹2/unit
101–200 ₹3/unit
201–300 ₹5/unit
Above 300 ₹7/unit For every customer, 
display:Customer No. | Units | Bill | Category
Also display:Highest billL owest bill 
Total revenueNumber of customers consuming more than 300 units
*/

import java.util.Scanner;

public class ArrayBasedElectricityBillCalculator {

    public static double calculateBill(int units) {
        double bill = 0.0;
        if (units <= 100) {
            bill += units * 2.0;
        } else if (units <= 200) {
            bill += (100.00 * 2.00) + ((units - 100.00) * 3.00);
        } else if (units <= 300) {
            bill += (100.00 * 2.00) + (100.00 * 3.00) + (units - 200.00) * 5;
        } else {
            bill += (100.00 * 2.00) + (100.00 * 3.00) + (100.00 * 5.00) + ((units - 300) * 7.00);
        }
        return bill;
    }

    // find category
    public static String getCategory(int units) {
        if (units <= 100) {
            return "0-100 units";
        } else if (units <= 200) {
            return "101-200 units";
        } else if (units <= 300) {
            return "201-300 units";
        } else {
            return "Above 300 units";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units[] = new int[10];

        System.out.println("Enter Electricity units consumed by customer");
        for (int i = 0; i < units.length; i++) {
            System.out.print("Enter units of customer " + (i + 1) + " : ");
            units[i] = sc.nextInt();
        }

        int highestBill = Integer.MIN_VALUE;
        int lowestBill = Integer.MAX_VALUE;
        double totalRevenue = 0.00;
        int countCustomerConsumedOver300Units = 0;

        for (int i = 0; i < units.length; i++) {
            System.out.println("Customer No : " + (i + 1));
            System.out.println("Units : " + units[i]);
            System.out.println("Bill ₹:" + calculateBill(units[i]));
            System.out.println("Category : " + getCategory(units[i]));
            System.out.println();

            // calculate lowest bill in units
            if (units[i] < lowestBill) {
                lowestBill = units[i];
            }
            // calculate heighest bill in units
            if (units[i] > highestBill) {
                highestBill = units[i];
            }
            // customer consumed more than 300 units
            if (units[i] > 300) {
                countCustomerConsumedOver300Units++;
            }
            // total revenue calculation
            totalRevenue += calculateBill(units[i]);
        }
        System.out.println("Highest bill ₹: " + calculateBill(highestBill));
        System.out.println("Lowest bill ₹: " + calculateBill(lowestBill));
        System.out.println("Total Revenue ₹: " + totalRevenue);
        System.out.println("Number of customers consumed more than 300 units : " + countCustomerConsumedOver300Units);
        sc.close();
    }
}
