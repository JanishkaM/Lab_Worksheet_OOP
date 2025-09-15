package LW01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Full Name like, first middle last: ");
        String fullName = input.nextLine();


        int length = fullName.length();

        int firstSpace = fullName.indexOf(" ");

        String firstName = fullName.substring(0, firstSpace);
        String temp = fullName.substring(++firstSpace, length);
//        System.out.println(firstName);

        int secondSpace = temp.indexOf(" ");

        String middleName = temp.substring(0, secondSpace);
        temp = fullName.substring(++secondSpace, length);
//        System.out.println(middleName);

        int thirdSpace = temp.indexOf(" ");

        String lastName = temp.substring(++thirdSpace);
//        System.out.println(lastName);

        //System.out.println(fullName);

        System.out.println(lastName + "," + firstName + " " + middleName.charAt(0) + ".");

    }
}
