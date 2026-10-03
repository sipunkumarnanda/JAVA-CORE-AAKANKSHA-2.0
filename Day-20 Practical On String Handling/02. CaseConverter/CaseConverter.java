/*
2. Write a Java program to input a String and display it in uppercase and lowercase.
*/
import java.util.Scanner;

public class CaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a String : " );
        String s = sc.nextLine();

        System.out.println("Uppercase : " + s.toUpperCase());
        System.out.println("Lowercase : " + s.toLowerCase());

        sc.close();
    }
}
