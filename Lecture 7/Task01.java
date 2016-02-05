
package assignment.pkg6;

public class Task01 {
    public static void main (String[] args) {
        
        // Object
        Rectangle r1    = new Rectangle(4, 40);
        Rectangle r2    = new Rectangle(3.5, 35.9);
        
        //Get Method
        //r1.getArea() && r1.getPerimeter();
        //r2.getArea() && r2.getPerimeter();
        
        //Print cmd;
        System.out.println("R1 area " + r1.getArea());
        System.out.println("R1 perimeter " + r1.getPerimeter());
        System.out.println("R2 area " + r2.getArea());  
        System.out.println("R2 perimeter " + r2.getPerimeter());
        
        //Set the value of Object (r1) without interacting with r2
        r1.setWidth(1000);
        
                System.out.println("r1 " + r1.getWidth());
                System.out.println("r1 " + r2.getWidth());
    }
}

