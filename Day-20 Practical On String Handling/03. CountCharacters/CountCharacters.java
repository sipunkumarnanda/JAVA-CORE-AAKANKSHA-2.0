/*
3. Write a Java program to input a String and count the number of vowels, consonants, digits, and spaces.
*/

import java.util.Scanner;

public class CountCharacters {
    public static void countVowels(String s){
        String charArr[] = s.split("");
        String vowels = "AEIOU";
        int vowelCount = 0;
        int consonantCount = 0;
        int countSpace = 0;
        int countDigit = 0;
        for(int i=0; i<charArr.length; i++){
            if(vowels.contains(charArr[i])){
                vowelCount++;
            }else if(charArr[i].equals(" ")){
                countSpace++;
            }else if(charArr[i].matches("[0-9]")){
                countDigit++;
            }
            else if(charArr[i].matches("[A-z]")){
                consonantCount++;
            }
        }
        System.out.println("Total vowls in " +s+ " is : " +vowelCount);
        System.out.println("Total consonant in " +s+ " is : " +consonantCount);
        System.out.println("Total space in " +s+ " is : " +countSpace);
        System.out.println("Total digit in " +s+ " is : " +countDigit);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        s = s.toUpperCase();

        countVowels(s);

        sc.close();
    }
}
