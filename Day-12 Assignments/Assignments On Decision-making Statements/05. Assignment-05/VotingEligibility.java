
/*
5. Write a Java program to accept a person's age and citizenship status and determine whether the person is eligible to vote using nested if-else.
*/

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        System.out.println("Enter the cictizenship : ");
        String citizenShip = sc.next();
        citizenShip = citizenShip.toUpperCase();

        System.out.println(+age + " "+ citizenShip);

        if(age >= 18 && citizenShip.equals("INDIAN")){
            System.out.println("You are eligible to give vote");
        }else{
            System.out.println("You are not eligible to give vote");
        }
        sc.close();
    }
}