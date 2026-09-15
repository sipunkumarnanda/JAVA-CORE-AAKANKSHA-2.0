// 8.    Write a Java program to input a person's age and citizenship status and check whether the person is eligible to vote.

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        System.out.print("Enter the citizenship : ");
        String citizenship = sc.next();

        if(age >= 18){
            if(citizenship.toUpperCase() == "INDIA"){
                System.out.println("You are eligible to vote in India");
            }else{
                System.out.println("You are not eligible to vote in India");
            }
        }else{
            System.out.println("You are not an eligible voter due to underage");
        }
        sc.close();
    }
}
