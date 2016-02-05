/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/

package assignment.pkg3;

public class Assignment32 {
    public static void main(String[] args) {
        
        //The following conversion is allowed, the decimal value of 'A' is 65
        char c = 'A'; 
        int i = (int)c;
        System.out.println(i);
        
        //The following conversion is allowed, the decimal value of 1000.34 is 1000
        float f = 1000.34f; 
        int j = (int)f;
        System.out.println(j);
        
        //The following conversion is allowed, the decimal value of 1000.34 is 1000
        double d = 1000.34;
        int k = (int)d;
        System.out.println(k);
        
        //The following conversion is allowed, the decimal value of 97 is the character 'a' 
        int h = 97;
        char e = (char)h;
        System.out.println(e);
    }
}
