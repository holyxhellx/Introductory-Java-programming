package assignment.pkg7;
/*
 * Assignemnt 7.4
 *    7.4 Let the Rectangle class from exercise 7.2 extend the GeometricFigure 
 *    class and modify the constructor to also consider the center and the color 
 *    of the rectangle. Design a Circle class that also extends GeometricFigure 
 *    and has a MyDouble data field called radius and a constructor that creates 
 *    a Circle with the specified radius, center and color.
 *
 *    7.5 For both the Rectangle and the Circle class implement the method 
 *    containsCenter(GeometricFigure g) that returns true if the center of g is 
 *    inside the rectangle or circle in the coordinate system.
 */

public class Cirkel extends GeometricFigure {

    //---- Variable ----//
    private MyDouble radius;

    MyDouble getRadius() {
        return radius;
    }

    void setRadius(MyDouble w) {
        radius = w;
    }

    //---- Constructor ----//
    public Cirkel(String color, int x, int y, MyDouble radius) {
        super(color, x, y);
        this.radius = radius;
    }

    //---- Method ----// 
    MyDouble getArea() {
        MyDouble area = new MyDouble(radius.getValue() * radius.getValue() * Math.PI);
        return area;
    }

    MyDouble getPerimeter() {
        MyDouble perimeter = new MyDouble((radius.getValue() * 2) * Math.PI);
        return perimeter;
    }

    public boolean widthEquals(Cirkel r) {
        return radius.equals(r.radius);
    }

    public boolean areaEquals(Cirkel r) {
        return getArea().equals(r.getArea());
    }

    public boolean perimeterEquals(Cirkel r) {
        return getPerimeter().equals(r.getPerimeter());
    }

    public boolean containsCenter(GeometricFigure g) {
        /*
         *   The formular of the cirkel (known centre and radius)
         *   (X - Xo)^2 + (Y - Yo)^2 = r^2  
         *       X & Y are the perimeter koordinats
         *       Xo & Yo are the cetre koordinats
         *       r is the radius of the cirkel
         *
         */
        if ((Math.pow((this.x - g.x), 2) + Math.pow((this.y - g.y), 2)) > Math.pow((this.radius.getValue()), 2)) {
            return true;
        } else {
            return false;
        }
    }

    // The main method; (testing)
    public static void main(String[] args) {
        MyDouble testRunCirkel = new MyDouble(5.0);
        MyDouble testRunRectWidth = new MyDouble(2.0);
        MyDouble testRunRectHeight = new MyDouble(3.0);
        Cirkel cirkel01 = new Cirkel("red", 10, 1, testRunCirkel);
        Cirkel cirkel02 = new Cirkel("red", 10, 2, testRunCirkel);
        Rectangle rectangle01 = new Rectangle("green", 10, 10, testRunRectWidth, testRunRectHeight);

        System.out.println("Colour of cirkel01: " + cirkel01.color);
        System.out.println("Area of cirkel01: " + cirkel01.getArea().getValue());
        System.out.println("AreaEqual: " + cirkel01.areaEquals(cirkel02));
        System.out.println("ContainsCenter: " + cirkel01.containsCenter(cirkel02));
        System.out.println("");
        System.out.println("Rectangle area: " + rectangle01.getArea().getValue());
        System.out.println("Rectangle colour: " + rectangle01.color);

    }
}
