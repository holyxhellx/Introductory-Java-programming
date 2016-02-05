/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

import java.util.Scanner;

public class Assignment45 {
    public static void main (String[] args) {
        
        //Variables
        int reversal        = 0;
        int number          = 0;
        int revers          = 0;
        boolean palindrome  = false;
        
        System.out.print("Type an integer to get the reversal:");
        //Collect scanner input:
        number = Scanner();
        //Collect the reversal number:
        revers = reversal(number, reversal);
        //collect the palindrome statment:
        palindrome = isPalindrome(number, revers);
        
        System.out.println("The reversal integer " + revers);
        System.out.println("The reversal integer is a palindrome: " + palindrome);
       
        //Return true if number is a palindrome
    }

    private static int reversal(int number, int reversal) {
        while (number != 0)
        {
            //Extend the reversal-number by a factor 10.
            reversal  *= 10; //Same as: number = number / 10; 
            
            //Replacing the 0 in reversal with the extracted digt. from number.
            reversal += number % 10; //Same as: reversal = reversal + (number % 10);
            
            //The "counter" function and determinds when to exit the loop (when out of digt.)
            number /= 10;  //Same as: number = number / 10; 
        }
        return reversal;
       
    }
    public static boolean isPalindrome(int number, int revers) {
        if (number == revers) {
           return true;
        } else {
           return false; 
        }
    }
    
    public static int Scanner() {  
        Scanner input = new Scanner(System.in); // Create Scanner:
        int output = input.nextInt();           // Collecting the user input and assign the variable
        return output;
    }
}
