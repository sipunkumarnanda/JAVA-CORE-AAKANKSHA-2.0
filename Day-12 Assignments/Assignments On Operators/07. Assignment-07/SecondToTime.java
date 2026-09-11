/*
7. Write a Java program to accept a total number of seconds and convert it into hours, minutes, and remaining seconds using division and modulus operators.
*/

import java.util.Scanner;

public class SecondToTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total number of seconds : ");
        int seconds = sc.nextInt();

        int hour = seconds / 3600;
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(+hour + " Hr " + minutes + " minutes " + seconds + " seconds");

        sc.close();
    }
}
