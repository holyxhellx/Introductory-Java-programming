/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg3;

import java.util.Scanner;

public class Assignment310 {
    public static void main(String[] args) {
     
    // Variables:    
        int total = 1;          //the number of numbers from scanner
        int positive = 0;       //the number of positive
        int negative = 0;       //the number of negative 
        double sum = 0.0;       //the sum of all numbers
        double average = 0.0;   //the average of all numbers
   
     
    //Scanner and input:   
        Scanner input = new Scanner(System.in); // Create Scanner:
        System.out.println("Enter an integer, the input will end if it is 0:");// Help to do the inputs:
        int number = input.nextInt(); // Collecting the user input and assign the variable
        
        // While the number is not 0, contiues loop:
        while (number != 0) {
            if (number > 0) { //colleting positive numbers.
                positive++;
            }
            else if (number < 0) { //colleting negative numbers.
                negative++;
            }
            total++;        //Count of total numbers  
            sum += number;  //Same as: sum = sum + number
            
            number = input.nextInt(); //Collecting the next number
        }
        //Calculating the averge:
        average = sum / (total - 1);
            
        System.out.println("The number of positives is: "+ positive);
        System.out.println("The number of negatives is: "+ negative);
        System.out.println("The total is: "+ total);
        System.out.println("The average is: "+ average);
    }
}
