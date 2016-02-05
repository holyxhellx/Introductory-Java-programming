/* 
This program is the reply for Assignment 5.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg5;

public class Assignment54 {
    public static void main (String[] args) {
    // Create array and assign its reference to variable refVar = new dataType[10][10];
    // Combine declaration and creation in one statement
    double[][] matrix = new double[25][25];
        // Alternative syntax
        //dataType refVar[][] = new dataType[25][25]; (DataType = double/int/long etc.)
        for (int i = 0; i < matrix.length; i++) {    //Vertical matrix (y-akse)
            for (int j = 0; j < matrix[i].length; j++) {  //Horizontal matrix (x-akse)
                // Math.random gives at random number between 0 and 1
                // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound); 
                // Generate a random numbers between 50 and 100    
                matrix[i][j] = (int)(Math.random() * ((100 - 50) + 1) + 50);
            }
        }
    }
}