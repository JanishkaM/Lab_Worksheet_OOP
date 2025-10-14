package LW04;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("***********************************");
            System.out.println("Categories");
            System.out.println("1 -- Entree");
            System.out.println("2 -- Side Dish");
            System.out.println("3 -- Drink");
            System.out.println("Select the Category Number");
            int selection = input.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("***********************************");
                    System.out.println("Entree");
                    System.out.println("$3.49 -- Tofu Burger");
                    System.out.println("$4.59 -- Cajun Chicken");
                    System.out.println("$3.99 -- Buffalo Wings");
                    System.out.println("$2.99 -- Rainbow Fillet");
                    break;
                case 2:
                    System.out.println("***********************************");
                    System.out.println("Side Dish");
                    System.out.println("$0.79 -- Rice Cracker");
                    System.out.println("$0.69 -- No-Salt Fries");
                    System.out.println("$1.09 -- Zucchini");
                    System.out.println("$0.59 -- Brown Rice");
                    break;
                case 3:
                    System.out.println("***********************************");
                    System.out.println("Drink");
                    System.out.println("$1.99 -- Cafe Mocha");
                    System.out.println("$1.90 -- Cafe Latte");
                    System.out.println("$2.49 -- Espresso");
                    System.out.println("$0.99 -- Oblong Tea");
                    break;
                default:
                    System.out.println("***********************************");
                    System.out.println("Enter Valid Number");
                    break;
            }
    }
}
