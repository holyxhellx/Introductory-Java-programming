/* 
This program is the reply for Assignment 5.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg5;

import java.util.Arrays;

public class Assignment57 {
    public static void main (String[] args) {
    int[] arr = {40, 20, 30, 10, 50};
    sort(arr);
    }

    public static int sort(int[] array) { 
    //Create string to compare with, before sorting:
    String arr = Arrays.toString(array);
    //Sorting the Array:
    Arrays.parallelSort(array);
    //Create string from sorted array:
    String arrSorted = Arrays.toString(array);
        
        //Compare the strings:
        if (arr.equals(arrSorted)) {
        System.out.println("The array is already sorted!");
        System.out.println(arr);
        System.out.println(arrSorted);
        } else {
        System.out.println("The array has been sorted, and is no longer as the original");
        System.out.println(arr);
        System.out.println(arrSorted);
        }
    return 0;
    }
}
