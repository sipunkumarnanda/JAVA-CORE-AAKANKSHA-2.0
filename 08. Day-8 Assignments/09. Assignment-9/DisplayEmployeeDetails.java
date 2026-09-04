
public class DisplayEmployeeDetails {
    String employeeName;
    double basicSalary;
    static String companyName;

    public double calculateTotalSalary(double basicSalary){
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        return basicSalary + hra + da;
    }

    public void setEmployeeDetails(String employeeName, String companyName){
        this.employeeName = employeeName;
        DisplayEmployeeDetails.companyName = companyName;
    }

    public void displayEmployeeDetails(double salary){
        System.out.println("Employee Name : " +this.employeeName);
        System.out.println("Company Name : " +DisplayEmployeeDetails.companyName);
        System.out.println("Salary : " +salary);
    }

    public static void main(String[] args) {
        DisplayEmployeeDetails e1 = new DisplayEmployeeDetails();
        e1.setEmployeeDetails("Sipun Kumar Nanda", "JP Morgan Chase");
        double ctc = e1.calculateTotalSalary(300000.00);
        e1.displayEmployeeDetails(ctc);
    }
}
