/*
2\. Write a Java program to create an `Employee` class to store and display employee ID, name, and salary.
*/
public class Employee {
    String name;
    int employeeID;
    double salary;

    public void setEmployeeDetails(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Employee ID : " + this.employeeID);
        System.out.println("Salary : " + this.salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmployeeDetails("Sipun Kumar Nanda", 123, 100000.00);
        e1.displayEmployeeDetails();
    }
}
