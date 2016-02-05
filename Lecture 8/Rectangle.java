/*
* Assignemnt 7.2
* 7.2 Modify the Rectangle class from exercise 6.1 such that:
* - The width and height data fields are of type MyDouble.
* - The return types of the getArea() and getPerimeter() methods are MyDoubles.
* - It contains the methods widthEquals(Rectangle r), heightEquals(Rectangle r),
*   areaEquals(Rectangle r) and perimeterEquals Rectangle r), 
*   that return true if the width, height, area or perimeter values 
*   are equal to the specified Rectangle’s values respectively.
*/
package assignment.pkg7;

public class Rectangle extends GeometricFigure{
    
    //---- Variable ----//
    private MyDouble width;
    private MyDouble height;

        MyDouble getWidth() {
           return width;
        }
    
        MyDouble getHeight() {
           return width;
        }
        

        void setWidth (MyDouble w) {
           width = w;
        }

        void setHeight (MyDouble w) {
           width = w;
        }
    
    //---- Constructor ----//
        public Rectangle(String color, int x, int y, MyDouble width, MyDouble height){
        super(color, x, y);
        this.width = width;
        this.height = height;
    }
    
    //---- Method ----// 
    MyDouble getArea() {
        MyDouble area = new MyDouble(width.getValue() * height.getValue());
        return area;
    }
    
    MyDouble getPerimeter() {
        MyDouble perimeter = new MyDouble((width.getValue() * 2) + (height.getValue() * 2));
        return perimeter;
    }
    
    public boolean widthEquals(Rectangle r) {
        return width.equals(r.width);
    }
    
    public boolean heightEquals(Rectangle r) { 
        return height.equals(r.height);
    }
    
    public boolean areaEquals(Rectangle r) { 
        return getArea().equals(r.getArea());
    }
    
    public boolean perimeterEquals(Rectangle r) {
        return getPerimeter().equals(r.getPerimeter());  
    }
}
