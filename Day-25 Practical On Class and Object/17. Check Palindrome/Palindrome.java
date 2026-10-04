import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int num){
        int temp = num;
        int res = 0;
        while(num != 0){
            int lastDigit = num % 10;
            res = res * 10 + lastDigit;
            num = num / 10;
        }
        return temp == res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num + " is " + (isPalindrome(num) ? "a palindrome " : "not a palindrome"));
        sc.close();
    }
}
