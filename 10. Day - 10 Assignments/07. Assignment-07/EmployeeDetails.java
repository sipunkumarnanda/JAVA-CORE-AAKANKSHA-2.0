
public class EmployeeDetails {
     String name;
    int empId;
    double salary;
    String department;

    public void SetEmployeeDetails(String name, int empId, double salary, String department) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        this.department = department;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Employee Id : " + this.empId);
        System.out.println("Salary : " + this.salary);
        System.out.println("Department : " + this.department);
    }

    public static void main(String[] args) {
        EmployeeDetails e1 = new EmployeeDetails();
        e1.SetEmployeeDetails("Sipun Kumar Nanda", 123456789, 150000.15, "DevOps");
        e1.displayEmployeeDetails();
    }
}