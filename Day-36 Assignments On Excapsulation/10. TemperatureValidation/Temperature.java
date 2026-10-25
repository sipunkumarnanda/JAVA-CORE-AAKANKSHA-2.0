
/*
10\. Create a `Temperature` class that prevents values below absolute zero.
*/

public class Temperature {
    private double celsius;

    public double getCelsius() {
        return this.celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperature can not be below absolute zero (-273.15 C)");
        }
    }

    public static void main(String[] args) {
        Temperature t1 = new Temperature();

        t1.setCelsius(-300);
        t1.setCelsius(37);

        System.out.println("Celsius : " + t1.getCelsius());
    }
}
