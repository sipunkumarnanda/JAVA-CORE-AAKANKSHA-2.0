
/*
3\. Create an `Employee` class with salary and prevent salary < 10000.
*/

public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Salary can not be less than 10000");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Alex");

        e1.setSalary(8000);
        System.out.println("Salary : " + e1.getSalary());

        System.out.println();

        e1.setSalary(25000);
        System.out.println("Name : " + e1.getName());
        System.out.println("Salary : " + e1.getSalary());
    }
}
