/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg3;

public class Assignment37 {
     public static void main(String[] args) {
  
         int x = 80000000;
         while (x > 0) x++;
         System.out.println("x is " + x);
         //added ; for having an "output"
         
         //The loop contiues and makes a value too large to be stored, which causes a overflow.
         // Java programming page: 45 "what is overflow"
     }
}
