/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg3;

import java.util.Scanner;


public class Assignment36 {
     public static void main(String[] args) {
       
        // Create Scanner:
        Scanner scanner36 = new Scanner(System.in);
        
        // Help to do the inputs:
        System.out.println("Enter your cpr number as DDMMYY-XXXX");
        // Collecting the user input and assign te variable
       String cpr = scanner36.next();
        
       int count = 0;
        //Validation of numbers from the CPR:
            //Lenght != 11
            //Character check at index(6) "-"
            //Day   (DD() >= 31)
            //Month (MM() >= 12)
            //Year  (YY() == 0)                
        
        if (cpr.length() != 11){
            System.out.print("Not a CPR number");
            count++;
        }
        if (cpr.charAt(6) != '-'){ 
            System.out.print("Not a CPR number");
            count++;
        } 
        /*
        if (cpr.charAt(0) > 3 ) {
            System.out.print("Not a CPR number");
            count++;
        }
        if (cpr.charAt(2) > 2) {
            System.out.print("Not a CPR number");
            count++;
        }
        */ 
        if (count == 0) {
            System.out.print("The CPR number is valid");
        }
        // <--- 
    }
}
