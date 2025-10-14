package LW03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double temperature;
        System.out.print("Enter the Temperature in Celsius: ");
        temperature = input.nextDouble();

        Temperature TemperatureObj = new Temperature();
        TemperatureObj.getCelsius(temperature);
        TemperatureObj.setFahrenheit();
        System.out.println("Temperature in Fahrenheit is: " + TemperatureObj.toFahrenheit());
    }
}
