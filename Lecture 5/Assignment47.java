/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;


import java.util.Scanner;

public class Assignment47 {
    public static void main (String[] args) {
       //Vaiables:
       String str       = null;
       String varchar   = null;
       char a           = 0;
       int count        = 0;
       
       System.out.print("Enter a word: "); 
       str = Scanner();         // <-- Method Scanner
       System.out.print("Enter a character: ");
       varchar = Scanner();     // <-- Method Scanner
       a = varchar.charAt(0);   // Convert string to char (select the first letter)
       count = count(str, a);   // <-- Method count
       System.out.println("The total number of times "+ varchar +" are present in the word "+ str +" is "+count);
       
    }    
    public static int count(String str, char a) {
        //Variable
        int count   = 0;
        int loop    = 0;
       
        for ( loop = 0 ; loop < str.length(); loop++ ) {
            if ( str.charAt(loop) == a ) {
                count++;
            }
        }
        return count;
    }
    
    public static String Scanner() {  
        Scanner input = new Scanner(System.in); // Create Scanner:
        String output = input.next();           // Collecting the user input and assign variable
        return output;
    }
}
