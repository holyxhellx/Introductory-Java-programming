/* 
This program is the reply for Assignment 5.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg5;

public class Assignment55 {
    public static void main (String[] args) {
    // Create array and assign its reference to variable refVar = new dataType[10][10];
    // Combine declaration and creation in one statement
    double[][] matrix = new double[25][25];
        for (int i = 0; i < matrix.length; i++) {         //Vertical matrix (y-akse)
            for (int j = 0; j < matrix[i].length; j++) {  //Horizontal matrix (x-akse)
                // Math.random gives at random number between 0 and 1
                // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound); 
                // Generate a random numbers between 50 and 100    
                matrix[i][j] = (int)(Math.random() * ((100 - 50) + 1) + 50);
            }
        } 
        min(matrix);
    
    } 
 
    public static double min(double[][] arr) {
        //Start 
        double min = arr[0][0];
        
        //Loop trought the array, check the value 25xtuples X 25xcolumns:
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {
            // Use: "System.out.println(i);" to check that the array seach all 
            // 25 x 25 tuples/columns. will be stated like 25x0 and 25x1 and etc.
            
            //Checking if the array is less then the currently min[value], and 
            //replacing it if it is true. 
                if (arr[i][i] < min)                
                {
                    min = arr[i][i];
                }
            }
        }
        System.out.println("The minimum number in the array is: " +min);
        return min;
    }
}
    
   