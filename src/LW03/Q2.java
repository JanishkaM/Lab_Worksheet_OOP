package LW03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature;

        System.out.print("Enter the Temperature in Fahrenheit: ");
        temperature = input.nextDouble();

        Temperature TemperatureObj = new Temperature();

        TemperatureObj.getFahrenheit(temperature);
        TemperatureObj.setCelsius();
        System.out.println("Temperature in Celsius is: " + TemperatureObj.toCelsius());
    }
}
