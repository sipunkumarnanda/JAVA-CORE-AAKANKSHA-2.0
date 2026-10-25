
/*
7\. Create a `Mobile` class where battery % must be between 0-100.
*/

public class Mobile {
    private String brand;
    private int battery;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBattery() {
        return this.battery;
    }

    public void setBattery(int battery) {
        if (battery >= 0 && battery <= 100) {
            this.battery = battery;
        } else {
            System.out.println("Invalid battery percentage");
        }
    }

    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.setBrand("Samsung");

        m1.setBattery(85);
        System.out.println("Brand : " + m1.getBrand());
        System.out.println("Battery : " + m1.getBattery() + "%");

        System.out.println();

        m1.setBattery(120);
        System.out.println("Battery : " + m1.getBattery() + "%");
    }
}
