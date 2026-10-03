/*
7. Write a Java program to input a String and a character and count the number of times the character occurs in the String.
*/
import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Write a String : " );
        String s = sc.nextLine();
        System.out.print("Enter the character you want to check it occurances : ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }

        System.out.println(ch + " appeared " +count + " times in " +s);
        sc.close();
    }
}
