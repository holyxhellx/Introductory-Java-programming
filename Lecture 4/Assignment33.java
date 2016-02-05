/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/

package assignment.pkg3;

public class Assignment33 {
    public static void main(String[] args) {
    
    /* 
        ASCII states that every symbol has a decimal code 
        http://www.asciitable.com/
        
        Decimal     Symbol (lowercase)
        97          a
        98          b
        99          c
        ...         ...
        122         z
    
        This is used to generate an integer between 97 and 122 and afterwords converted to the symbol.
    */    
        
    // Math.random gives at random number between 0 and 1
    // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound); 
    
    // Generate a random numbers between 97 and 122   
    int RandomNumber = (int) (Math.random() * ((122 - 97) + 1) + 97);
    char RandomLetter = (char)RandomNumber;
    
    System.out.println("The random generated number: "+RandomNumber);
    System.out.println("The converted lowercase letter : "+RandomLetter);
    }
}
