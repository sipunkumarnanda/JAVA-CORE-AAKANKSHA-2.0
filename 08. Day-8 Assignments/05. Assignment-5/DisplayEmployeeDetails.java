/* Q5. Write a Java program to declare `name`, `id`, and `salary` as instance variables 
inside an `Employee` class. Assign suitable values to the variables using a method and 
display the employee details. */

public class DisplayEmployeeDetails {
    String name;
    String id;
    int salary;

    public void setEmpDetails(String name, String id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void getEmpDetails(){
        System.out.println("Employee Name : " +this.name);
        System.out.println("Employee Id : " +this.id);
        System.out.println("Employee Salary : " +this.salary);
    }
    public static void main(String[] args) {
        DisplayEmployeeDetails emp1 = new DisplayEmployeeDetails();
        emp1.setEmpDetails("Sipun Kumar Nanda", "AK-2022", 50000);
        emp1.getEmpDetails();
    }
}
