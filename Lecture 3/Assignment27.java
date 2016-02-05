/* 
This program is the reply for Assignment 2.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/ 

package assignment.pkg2;

import java.util.Scanner;

public class Assignment27 {
        public static void main(String[] args) {
    // Assignment 2.7:
        System.out.println("-----  Assignment 2.7 ------");
        System.out.println("");       
     
        //Scanner obj.
        Scanner scanner27 = new Scanner(System.in);
        
        // Help to do the inputs:
        System.out.println("Enter the first weight: (kg.) ");
        // Collecting the user input and assign the variable
        double weight1 = scanner27.nextDouble();
        
        // Help to do the inputs:
        System.out.println("Enter the price: (dkr.) ");
        // Collecting the user input and assign the variable
        double price1 = scanner27.nextDouble();
       
        // Help to do the inputs:
        System.out.println("Enter the secend weight: (kg.) ");
        // Collecting the user input and assign the variable
        double weight2 = scanner27.nextDouble();
        
        // Help to do the inputs:
        System.out.println("Enter the price: (dkr.) ");
        // Collecting the user input and assign the variable
        double price2 = scanner27.nextDouble();
        
        //Calculation: price/weigh
        double total1 = price1/weight1;
        double total2 = price2/weight2;
        
        if (total1 == total2) {
            System.out.println("The price pr. unit is the same");
        }
        else if (total1 < total2) {
            System.out.println("The first price/weight pr. unit is best");
        }
        else {
            System.out.println("The second price/weight pr. unit is best");
        }
     
    }
}
