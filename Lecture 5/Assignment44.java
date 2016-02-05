/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

import java.util.Scanner;

public class Assignment44 {
    
    public static void main (String[] args) { 
        
        double salary = readDouble("Please enter your salary");
        //double percentageRaise = readDouble("What percentage raise would you like?");
        System.out.println("salary "+salary);  
    }
    public static double readDouble(String prompt) {
        
        //Scanner and input:   
        Scanner input = new Scanner(System.in); // Create Scanner:
        
        float output = input.nextFloat(); // Collecting the user input and assign the variable
        
        //float raise = input.nextFloat(); // Collecting the user input and assign the variable
  
        return output;
    }
}
