
/*
13\. Create an `Employee` class with constructor + encapsulated salary logic.
*/

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        setSalary(salary);
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Salary can not be less than 10000, salary set to 10000");
            this.salary = 10000;
        }
    }

    public void giveIncrement(double percentage) {
        if (percentage > 0 && percentage <= 50) {
            this.salary += (this.salary * percentage) / 100;
            System.out.println("Increment of " + percentage + "% given");
        } else {
            System.out.println("Invalid increment percentage");
        }
    }

    public double calculateYearlySalary() {
        return this.salary * 12;
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + this.employeeId);
        System.out.println("Name : " + this.name);
        System.out.println("Monthly Salary : " + this.salary);
        System.out.println("Yearly Salary : " + calculateYearlySalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Alex", 25000);
        e1.displayDetails();

        System.out.println();

        e1.giveIncrement(10);
        e1.displayDetails();

        System.out.println();

        Employee e2 = new Employee(102, "John", 5000);
        e2.displayDetails();
    }
}
