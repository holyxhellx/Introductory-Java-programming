/* 
This program is the reply for Assignment 4.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg4;

public class Assignment43 {
    
    //Gobal Variables for both methods:
    static int count = 0; 
        
    public static void main (String[] args) {
        for(int yearStart = 101 ; yearStart <= 2100 ; yearStart++) {
            //Test if the leap in years should be displayed (4 years)
        isLeapYear(yearStart); // --> Method "isLeapYear"
        } // <-- loop ends
    }
        
    public static int isLeapYear(int yearStart) {
        if(yearStart % 4 == 0){
                count++;
            //Remebmer println(is only for a line)
            //Check statment - (if:) count divd. by 10 is equal to 0 if true "new line" if not "insert black space".
            System.out.print(yearStart + (count % 10 == 0 ? "\n" : " "));
        } 
        return count;
    }
}
