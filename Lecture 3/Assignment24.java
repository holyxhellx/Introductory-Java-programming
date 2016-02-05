/* 
This program is the reply for Assignment 2.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/ 

package assignment.pkg2;

public class Assignment24 {
    
    public static void main(String[] args) {
    // Assignment 2.4:
        System.out.println("-----  Assignment 2.4 ------");
        System.out.println(""); 
        
        
        //Random numbers selected (number1 && number2), should print "true", "true" and "false";
        int number1 = 36;
        int number2 = 71;
        
        // Boolean expressions a, b and c: 
        // Logical Operators used: || or, ^ xnor.
        if (number1 > 35 || number2 > 70) {
            System.out.println("Boolean expressions a is true");
        }
            else {
                System.out.println("Boolean expressions a is false");
            }
        if (number1 > 35 && number2 > 70) {
            System.out.println("Boolean expressions b is true");
        }   
            else {
                System.out.println("Boolean expressions b is false");
            }
        if (number1 > 35 ^ number2 > 70) {
            System.out.println("Boolean expressions c is true");
        }
            else {
                System.out.println("Boolean expressions c is false");
            }
   
    }
}
