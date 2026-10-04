/*
13. Write a Java program to create a `Temperature` class with methods to convert Celsius to Fahrenheit and Fahrenheit to Celsius.
*/

import java.util.Scanner;

public class Temperature {
    public static float convertCelsiusToFarenheit(float temperature){
        return  (temperature * 9 / 5) + 32;
        // float fahrenheit = (temperature * 9 / 5) + 32;
        // System.out.println(temperature +" degree celsius = " + fahrenheit + " degree farenheit");
    }

     public static float convertFarenheitToCelsius(float temperature){
        return (temperature - 32) * 5 / 9;
        // float celsius = (temperature - 32) * 5 / 9;
        // System.out.println(temperature +" degree farenheit = " + celsius + " degree celsius");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter tempreture in celsius : ");
        float temperatureInCelsius = sc.nextFloat();

        float temperatureInFarenheit = convertCelsiusToFarenheit(temperatureInCelsius);
        System.out.println(temperatureInCelsius +" degree celsius = " + temperatureInFarenheit + " degree farenheit");

        temperatureInCelsius = convertFarenheitToCelsius(temperatureInFarenheit);
        System.out.println(temperatureInFarenheit +" degree Farenheit = " + temperatureInCelsius + " degree celsius");
        sc.close();
    }
}
