package LW01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Word: ");
        String word = input.next();

        int middle = word.length() / 2;

        System.out.println("Middle Letter is: " + (word.charAt(middle)));

    }
}
