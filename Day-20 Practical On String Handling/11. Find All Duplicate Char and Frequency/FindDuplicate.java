/*
11. Write a Java program to input a String and find and display all duplicate characters with their frequency.
*/
import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        String sArray[] = s.split("");

        for (int i = 0; i < sArray.length; i++) {
            boolean hasSeen = false;
            for (int j = 0; j < i; j++) {
                if (sArray[i].equals(sArray[j])) {
                    hasSeen = true;
                    break;
                }
            }
            int count = 0;
            if (!hasSeen) {
                for (int k = i; k < sArray.length; k++) {
                    if (sArray[i].equals(sArray[k])) {
                        count++;
                    }
                }
                if(count > 1){
                    System.out.println(sArray[i] + " appeared " + count + " times"); // only printing duplicate characters 
                }
            }
        }
        sc.close();
    }
}
