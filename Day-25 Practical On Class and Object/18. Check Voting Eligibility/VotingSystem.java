/*
18. Write a Java program to create a `VotingSystem` class with a method to check voting eligibility based on age.
*/

import java.util.Scanner;

public class VotingSystem {
    public static boolean checkvotingEligibility(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(checkvotingEligibility(age)){
            System.out.println("Your age is " + age + ", so you are eligible for voting");
        }else{
             System.out.println("Your age is " + age + ", so you are not eligible for voting");
        }
        sc.close();
    }
}
