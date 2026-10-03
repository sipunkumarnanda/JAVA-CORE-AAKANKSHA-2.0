
/*
15. Write a Java program to input a sentence and reverse each word individually without changing the order of the words.
*/

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string you want to reverse its each word : ");
        String s = sc.nextLine();
        String ans = "";
        String[] sArray = s.split(" ");

       for(int i=0; i<sArray.length; i++){
            StringBuffer word = new StringBuffer(sArray[i]); // convert to mutable
            int start = 0, end = word.length()-1;
            while(start < end){
                char temp = word.charAt(start);
                word.setCharAt(start, word.charAt(end));
                word.setCharAt(end, temp);
                start++;
                end--;
            }
            ans += word + " ";
        }

        System.out.println(ans);

        sc.close();
    }
}