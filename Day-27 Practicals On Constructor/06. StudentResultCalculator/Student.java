/*
6\. Create a `Student` class with name and marks in three subjects. Write methods to calculate total marks, percentage, and display the result.
*/

public class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    boolean isPass = true;
    boolean isValidMark = true;

    public int calculateTotalMarks() {
        int totalMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            if (this.marks[i] >= 0 && this.marks[i] <= 100) {
                totalMarks += this.marks[i];
                if (this.marks[i] < 30) {
                    isPass = false;
                }
            }else{
                isValidMark = false;
                break;
            }
        }
        return totalMarks;
    }
    
    public float calculatePercentage(int totalMarks) {
        return (totalMarks / 300.0f) * 100.0f;
    }

    public void result(int totalMarks, float percentage) {
        System.out.println("Name : " + this.name);
        if(!isValidMark) {
            System.out.println("Invalid Mark, mark should be between 0 to 100");
            return ;
        }
        System.out.println("Total Marks : " + totalMarks);
        System.out.println("Percentage : " + percentage);
        System.out.println("Result : " + (isPass ? "Pass" : "Fail"));
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alex", new int[] { 90, 40, 50 });
        int totalMarks = s1.calculateTotalMarks();
        float percentage = s1.calculatePercentage(totalMarks);
        s1.result(totalMarks, percentage);
    }
}
