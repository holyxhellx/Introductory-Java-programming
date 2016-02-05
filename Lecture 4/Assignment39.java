/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg3;

public class Assignment39 {
    public static void main(String[] args) {
        
    // Statement from assignment:
        /* 
        long sum = 0;
        for (int i = 0 ; i <= 1000 ;  i++) 
            sum = sum + i;
            System.out.println("sum is " + sum);
        */    
        
        
    // Converting the for-loop to a while-loop:
        /*
        long sum = 0, i = 0; 
        while (i <= 1000) { 
            sum = sum + i;
            i++;
        }
            System.out.println("sum is " + sum);
        */
        
        
    // Converting the for-loop to a do-while-loop:
        long sum = 0;
        int i = 0;
        
        do {
            sum = sum + i;
            i++;
        // Reason for 1000 -> 1001 is the opperator stop condition and structur (<=).
        }while(i != 1001);
            System.out.println("The sum is " + sum); 
    }
}
