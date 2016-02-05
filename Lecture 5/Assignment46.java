/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

import java.util.Scanner;

public class Assignment46 {
   public static void main (String[] args) {
       //Vaiables:
       int n = 0;
       
       System.out.print("Enter n to display the corresponding matrix:");
       //Collect the user input: 
       n = Scanner(); // <-- Method Scanner
       //Setting up matrix:
       new Assignment46().printMatrix(n);
   } 
   
   public static void printMatrix(int n) {
       for (int y = 0; y < n; y++) { // <-- Loop vertical, number of y(n) in grid
          for (int x = 0; x < n; x++) { // <-- Loop horizontal, number of x(n) in grid
              System.out.print((int)(Math.random() * 2) + " ");
          }
          System.out.println();
       }
    }
       public static int Scanner() {  
        Scanner input = new Scanner(System.in); // Create Scanner:
        int output = input.nextInt();           // Collecting the user input and assign the variable
        return output;
    }
}
