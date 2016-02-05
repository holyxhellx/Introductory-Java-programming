package assignment.pkg8;

import java.util.Scanner; //Scanner input

public class Task81And82 {
    public static void main(String[] args) /*throws MyException*/  { //throws MyException - note to self
    
    /*  Assignment 8.1
    *   Write a program that creates an array with 100 randomly chosen integers.
    *   Prompt the user to enter an index of the array, and display the 
    *   corresponding element value. If the specified index is out of 
    *   bounds, display the message “Out of Bounds” by catching the 
    *   ArrayIndexOutOfBoundsException. Continue prompting for input until the 
    *   user enters a valid index.
    */
    
    //Create an array with 100 random numbers
    int[] number = new int[100];
    int count = 0;

        //Inserts numbers into the array
        for(int i = 0 ; i < 100 ; i++) {
            // Math.random gives a random number between 0 and 1
            // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound); 
            // Generate a random numbers between 10 and 99    
            number[i] = (int)(Math.random() * ((99 - 10) + 1) + 10);
            count++;
                //Display the output
                if (count%10 == 0) {
                    System.out.println(number[i] + ", ");
                } else {
                    System.out.print(number[i] + ", ");
                } 
        }
        
        Exception(number);
    }
        
    public static void Exception(int [] number) /*throws MyException*/ { //throws MyException - note to self
        boolean loop = true;
            System.out.println("Enter the index number of the array:");
            
            //throws MyException - note to self
            /*if (false == true){
                throw new MyException();
            }*///
        
        while (loop) {
            try {
                int indexUserInput = readUserInput(); //read input from user
            
                if (indexUserInput >= 0 && indexUserInput <= 99) {  
                    System.out.println("The Index "+indexUserInput +" contains the number: " +number[indexUserInput]); //Display the result
                    break; //break the loop                   
                
                //Add due to Task 8.2:  
                } else if (indexUserInput < 0) {
                    throw new MyException(); //Throws the expcetion to be catch 
                // -------------
                } else {
                    throw new IllegalArgumentException("Out of bounds"); //Throws the expcetion to be catch 
                }                         
            }
            catch (IllegalArgumentException e) {
                System.out.println("Try again: Out of bounds");
            }     
            catch (MyException e) { //the "e" contains the error-messages
                System.out.println("The radius cannot be negative");
            }
        }   
    }
    
    public static int readUserInput() {
    Scanner input = new Scanner(System.in); // Create Scanner
    int output = input.nextInt(); // Collecting the user input and assign the variable
    return output;
    }  
}

    /*  Assignment 8.2
    *   Create a custom exception MyException.
    *   Write a method that checks whether an integer is negative and if it is,
    *   throws MyException with the&message  “Integer must not be negative”.
    */

class MyException extends Exception {
    public MyException(){
        //Will be visable in the log, if thrown all the way to main method...
        super("Integer must not be negative"); 
    }
}




