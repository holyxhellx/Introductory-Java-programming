/* 
This program is the reply for Assignment 2.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/

package assignment.pkg2;

import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        // Assignment 2.1:
        System.out.println("-----  Assignment 2.1 ------");
        System.out.println("");

        // Help to type the input:
        System.out.println("Write an Integer: ");
        // User input type in
        Scanner scanner21 = new Scanner(System.in);
        // Collecting the user input and assign the variable
        int inputInt = scanner21.nextInt();
        
        // Using if-statment because it is a small statement with few cases.
        // >= greater then and equal to
        // <= less then and equal to
        // else it is zero
        
            if (inputInt >= 1) {
                    System.out.println("The integer is positive");
            }            
            else if (inputInt <= -1) {
                    System.out.println("The integer is negative");
            }
            else {
                    System.out.println("The integer is zero");
            }
            
    }
}
