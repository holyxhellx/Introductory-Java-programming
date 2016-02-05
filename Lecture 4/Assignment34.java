/* 
This program is the reply for Assignment 3.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/

package assignment.pkg3;

public class Assignment34 {
    public static void main(String[] args) {
        
        String s1 = "Welcome";
        String s2 = "welcome";
        
        // (a) String == String
        if (s1.equals(s2)) {
            Boolean isEqual = true;
        }
        // (b) String == String (with ignore)
        else if (s1.equalsIgnoreCase(s2)) {
            Boolean isEqual = true;
        }
        
        // (c) String compare to String
        int xc = s1.compareTo(s2);
        
        // (d) String compare to String (with ignore)
        int yd = s1.compareToIgnoreCase(s2);
        
        // (e) check weather s1 has the prefix AAA(assign result boolean is Equal)
        if (s1.startsWith("AAA")){
            Boolean isEqual = true;
        } 
        // (f) check weather s1 has the suffix AAA(assign result boolean isEqual)
        else if (s1.endsWith("AAA")) {
            Boolean isEqual = true;
        }
        // (g) Assign the length of s1 to a int varable x
        int xg = s1.length();
      
        // (h) Assign the first character of s1 to a char variable b
        char b = s1.charAt(0);
        
        // (i) Create a new string s3 that combines s1 with s2
        String s3i = s1 + s2;
       
        // (j) Create a substring of s1 starting from index 1
        String s1j = s1.substring(1);
        
        // (k) Create a substring of s1 from index 1 to index 4
        String s1k = s1.substring(1, 4);
        
        // (l) Create a new string s3 that converts s1 to lowercase
        String s3l = s1.toLowerCase();
        
        // (m) Create a new string s3 that converts s1 to uppercase
        String s3m = s1.toUpperCase();
        
        // (n) Create new string s3 that trims whitespace characters on both ends of s1
        // trim()
        String s3n = s1.trim();
            
            /*
            replaceAll("\\s","")
                    \w = Anything that is a word character
                    \W = Anything that isn't a word character (including punctuation etc)
                    \s = Anything that is a space character (including space, tab characters etc)
                    \S = Anything that isn't a space character (including both letters and numbers, as well as punctuation etc)
                    NOTE: you need to escape the backslash if you want \s to reach the regex engine, resulting in \\s
                    Reference: http://stackoverflow.com/questions/5455794/removing-whitespace-from-strings-in-java
             
        This code can be used if the string s1 isEqual to "Welcome     somethingElse" to remove the spaces between.  
        
        String s3n = s1.replaceAll("\\s", "");
        */
        
        // (o) Assign the index of the first occurrence of the character e in s1 to an int variable x
        int xo = s1.lastIndexOf("e");
        
        // (p) Assign the index of the last occurrence of the string abc in s1 to an int variable x
        int xp = s1.lastIndexOf("abc");
        
    }
}
