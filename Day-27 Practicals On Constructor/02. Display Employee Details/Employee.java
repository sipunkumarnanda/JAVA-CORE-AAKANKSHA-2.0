/*
2. Create an `Employee` class with employee ID, name, and basic salary.
Create a method to calculate and display the annual salary.
*/
public class Employee {
    int employeeID;
    String name;
    double basicSalary;

    Employee(String name, int employeeID, double basicSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.basicSalary = basicSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Employee ID : " + this.employeeID);
        System.out.println("Salary : " + this.basicSalary);
    }

    private double calculateMonthlySalary() {
        double hra = (10.00 / 100.00) * this.basicSalary;
        double da = (20.00 / 100.00) * this.basicSalary;
        return this.basicSalary + hra + da;
    }

    public void displayAnnualSalary() {
        System.out.println("Annual Salary of " + this.name + " is : " + calculateMonthlySalary() * 12 + "\n");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Sipun Kumar Nanda", 123, 100000.00);
        e1.displayEmployeeDetails();
        e1.displayAnnualSalary();

        Employee e2 = new Employee("Suv Kumar", 198, 75000);
        e2.displayEmployeeDetails();
        e2.displayAnnualSalary();

    }
}
