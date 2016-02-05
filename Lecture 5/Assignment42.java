/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

import java.util.Scanner;

public class Assignment42 {
    public static void main (String[] args) {
        
        //Scanner and input:   
        Scanner input = new Scanner(System.in); // Create Scanner:
        System.out.println("Enter the number of years:");// Help to do the inputs:
        double year = input.nextInt(); // Collecting the user input and assign the variable
        System.out.println("Enter the interst rate in %:");// Help to do the inputs:
        double rate = input.nextInt(); // Collecting the user input and assign the variable
        
        double result = balance(year, rate);
        double finalresult = Math.round(result); //Round the result (but keeping the exact for contiue use)
        
        System.out.println("The total amount in "+ year + " year(s) at " + rate + " % intest is " + finalresult);
    }  

    public static double balance(double year, double rate){ 
        // if(year > 0 && rate > 0) {
            double ratefinal = (rate / 100) + 1;
            return 10000 * Math.pow(ratefinal, year);
        //}
          
    } 
}
