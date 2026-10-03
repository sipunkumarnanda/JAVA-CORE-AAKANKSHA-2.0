/*
6. Write a Java program to input a String and check whether it is a palindrome or not.
*/
import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Write a String : " );
        String s = sc.nextLine();
        StringBuffer s1 = new StringBuffer(s);

        String rev = s1.reverse().toString();

        if(s.equals(rev)){
            System.out.println(s + " is Palindrome");
        }else{
            System.out.println(s + " is not Palindrome");
        }
        sc.close();
    }
}
