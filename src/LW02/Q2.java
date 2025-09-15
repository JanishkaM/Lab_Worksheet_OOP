package LW02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("Enter Your Number: ");
            int number = input.nextInt();
            if (number < 0){
                System.out.println("Exiting the Program...");
                return;
            }
            String sNumber = Integer.toString(number);
            System.out.println("Number of Integers in " + number + " is " + sNumber.length());
        }
    }
}
