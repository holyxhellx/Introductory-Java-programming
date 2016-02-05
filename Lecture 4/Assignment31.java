/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/

package assignment.pkg3;

public class Assignment31 {
    public static void main(String[] args) {
        
    // Math.random gives at random number between 0 and 1
    // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound); 
    
    // Generate a random numbers between 34 and 55    
    int RandomNumber1 = (int) (Math.random() * ((55 - 34) + 1) + 34);
    // Generate a random number between 0 and 999
    int RandomNumber2 = (int) (Math.random() * ((999 - 0) + 1) + 0);
    // Generate a random number between 5.5 and 55.5
    double RandomNumber3 = (Math.random() * ((55.5 - 5.5) + 1) + 5.5);
    double RandomNumber31 = Math.round(RandomNumber3 * 10);
    double RandomNumber32 = RandomNumber31 / 10;
    
    System.out.println("Random number between 34 and 55: "+RandomNumber1);
    System.out.println("Random number between 0 and 999: "+RandomNumber2);
    System.out.println("Random number between 5.5 and 55.5: "+RandomNumber32);
    }
}
