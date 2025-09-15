package LW01;

import java.util.Scanner;

public class Circle {
     float radius;
     float area;
     float circumference;

     Circle(){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Radius: ");
         radius = input.nextFloat();
         computeArea();
         computeCircumference();
     }

     public void computeArea(){
         area = ((float) 7 / 22) * radius * radius;
     }

     public void computeCircumference(){
         circumference = 2 * ((float) 7 / 22) * radius;
     }
}
