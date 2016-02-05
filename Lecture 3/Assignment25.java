/* 
This program is the reply for Assignment 2.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/ 

package assignment.pkg2;

public class Assignment25 {
    
    public static void main(String[] args) {
    // Assignment 2.5:
        System.out.println("-----  Assignment 2.5 ------");
        System.out.println("");
        
        //variable set to 6 = saturday:
        int day = 6;
        
        //Switch statment listed in cases and collected by "dayString":
        String dayString;
        switch (day) {
            case 0:  dayString = "Sunday";
                     break;
            case 1:  dayString = "Monday";
                     break;
            case 2:  dayString = "Tuesday";
                     break;
            case 3:  dayString = "Wednesday";
                     break;
            case 4:  dayString = "Thursday";
                     break;
            case 5:  dayString = "Friday";
                     break;
            case 6:  dayString = "Saturday";
                     break;
            default: dayString = "Invalid day number";
                     break;
        }
        System.out.println(dayString);
  
    }
}
