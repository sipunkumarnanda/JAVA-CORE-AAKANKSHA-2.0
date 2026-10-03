/*
8. Write a Java program to input a sentence and count the total number of words in it.
*/
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Write a String : " );
        String s = sc.nextLine();
        String words[] = s.split(" ");

        System.out.println("There are "+words.length+ " words in "+s);
        sc.close();
    }
}
