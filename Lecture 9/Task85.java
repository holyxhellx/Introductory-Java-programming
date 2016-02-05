/*
 *  Write a method that will count the number of characters, words, and lines in
 *  a file. Words are separated by whitespace characters. For example a file 
 *  with the text:
 *      Mary had a little lamb
 *      Whose fleece was white as snow.
 *      And everywhere that Mary went, 
 *      The lamb was sure to go!
 *  
 *      Contains 4 lines, 22 words, and 89 characters.
 */
package assignment.pkg8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task85 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int countChar = 0;
        int countWord = 0;
        int countline = 0;
        String readLine;
        
        File file = createFileAndOutput();
        
        // Open the file given as argument
        BufferedReader infile = new BufferedReader (new FileReader(file));
        
        //Read data from a file
        readLine = infile.readLine(); //Read the first line
        while (true) {
            if (readLine == null) {
                 break;
            } else {
                //Count of line(s)
                countline++; //Count done by number of loops
                
                //Count of Word(s)
                int readWord        = readLine.length() - (readLine.replaceAll("\\s+", "").length()) + 1; //Count done by number of spaces + 1
                countWord           = countWord + readWord;
                
                //Count of char(s)
                String readChar     = readLine.replaceAll("\\s+", ""); //Count done by number of char without spaces
                countChar           = countChar + readChar.length();
                
                readLine    = infile.readLine(); //Read the next line
            }
        }
        // Close the file
        infile.close();
        
        System.out.println("The file contains "+countline +" line(s), " +countWord+" word(s) and " +countChar +" char(s)");
    }

    public static File createFileAndOutput() throws FileNotFoundException {
        java.io.File file = new java.io.File("Exercise8_5.txt");
        
        //If file exists
        if (file.exists()) {
            //System.out.println("File already exists");
            //System.out.println("");
        }
        
        //Create file
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        
        //Write formatted output 
         output.print(  "Mary had a little lamb\n" +
                        "Whose fleece was white as snow.\n" +
                        "And everywhere that Mary went,\n" +
                        "The lamb was sure to go!");
        
        //Close the file
        output.close();
        return file;
    }
}
