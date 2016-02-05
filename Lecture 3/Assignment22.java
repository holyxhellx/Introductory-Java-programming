/* 
This program is the reply for Assignment 2.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/

package assignment.pkg2;

public class Assignment22 {
    public static void main (String[] args) {
       // Assignment 2.2:
        System.out.println("-----  Assignment 2.2 ------");
        System.out.println("");
        
        //Person A has a score of 10
        double scoreA = 10;
        //Person B has a score of 12
        double scoreB = 12;
           
        // Using if-statment because it is a small statement with few cases.
        // >= greater then and equal to
        // <= less then and equal to
        // else it is zero
        
            if (scoreA > scoreB) {
                    System.out.println("A Won");
            }            
            else if (scoreA < scoreB) {
                    System.out.println("B won");
            }
            else {
                    System.out.println("Game tied");
            }
    }
}
