package LW01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter centimeter: ");
        float centimeters = input.nextFloat();

        float inches = (float) (centimeters / 2.54);

        int feet = (int) (inches / 12);
        inches = (float) inches % 12;

        System.out.println(feet + " Feet and " + inches);
    }
}
