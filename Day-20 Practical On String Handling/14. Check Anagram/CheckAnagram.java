
/*
14. Write a Java program to input two Strings and check whether they are anagrams of each other.
*/
import java.util.Scanner;

public class CheckAnagram {

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

        System.out.print("Enter string s1 : ");
        String s1 = sc.nextLine().toLowerCase();
        s1 = s1.replace(" ", "");

        System.out.print("Enter string s1 : ");
        String s2 = sc.nextLine().toLowerCase();
        s2 = s2.replace(" ", "");

        if (s1.length() != s2.length()) {
            System.out.println(s1 + " and " + s2 + " not anagram");
        } else {
            int[] freqCountS1 = charFreqCount(s1);
            int[] freqCountS2 = charFreqCount(s2);

            boolean isAnagram = true;
            for(int i=0; i<freqCountS1.length; i++){
                if(freqCountS1[i] != freqCountS2[i]){
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram){
                System.out.println(s1 + " and " + s2 + " is anagram");
            }else{
                System.out.println(s1 + " and " + s2 + " not anagram");
            }
        }
        sc.close();
    }
}
