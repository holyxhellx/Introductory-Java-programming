/* 
This program is the reply for Assignment 2.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/

package assignment.pkg2;

import java.util.Scanner;

public class Assignment23 {
    public static void main (String[] args) {
    // Assignment 2.3:
        System.out.println("-----  Assignment 2.3 ------");
        System.out.println("");                
                
        // Help to type the input:
        System.out.println("Write three numbers: (separat with enter) ");

        // User input type in
        Scanner scanner23 = new Scanner(System.in);
        // Collecting the user input and assign the variable
        int inputOne    = scanner23.nextInt();
        int inputTwo    = scanner23.nextInt();
        int inputThree  = scanner23.nextInt();
        
        // Using if-statment because it is a small statement with few cases.
        // == equal to (var.)
        // != not qeual to (var.)
        // && logical Operator (And)
        if (inputOne == inputTwo && inputTwo == inputThree) {
            System.out.println("The numbers are all the same"); 
        }
        else if (inputOne != inputTwo && inputTwo != inputThree) {
            System.out.println("The numbers are all different");
        }
        else {
            System.out.println("The numbers are neither");
        }

    }
}
