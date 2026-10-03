/*
5. Write a Java program to input two Strings and check whether they are equal or not.
*/
import java.util.Scanner;

public class CheckEqual {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Write String 1 : " );
        String s1 = sc.nextLine();

        System.out.print("Write String 1 : " );
        String s2 = sc.nextLine();

        if(s1.equals(s2)){
            System.out.println("Two string are equal");
        }else{
            System.out.println("Two string are not equal");
        }
        sc.close();
    }
}
