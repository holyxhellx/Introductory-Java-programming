/*
* Assignemnt 7.3
* 7.3 Imagine a coordinate system with a lot of geometric figures 
* (like rectangles, circles and triangles) in it. All geometric figures 
* have a color and a center. The colour can be specified by a String and
* the center can be specified by an x and a y coordinate 
* (For simplicity let’s use integers). A geometric figure also has a 
* method for checking if the color of another geometric figure is 
* the same as its own color. Implement the GeometricFigure class 
* as described above.
*/
package assignment.pkg7;

public class GeometricFigure {
    //---- Variables ----//
    String color;
    int x;
    int y;

    //---- Constructor ----//
    public GeometricFigure(String color, int x, int y){
        this.color = color;
        this.x = x;
        this.y = y;
    }

    //---- Method ----//
    public boolean checkSameColour(GeometricFigure g) {
        if(g.color.equals(this.color)) {
            return true;
        }
        return false;
    }
}


