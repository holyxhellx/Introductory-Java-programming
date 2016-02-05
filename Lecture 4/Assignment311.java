/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg3;

public class Assignment311 {
    public static void main(String[] args) {
       
        //Variables:
        int count = 0; 

        System.out.println("All years leap from 101 to 2100");
       
        for(int year = 101; year <= 2100 ; year++) {  //Loop <--- Stat
            //Test if the leap in years should be displayed (4 years)
            if(year % 4 == 0){
               count++;
            //Remebmer println(is only for a line)
            //Check statment - (if:) count divd. by 10 is equal to 0 if true "new line" if not "insert black space".
            System.out.print(year + (count % 10 == 0 ? "\n" : " "));
            } 
        } //Loop <--- End
    }
}
