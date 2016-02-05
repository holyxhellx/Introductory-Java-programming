/* 
This program is the reply for Assignment 6.
Introductory  Programming at ITU.
Made by: Asger Balle Pedersen (Asbp)
*/
package assignment.pkg6;

// HEADER:
public class Rectangle {
    
    // Data fields
    private double width;
   
        
        // Collect width from Main class
        double getWidth() {
           return width;
        }
        
        // Set a new value
        void setWidth (double w) {
           width = w;
        }
    
    private double height;

    // Constructor (additional)
    /*      
            Rectangle() {
            width = 1.0;
            height = 1.0;
            }
    */
    
    // Constructor 
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    //Method
    double getArea() {
        double area = this.width * this.height;
        return area;
    }
    
    double getPerimeter() {
        double perimeter = (this.width * 2) + (this.height * 2);
        return perimeter;
    }
}

