
package assignment.pkg9;

import java.text.DecimalFormat;
import java.util.Random;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class CirclePane extends Pane {
    static final double R = 15;
    Circle circle1 = new Circle(R, Color.RED);
    Circle circle2 = new Circle(R, Color.BLUE);
    Line line = new Line();
    Text text = new Text();

    public CirclePane() {
        Random number   = new Random();
        double minPos   = R;
        double RangeX   = 500-(6*minPos);
        double RangeY   = 300-(6*minPos);
        circle1.setCenterX(minPos+ RangeX * number.nextDouble());
        circle1.setCenterY(minPos+ RangeY * number.nextDouble());
        circle2.setCenterX(minPos+ RangeX * number.nextDouble());
        circle2.setCenterY(minPos+ RangeY * number.nextDouble());
        this.getChildren().addAll(line, circle1, circle2, text);
        
    }  
    double getDistance() {
        
        // double distance = Math.sqrt( (circle1.getCenterX()-circle2.getCenterX())*(circle1.getCenterX()-circle2.getCenterX()) + (circle1.getCenterY()-circle2.getCenterY())*(circle1.getCenterY()-circle2.getCenterY()));
        double deltaX = Math.pow(circle1.getCenterX()-circle2.getCenterX(), 2);
        double deltaY = Math.pow(circle1.getCenterY()-circle2.getCenterY(), 2);
        return Math.sqrt(deltaX + deltaY);
    }
    
    public void showDistance() {
        line.setStartX(circle1.getCenterX());
        line.setStartY(circle1.getCenterY());
        line.setEndX(circle2.getCenterX());
        line.setEndY(circle2.getCenterY());
        
        double x1 = line.getStartX(), x2 = line.getEndX(), y1 = line.getStartY(), y2 = line.getEndY();
        double x = Math.min(x1, x2) + Math.abs(x1 - x2) / 2;
        double y = Math.min(y1, y2) + Math.abs(y1 - y2) / 2;
                
        text.setX(x);
        text.setY(y);
        text.setText("The Distance: " 
                + new DecimalFormat("#.##").format(getDistance()));
    }

}
