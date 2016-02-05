package examproject;


import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

public class LiftBtn  {   
    Shape btn;
    Polygon btnCall;
    
    LiftBtn(Shape btn) {
        this.btn = btn;
        //this.on = false;
        btn.setFill(Color.BLUE); 
        
        btn.setOnMouseClicked((MouseEvent event) -> {
                btn.setFill(Color.RED);
                //System.out.println(this.btn.getLayoutX() + "," + this.btn.getLayoutY()); //Display the coordinats on each circle (this not nessesary)
        });
        
    }
    
    LiftBtn (Polygon btnCall) {
        this.btnCall = btnCall;
        //this.on = false;
        btnCall.setFill(Color.BLUE); 
        
        btnCall.setOnMouseClicked((MouseEvent event) -> {            
                btnCall.setFill(Color.RED);
                //System.out.println(this.btn.getLayoutX() + "," + this.btn.getLayoutY()); //Display the coordinats on each circle (this not nessesary)
        });
    }
    
    
    /*
    boolean on; // When on, somebody has pushed the button and the light is red. Otherwise it is green.
    Shape btn; // Reference to a JavaFX circle, rectangle or polygon on the screen. LiftBtn(Shape btn) // The constructor. The caller has created the button Shape,
    e.g. a circle, and passes it on to LiftBtn.
    Push( ) and Reset( ). The methods should not only set "on", but also update the
    Button color. There is no reason to refresh the screen. JavaFX does it automatically.
    */
}
