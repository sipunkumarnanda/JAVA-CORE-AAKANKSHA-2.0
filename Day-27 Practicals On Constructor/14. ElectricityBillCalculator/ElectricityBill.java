
/*
14\. Create an `ElectricityBill` class with customer name and units consumed. Initialize the details using 
a constructor and calculate the electricity bill using a method based on the given per-unit rate.
*/


public class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double perUnitRate;

    ElectricityBill(String customerName, double unitsConsumed, double perUnitRate) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.perUnitRate = perUnitRate;
    }

    public double calculateBill() {
        return this.unitsConsumed * this.perUnitRate;
    }

    public void displayDetails() {
        System.out.println("Customer Name : " + this.customerName);
        System.out.println("Units Consumed : " + this.unitsConsumed);
        System.out.println("Per Unit Rate : Rs. " + this.perUnitRate);
        System.out.printf("Total Bill : Rs. %.2f\n", calculateBill());
    }

    public static void main(String[] args) {
        ElectricityBill e1 = new ElectricityBill("Alex", 150, 6.50);
        e1.displayDetails();
    }
}
