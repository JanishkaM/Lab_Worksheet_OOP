package LW02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Rows of the Pyramid: ");
        int row = input.nextInt();
        String star = "";

        for (int i = 0; i < row; i++){
            star = star + "*";
            System.out.println(star);
        }
    }
}