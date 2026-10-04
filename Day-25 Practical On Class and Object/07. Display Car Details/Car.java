/*
7. Write a Java program to create a `Car` class with methods to start, stop, and display car information.
*/

import java.util.Scanner;

public class Car {
    String brand;
    String model;
    String carNumber;
    String color;
    double price;
    String fuelType;

    public void setCarDetails(String brand, String model, String carNumber, String color, double price,
            String fuelType) {
        this.brand = brand;
        this.model = model;
        this.carNumber = carNumber;
        this.color = color;
        this.price = price;
        this.fuelType = fuelType;
    }

    public void displayCarInfo() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Model : " + this.model);
        System.out.println("Car Number : " + this.carNumber);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
        System.out.println("Fuel Type : " + this.fuelType);
    }

    public void startCar() {
        System.out.println("Car started successfully.");
    }

    public void stopCar() {
        System.out.println("Car stopped successfully.");
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setCarDetails(
                "Tata",
                "Nexon",
                "OD-11-N-1234",
                "White",
                950000.00,
                "Petrol");
        c1.displayCarInfo();
    }
}
