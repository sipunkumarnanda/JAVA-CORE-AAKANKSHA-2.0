
/*
9\. Create an `Employee` class with employee ID, name, and salary. Initialize the object using 
a constructor and calculate the yearly salary using a method.
*/


public class Employee {
    int employeeId;
    String name;
    double salary;

    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
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
    }
}
