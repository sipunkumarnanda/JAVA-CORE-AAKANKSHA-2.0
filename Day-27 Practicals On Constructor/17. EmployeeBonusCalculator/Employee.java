
/*
17\. Create an `Employee` class with employee name, salary, and performance rating. 
Initialize the details using a constructor and calculate the bonus based on the performance rating.
*/


public class Employee {
    String employeeName;
    double salary;
    int performanceRating;

    Employee(String employeeName, double salary, int performanceRating) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    public double calculateBonus() {
        double bonusPercentage = 0;

        if (performanceRating == 5) {
            bonusPercentage = 20;
        } else if (performanceRating == 4) {
            bonusPercentage = 15;
        } else if (performanceRating == 3) {
            bonusPercentage = 10;
        } else if (performanceRating == 2) {
            bonusPercentage = 5;
        } else {
            bonusPercentage = 0;
        }

        return (bonusPercentage / 100) * this.salary ;
    }

    public void displayDetails() {
        System.out.println("Employee Name : " + this.employeeName);
        System.out.printf("Salary : Rs. %.2f\n", this.salary);
        System.out.println("Performance Rating : " + this.performanceRating);
        System.out.printf("Bonus : Rs. %.2f\n", calculateBonus());
        System.out.printf("Total Salary : Rs. %.2f\n",
                this.salary + calculateBonus());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Alex", 30000, 5);
        e1.displayDetails();
    }
}
