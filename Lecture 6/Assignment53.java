/* 
This program is the reply for Assignment 5.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg5;

public class Assignment53 {
    public static void main (String[] args) {
                int[] myList = new int[100];
        //loop creating numbers to "mylist":
        for (int i = 0 ; i < 100 ; i++) {
            myList[i] = i + myList[i];
            System.out.println("myList [" + myList[i] + "] has index "+ i + " in the array.");
        }
    }
}