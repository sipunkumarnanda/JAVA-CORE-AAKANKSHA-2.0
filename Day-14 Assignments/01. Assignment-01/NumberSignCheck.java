
// 1. Write a Java program to input a number and check whether it is positive, negative, or zero using if-else.

import java.util.Scanner;

class NumberSignCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number you want to check is this negative , positive or zero : ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(+num + " is a positive number");
        }else if(num < 0){
            System.out.println(+num + " is a negative number");
        }else{
            System.out.println(+num + " is Zero");
        }
        sc.close();
    }
}