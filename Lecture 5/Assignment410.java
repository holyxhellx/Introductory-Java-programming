/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

import java.util.Scanner;

public class Assignment410 {
    public static void main (String[] args) {
    System.out.print("Enter the number: ");
    String number    = Scanner();  // <-- Scanner Method
    int length       = number.length();
        
        for (int i = 0 ; i < number.length() ; i++) {
            char current = number.charAt(i);      //Collect the letter/number at index equal to i
            if (current >= '0' && current <= '9' ) {    //Control the current select index for letter or number
               System.out.print(current);
            } else {
               char uppercaseLetter = Character.toUpperCase(current);
               int num = getNumber(uppercaseLetter);
               System.out.print(num);
            }
        } //Character.isLetter(current)
    }
    
    public static int getNumber(char uppercaseLetter) {
        int number = 0;
        
        switch (uppercaseLetter) {
            case 'A':
            case 'B':
            case 'C':
            number = 2;
            break;
                
            case 'D':
            case 'E':
            case 'F':
            number = 3;
            break;
                
            case 'G':
            case 'H':
            case 'I':
            number = 4;
            break;
                
            case 'J':
            case 'K':
            case 'L':
            number = 5;
            break;
                
            case 'M':
            case 'N':
            case 'O':
            number = 6;
            break;
                
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            number = 7;
            break;
                
            case 'T':
            case 'U':
            case 'V':
            number = 8;
            break;
                
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            number = 9;
            break;
        }
    return number;
    }
    
    public static String Scanner() {  
        Scanner input = new Scanner(System.in); // Create Scanner:
        String output = input.next();           // Collecting the user input and assign variable
        return output;
    }
}