/*
 *  Write a program that creates a file named Exercise8_4.txt if it does not 
 *  exist. Write 100 integers created randomly into the file. Integers are 
 *  separated by spaces in the file. Read the data back from the file into an 
 *  array and display the data in increasing order 
 *  (hint: you can use Arrays.sort)
 */

package assignment.pkg8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task84 {
    public static void main(String[] args) throws FileNotFoundException {
        
        File file = createFileAndOutput();
        
        // Open the file given as argument
        Scanner input = new Scanner(file);
        
        int[] numbers = new int[99]; //Create array with the index of 100
                
        //Read data from a file
        int number = input.nextInt();
        
        for (int i = 0 ; i < 100 ; i++) {
            
            if (input.hasNext()) {
                //Load the numbers into the array
                numbers[i] = number;
                
                //Select next number in line 
                number = input.nextInt();
            } else {
                break;
            }
        }
            
        // Close the file
        input.close();  
        
        //Sort the array
        Arrays.parallelSort(numbers);
        
        //Print array
        System.out.println(Arrays.toString(numbers));
          
    }

    public static File createFileAndOutput() throws FileNotFoundException {
        java.io.File file = new java.io.File("Exercise8_4.txt");
        
        //If file exists
        if (file.exists()) {
            System.out.println("File already exists");
        }
        
        //Create file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        //Write formatted output
        for (int i = 0; i < 100; i++) {
            // Math.random gives at random number between 0 and 1
            // (int)(Math.random() * ((upperbound - lowerbound) + 1) + lowerbound);
            
            // Generate a random numbers between 1 and 9
            int randomNumber = (int) (Math.random() * ((9 - 1) + 1) + 1);
            
            //print to file
            output.print(randomNumber + " ");
        }
        
        //Close the file
        output.close();
        return file;
    }
}