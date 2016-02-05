package application10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task01 {   
    public static void main(String[] args) throws IOException {   
        
        ArrayList arrayList = new ArrayList();

        BufferedReader input = new BufferedReader (new InputStreamReader (System.in)); // Start reading input from the user

        System.out.println("Type 10 intergers:");

        String userInput = input.readLine(); // Read a line from the terminal      

        int intCount = userInput.length() - userInput.replace(" ", "").length() + 1;  // The number of string split

        String[] intSplit = userInput.split("\\s+");  // Split string line

        for (int i = 0; i < intCount ; i++) { //Add int to array list
            arrayList.add(i);
        }
        
        Arraylist resultList = new ArrayList();
        resultList = removeDuplicates(arrayList); //remove duplicates method -->
        
        System.out.println(resultList); // print list
        
    }
    public static void removeDuplicates(ArrayList list) {
        
    return list;
    }
}

