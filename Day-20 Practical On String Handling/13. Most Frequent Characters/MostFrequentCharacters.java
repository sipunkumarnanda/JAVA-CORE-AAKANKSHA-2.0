/*
13. Write a Java program to input a String and find the character that occurs most frequently.
*/

import java.util.Scanner;

public class MostFrequentCharacters {

     public static int[] charFreqCount(String s) {
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean hasSeen = false;
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (ch == s.charAt(j)) {
                    hasSeen = true;
                    break;
                }
            }
            if (!hasSeen) {
                for (int k = 0; k < s.length(); k++) {
                    if (ch == s.charAt(k)) {
                        count++;
                    }
                }
                charCount[ch - 'a'] = count;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = sc.nextLine().toLowerCase();
        int[] freqOfCharInS = charFreqCount(s1);

        int freq = Integer.MIN_VALUE;
        int asci = 0;

        for(int i=0; i< freqOfCharInS.length; i++){
            if(freqOfCharInS[i] > freq){
                freq = freqOfCharInS[i];
                asci = i;
            }
        }

        System.out.println("Most frequent character in " +s1+ " is : " + ((char)(asci+97)) + " -> " + freq);
        sc.close();
    }
}
