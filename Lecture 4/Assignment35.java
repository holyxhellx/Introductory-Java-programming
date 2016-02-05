/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg3;

import java.util.Scanner;

public class Assignment35 {
    public static void main(String[] args) {
        
        // Create Scanner:
        Scanner scanner35 = new Scanner(System.in);
        
        // Help to do the inputs:
        System.out.println("Enter 1.String:");
        // Collecting the user input and assign the variable
        String string1 = scanner35.next();
        
        // Help to do the inputs:
        System.out.println("Enter 2.String:");
        // Collecting the user input and assign the variable
        String string2 = scanner35.next();
        
        if(string1.contains(string2)){
            System.out.println("The second string is a subset of the first");
        }
        else if (string2.contains(string1)){
            System.out.println("The first string is a subset of the second");
        }
        else {
            System.out.println("None of the strings are the subet of one another ");
        }
    }
}
