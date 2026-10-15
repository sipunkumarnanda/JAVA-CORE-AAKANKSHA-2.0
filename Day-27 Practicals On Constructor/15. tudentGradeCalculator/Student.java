
/*
15\. Create a `Student` class with name, roll number, and marks in five subjects. 
Initialize the details using a constructor and create methods to calculate total, percentage, grade, and pass/fail status.
*/

public class Student {
    String name;
    int rollNumber;
    int[] marks;

    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public int calculateTotal() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        return total;
    }

    public double calculatePercentage() {
        return (calculateTotal() / 500.0) * 100;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public boolean checkPassFail() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 30) {
                return false;
            }
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
        System.out.println("Total Marks : " + calculateTotal());
        System.out.printf("Percentage : %.2f%%\n", calculatePercentage());
        System.out.println("Result : " + (checkPassFail() ? "Pass" : "Fail"));
        System.out.println("Grade : " + (checkPassFail() ? calculateGrade() : "F"));
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alex", 101, new int[] {85, 90, 78, 88, 92});

        s1.displayResult();
    }
}
