/*
4. Write a Java program to input a String and reverse it without using the reverse() method.
*/

import java.util.Scanner;

public class ReverseAnString {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        String rev = "";

        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }

        System.out.println("After Reversed : " +rev);
        sc.close();
    }
}
