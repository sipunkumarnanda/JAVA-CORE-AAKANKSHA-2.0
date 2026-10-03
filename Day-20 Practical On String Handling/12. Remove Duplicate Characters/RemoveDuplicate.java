// 12. Write a Java program to input a String and remove all duplicate characters from it.

import java.util.Scanner;

public class RemoveDuplicate {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        String sArray[] = s.split("");
        String ans = "";

        for (int i = 0; i < sArray.length; i++) {
            boolean hasSeen = false;
            for (int j = 0; j < i; j++) {
                if (sArray[i].equals(sArray[j])) {
                    hasSeen = true;
                    break;
                }
            }

            if (!hasSeen) {
                ans += sArray[i];
            }
        }
        System.out.println("After removing all duplicate character , the string is : " +ans);
        sc.close();
    }
}
