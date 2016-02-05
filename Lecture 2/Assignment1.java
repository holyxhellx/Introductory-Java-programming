/* 
This program is the reply for Assignment 1.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/ 

package assignment.pkg1;

import java.util.Scanner;
import java.text.DecimalFormat;
        
public class Assignment1 {
    /* 
    This are comments brackes 
    used to out comments parts of 
    the system and only stops then 
    the "stop- command" is done
    */
    
    public static void main(String[] args) 
    {
        
    // Assignment 1.1:
        String Assignment = "-----  Assignment 1.1 ------";
        System.out.println((String)(Assignment));
        System.out.println("");
        
        // The Variables in use: (String - text.)
        String text1 = "Introductory  Programming";
        String text2 = "The best course on ITU.";
        String text3 = "Learning Java is fun!";
    
        // This metode adds spaces in front of text
        System.out.println(String.format("%50s",text1));
        System.out.println(String.format("%50s",text2));
        System.out.println(String.format("%49s",text3));
  
    // Assignment 1.2:
        String Assignment2 = "-----  Assignment 1.2 ------";
        System.out.println("");
        System.out.println((String)(Assignment2));
        System.out.println("");
        
        // The Variables in use: (double or float - cal.)
        // Remember the diff. between . and , 
        String result2Text = "((9,5*4,5)-(2,5*3))/(45,5-3,5) = "; 
        double result2 = ((9.5*4.5)-(2.5*3))/(45.5-3.5);
        
        //Print the result + text (double)
        System.out.println((String) result2Text+result2);
        
    // Assignment 1.3:
        String Assignment3 = "-----  Assignment 1.3 ------";
        System.out.println("");
        System.out.println((String)(Assignment3));
        System.out.println("");
        
        // The Variables in use: (double or float - cal.)
        String Formular = "Area = Width * Height";
        String PerWidth = "Perimeter Width: ";
        String PerHeight = "Perimeter Height: ";
        String PerArea = "Area = ";
        double width = 5.5;
        double height = 8.5;       
        double area = width*height;
        
        // Print the result  (String - mixed with double)
        System.out.println((String)(PerWidth+width));
        System.out.println((String)(PerHeight+height));
        System.out.println("");
        System.out.println((String)(Formular));
        System.out.println((String)(PerArea+area));
      
    // Assignment 1.4:    
        String Assignment4 = "-----  Assignment 1.4 ------";
        System.out.println("");
        System.out.println((String)(Assignment4));
        System.out.println("");
        
        // Variables from algorithm:
        double miles = 100;
        double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        String AssigmentTextResult = "The total number of kilometers: ";
        
        System.out.println((String)(AssigmentTextResult+kilometers));
        
    // Assignment 1.5:    
        String Assignment5 = "-----  Assignment 1.5 ------";
        System.out.println("");
        System.out.println((String)(Assignment5));
        System.out.println("");
        
        // Help to the user:
        System.out.println("Write a integrer:");
        // User input type in
        Scanner scanner = new Scanner(System.in);
        // Collecting the user input and assign the variable to "int number"
        int number = scanner.nextInt();
            // If-statment figures out if the number is even or uneven.
            // if the case is as in the brackets (number%2==0) the number is even
            // The Remainder gives 1 or 0 from the user input
            if(number%2==0)
		{
                    double numberDivEven = number / 2;
                    System.out.println ("Half the amount: "+ numberDivEven);
		}
		else
		{
                    double numberDivUnEven = (number / 2) + 0.5;
                    System.out.println ("Half the amount: "+numberDivUnEven);
		}  
    // Assignment 1.6:    
        String Assignment6 = "-----  Assignment 1.6 ------";
        System.out.println("");
        System.out.println((String)(Assignment6));
        System.out.println(""); 
        
      // Help to do the inputs:
        System.out.println("Write the lenght of the box: ");
        // User input type in
        Scanner scanner61 = new Scanner(System.in);
        // Collecting the user input and assign the variable to "Length6"
        double Length6 = scanner.nextDouble();
        
      // Help to do the inputs:
        System.out.println("Write the width of the box: ");
        // User input type in
        Scanner scanner62 = new Scanner(System.in);
        // Collecting the user input and assign the variable to "Width6"
        double Width6 = scanner.nextDouble();
       
      // Help to do the inputs:
        System.out.println("Write the height of the box: ");
        // User input type in
        Scanner scanner63 = new Scanner(System.in);
        // Collecting the user input and assign the variable to "Height6"
        double Height6 = scanner.nextDouble();
        
        // The formular:
        String Formular6 = "Volume = Lenght * Width * Height ";
        // The display text:
        String Text6 = "Volume = ";
        // The cal.
        double result6 = Length6 * Width6 * Height6;
        
        // Display the Formular, and result
        System.out.println("");
        System.out.println((String)(Formular6));
        System.out.println((String)(Text6 + result6));
        
    // Assignment 1.7:    
        String Assignment7 = "-----  Assignment 1.7 ------";
        System.out.println("");
        System.out.println((String)(Assignment7));
        System.out.println("");
        
        // Help to do the inputs:
        System.out.println("Write a number of minuts: ");
        // User input type in
        Scanner scanner71= new Scanner(System.in);
        // Collecting the user input and assign the variable to "minutes"
        double minutes = scanner.nextDouble();
        
        // The number of minuts for each:
        double yearInMin    = 525600;
        double dayInMin     = 1440;
        
        // Shows how many of each total:
        // The double (totalYears2) collects the remaining, then years are cal.:
        int totalYears      = (int) (minutes/yearInMin);
        double totalYears2  = minutes%525600;
        int totalDays       = (int) (totalYears2/dayInMin);
        
        // Print the amount:
        System.out.println("");
        System.out.println("Total amount is " + totalYears +" year(s) and " + totalDays + " day(s)");
        
    // Assignment 1.8:    
        String Assignment8 = "-----  Assignment 1.8 ------";
        System.out.println("");
        System.out.println((String)(Assignment8));
        System.out.println("");
        
        // NOTE: 5 years = 157680000 seconds (60*60*24*365*5)
        
        // Total population of USA (present day)
        double population   = 312032486;
        // Total birth in 5 years: 
        double totalBirth   = 157680000/7;
        // Total death in 5 years:
        double totalDeath   = 157680000/13;
        // Total new immigrant;
        double totalImig    = 157680000/45;
        
        // Total population in 5years from now:
        double totalPop     = (population+totalBirth+totalImig)-totalDeath;
        
        // Rounding the value, setting the result format and conv. to string
                    // totalPop = Math.round(totalPop); ("NOTE the reply: #.####E8")
        DecimalFormat formatter = new DecimalFormat("###,###,###,###");
        String totalString = formatter.format(totalPop);
        
        // Print Result:
        System.out.println("Total population in 5 years: " + totalString);
        
    // Assignment 1.9:    
        String Assignment9 = "-----  Assignment 1.9 ------";
        System.out.println("");
        System.out.println((String)(Assignment9));
        System.out.println("");
        
        // Help to do the inputs:
        System.out.println("Write the number of years: ");
        // User input type in
        Scanner scanner19= new Scanner(System.in);
        // Collecting the user input and assign the variable to "years"
        double years = scanner.nextDouble();
        
        // Converting years to seconds:
        double seconds = 60*60*24*365*years;
        
        // Total population of USA (present day)
        double population19   = 312032486;
        // Total birth in 5 years: 
        double totalBirth19   = seconds/7;
        // Total death in 5 years:
        double totalDeath19   = seconds/13;
        // Total new immigrant;
        double totalImig19    = seconds/45;
        
        // Total population in 5years from now:
        double totalPop19     = (population19+totalBirth19+totalImig19)-totalDeath19;
        
        // Rounding the value, setting the result format and conv. to string
        DecimalFormat formatter19 = new DecimalFormat("###,###,###,###");
        String totalString19 = formatter19.format(totalPop19);
        
        // Convtering double to string (print output)
        String yearsString19 = formatter19.format(years);
        
        // Print Result:
        System.out.println("Total population in " + yearsString19 + " years: " + totalString19 );
    }
}
