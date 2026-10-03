/*
9. Write a Java program to input a String and display its first and last character.
*/
import java.util.Scanner;

public class DisplayFirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a String : " );
        String s = sc.nextLine();

        System.out.println("First character of "+s+ " is " +s.charAt(0));
        System.out.println("Last character of "+s+ " is " +s.charAt(s.length()-1));
        sc.close();
    }
}
