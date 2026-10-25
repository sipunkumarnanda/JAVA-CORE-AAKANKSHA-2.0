
/*
4\. Create a `Car` class with speed limit (0-200).
*/

public class Car {
    private String brand;
    private int speed;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed, speed must be between 0 to 200");
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBrand("Tata");

        c1.setSpeed(120);
        System.out.println("Brand : " + c1.getBrand());
        System.out.println("Speed : " + c1.getSpeed() + " km/h");

        System.out.println();

        c1.setSpeed(250);
        System.out.println("Speed : " + c1.getSpeed() + " km/h");
    }
}
