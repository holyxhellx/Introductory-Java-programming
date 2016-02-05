/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

import java.util.Scanner;

public class Assignment49 {
    public static void main (String[] args) {
    System.out.print("Enter the word: ");
    String str      = Scanner();    // <-- Scanner Method
    String middle   = middle(str);  // <-- middle Method
    System.out.println("The letter(s) in the middle: " + middle);
    }
    
    public static String middle(String str) {
        
        //Variables:
        String middle   = null;
        int lenght      = (str.length());
        
        if (lenght%2 == 0) {  // Return two letter
            int indexNumFloor  = (int) ( ((str.length()) / 2) - 1);
            int indexNumCeil   = (int) ( (str.length()) / 2);
            char floor   = str.charAt(indexNumFloor);
            char ceil    = str.charAt(indexNumCeil);
            middle       =  Character.toString(floor) + Character.toString(ceil);
            return middle;
        }
        else {                //Return 1 letter
            middle = Character.toString(str.charAt( ((str.length() - 1) / 2) ));
            return middle;
        }
    }
    
    public static String Scanner() {  
        Scanner input = new Scanner(System.in); // Create Scanner:
        String output = input.next();           // Collecting the user input and assign variable
        return output;
    }
}
