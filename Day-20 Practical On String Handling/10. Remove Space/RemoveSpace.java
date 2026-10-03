/*
10. Write a Java program to input a String and remove all spaces from it.
*/
import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Write a String : " );
        String s = sc.nextLine();

        String s1[] = s.split(" ");
        System.out.println(String.join("", s1));
        sc.close();
    }
}
