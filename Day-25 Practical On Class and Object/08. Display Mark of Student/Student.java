/*
8. Write a Java program to create a `Student` class with a method that accepts marks of three subjects and calculates the total and average.
*/

public class Student {

    public static void calculateTotalAndAverage(int sub1Mark, int sub2mark, int sub3Mark){
        int totalMark = sub1Mark + sub2mark + sub3Mark;
        double averageMark = totalMark / 3;
        System.out.println("Total Marks : " + totalMark);
        System.out.println("Average Marks : " + averageMark);
    }
    public static void main(String[] args) {
        calculateTotalAndAverage(80,91, 99);
    }
}
