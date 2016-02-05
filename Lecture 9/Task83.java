/*
*   Assignment 8.3
*   Write a program that creates a file named hello.txt if it does not exist
*   (hint: you can use the createNewFile() method from the File class to create 
*   a file). Store the message “Hello, World!” in the file. Read the text back
*   from the file and display it.
*   
*   Ref: page 476 - 477 introduction to javaprogramming
*/

package assignment.pkg8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task83 {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("hello.txt");
        
        //If file exists
        if (file.exists()) {
            System.out.println("File already exists"); 
        }
            //Create file
            java.io.PrintWriter output = new java.io.PrintWriter(file);
        
            //Write formatted output 
            output.print("Hello, World");
        
            //Close the file
            output.close();
        
        
        // Open the file given as argument
        BufferedReader infile = new BufferedReader (new FileReader(file));
        
        //Read data from a file
        String readline;
        readline = infile.readLine(); //Read the first line
        while (true) {
            if (readline == null) {
                 break;
            } else {
                System.out.println(readline);
                readline = infile.readLine(); //Read the next line
            }
        }
        // Close the file
        infile.close();        
    }
}
