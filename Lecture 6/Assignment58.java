/* 
This program is the reply for Assignment 5.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg5;

import java.util.Arrays;

public class Assignment58 {
    public static void main (String[] args) {
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {2, 7, 8, 4};
        
        int[] arr3 = merge(arr1, arr2); // <-- Method merge
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        
        int lengthArrayOne = arr1.length; //collect length of array
        int lengthArrayTwo = arr2.length; //collect length of array
        
        int[] arr3 = new int[lengthArrayOne + lengthArrayTwo];              //Create array equal to length of both earlier arrays
        System.arraycopy(arr1, 0, arr3, 0,lengthArrayOne);                  //Copy a specfied array, to a new array at a specified position. 
        System.arraycopy(arr2, 0, arr3, lengthArrayOne, lengthArrayTwo);
        
        return arr3;
    }
}
