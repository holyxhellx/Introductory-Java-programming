/* 
This program is the reply for Assignment 2.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/ 

package assignment.pkg2;

import java.util.Scanner;

public class Assignment26 {
    
    public static void main(String[] args) {
    // Assignment 2.6:
        System.out.println("-----  Assignment 2.6 ------");
        System.out.println("");
        
        // Help to do the inputs:
        System.out.println("Enter today’s day: (0-6) ");
        // User input type in
        Scanner scanner26 = new Scanner(System.in);
        // Collecting the user input and assign the variable
        int days = scanner26.nextInt();
        
        // Help to do the inputs:
        System.out.println("Enter the number of days elapsed since today: ");
        // Collecting the user input and assign the variable
        int daysFuture = scanner26.nextInt();
        
        //Cal. starting point (day of the week) + elaped days and fitted into case-statment by %:
        int daysFutureCases = (daysFuture+days)%7; 
        
        //Switch statment listed in cases and collected by "daysString":
        String daysString;
        switch (days) {
            case 0:  daysString = "Sunday";
                     break;
            case 1:  daysString = "Monday";
                     break;
            case 2:  daysString = "Tuesday";
                     break;
            case 3:  daysString = "Wednesday";
                     break;
            case 4:  daysString = "Thursday";
                     break;
            case 5:  daysString = "Friday";
                     break;
            case 6:  daysString = "Saturday";
                     break;
            default: daysString = "Invalid day number";
                     break;
        }
        
        //Switch statment listed in cases and collected by "daysFutureCases":
        String dayFutureString;
        switch (daysFutureCases) {
            case 0:  dayFutureString = "Sunday";
                     break;
            case 1:  dayFutureString = "Monday";
                     break;
            case 2:  dayFutureString = "Tuesday";
                     break;
            case 3:  dayFutureString = "Wednesday";
                     break;
            case 4:  dayFutureString = "Thursday";
                     break;
            case 5:  dayFutureString = "Friday";
                     break;
            case 6:  dayFutureString = "Saturday";
                     break;
            default: dayFutureString = "Invalid day number";
                     break;
        }
        System.out.println("");
        System.out.println("The entered today’s day: " +days);
        System.out.println("The entered number of days elapsed since today: " +daysFuture);
        System.out.println("Today is "+daysString +" and the future day is " +dayFutureString);

    }
}
