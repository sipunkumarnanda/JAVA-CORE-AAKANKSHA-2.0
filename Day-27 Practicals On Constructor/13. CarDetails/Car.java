
/*
13\. Create a `Car` class with brand, model, and fuel type. Initialize the details using 
a constructor and create a method to display the car information.
*/

public class Car {
    String brand;
    String model;
    String fuelType;

    Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Fuel Type : " + this.fuelType);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Tata", "Nexon", "Diesel");
        c1.displayDetails();

        System.out.println();

        Car c2 = new Car("Hyundai", "Creta", "Petrol");
        c2.displayDetails();
    }
}
