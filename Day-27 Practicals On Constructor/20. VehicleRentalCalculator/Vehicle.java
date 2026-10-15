
/*
20\. Create a `Vehicle` class with vehicle number, model, and rental price per day. 
Initialize the details using a constructor and create methods to calculate the total rental 
amount based on the number of days and apply a discount for rentals exceeding 5 days.
*/

public class Vehicle {
    String vehicleNumber;
    String model;
    double rentalPricePerDay;

    Vehicle(String vehicleNumber, String model, double rentalPricePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public double calculateRentalAmount(int days) {
        return this.rentalPricePerDay * days;
    }

    public double applyDiscount(int days) {
        double totalAmount = calculateRentalAmount(days);

        if (days > 5) {
            double discount = (totalAmount * 10) / 100;
            return totalAmount - discount;
        } else {
            return totalAmount;
        }
    }

    public void displayBill(int days) {
        if (days <= 0) {
            System.out.println("Invalid rental days");
            return;
        }

        double totalAmount = calculateRentalAmount(days);
        double finalAmount = applyDiscount(days);

        System.out.println("Vehicle Number : " + this.vehicleNumber);
        System.out.println("Model : " + this.model);
        System.out.printf("Rental Price Per Day : Rs. %.2f\n", this.rentalPricePerDay);
        System.out.println("Rental Days : " + days);
        System.out.printf("Total Rental Amount : Rs. %.2f\n", totalAmount);
        System.out.println("Discount : " + (days > 5 ? "10%" : "0%"));
        System.out.printf("Final Rental Amount : Rs. %.2f\n", finalAmount);
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("OD11AB1234", "Tata Nexon", 2000);
        v1.displayBill(7);
    }
}
