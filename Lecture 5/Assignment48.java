/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

import java.util.Scanner;

public class Assignment48 {
    public static void main (String[] args) {
    
    System.out.print("Enter the side: ");
    double side     = Scanner();        // <-- Scanner method
    double area     = area(side);       // <-- area method
    double radius   = radius(side);     // <-- radius method
    
    System.out.println("The area of the pentagon is: " + area);
    System.out.println("The radius of the pentagon is: " + radius);
    }
    
    public static double Scanner() {  
        Scanner input = new Scanner(System.in); // Create Scanner:
        double output = input.nextDouble();     // Collecting the user input and assign variable
        return output;
    }
    public static double area(double side) {
        double area = ((5 * (side*side) ) / ((Math.tan( (Math.PI) / (5) )) * 4));
        return area;
    }
    private static double radius(double side) {
        double radius = Math.sqrt( ((5 * (side*side) ) / ((Math.tan( (Math.PI) / (5) )) * 4)) / ((Math.tan( (Math.PI) / (5) )) * 5));
        return radius;
    }
}
