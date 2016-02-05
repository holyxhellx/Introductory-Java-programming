package assignment.pkg6;

import java.util.Date;

public class Task02 {
    public static void main (String[] args) {
        
        // Date Object added millis
        for (long i = 100000 ; i < Math.pow(10, 12) ; i *= 10) {
        Date date = new Date(System.currentTimeMillis() + i); 
        System.out.println(date.toString());  
        }
    }
}