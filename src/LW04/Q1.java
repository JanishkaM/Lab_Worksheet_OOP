package LW04;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int c = scanner.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.println("The Smallest number is " + a);
            } else {
                System.out.println("The Smallest number is " + c);
            }
        } else {
            if (b < c) {
                System.out.println("The Smallest number is " + b);
            } else {
                System.out.println("The Smallest number is " + c);
            }
        }
    }
}
