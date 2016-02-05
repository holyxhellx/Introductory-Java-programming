package examproject;

import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;

/**
 *
 * @author Asger
 */
public class Lift extends Application {
    
    final int numberOfFloors = 6;
    
    Button btn, Resetbtn;
    Pane root;
    Scene scene;
    Rectangle lift;
    Shape[] circlesInner = new Shape[numberOfFloors];
    Polygon[] tritop = new Polygon[numberOfFloors];
    Polygon[] tributtom = new Polygon[numberOfFloors];
    
    @Override
    public void start(Stage primaryStage) {
        final int circleRadius = 10;    //radius of a circle
        final int circleXInner = 100;   //Start coordinate X for circle
        final int circleYInner = 100;   //Start coordinate Y for circle
        int i = numberOfFloors;
        final double triangleFirstX = 180d;
        final double triangleFirstY = 100d;
        final double triangleSecondX = 200d;
        final double triangleSecondY = 120d;
        final double triangleThirdX = 220d;
        final double triangleThirdY = 100d;
        
        root = new Pane();  //Create the pane
    
        Rectangle rec = new Rectangle(90, (numberOfFloors*100)); //Inner Rectangle:
        rec.setStroke(Color.BLUE);
        rec.setFill(Color.TRANSPARENT);
        rec.setLayoutX(30);
        rec.setLayoutY(50);
        
        /*
        * Added afterwards: Floorsencor
        *
        FloorSensor floorSensor = new FloorSensor(new Rectangle(30,10)); //floor sensor:
        floorSensor.btn.setStroke(Color.GREEN);
        floorSensor.btn.setFill(Color.BLACK);
        floorSensor.btn.setLayoutX(135);
        floorSensor.btn.setLayoutY(numberOfFloors * 100 + 15);
        /*
        * Added afterwards: Floorsencor
        */        
        
        lift = new Rectangle(30, 50); //Lift Rectangle:
        lift.setStroke(Color.BLUE);
        lift.setFill(Color.TRANSPARENT);
        lift.setLayoutX(135);
        lift.setLayoutY(numberOfFloors * 100 - 25);
        
        Label textLabelInner = new Label("Lift"); //Inner Text-label:
        textLabelInner.setLayoutX(60);
        textLabelInner.setLayoutY(55);
        Label textLabelInnerbuttons = new Label("Inner buttons");
        textLabelInnerbuttons.setLayoutX(30);
        textLabelInnerbuttons.setLayoutY(25);
        root.getChildren().addAll(rec, lift, /*floorSensor.btn ,*/ textLabelInner, textLabelInnerbuttons); //Add all elements:
        
        /*
        * Added afterwords: Reset btn
        *
        Resetbtn = new Button(); // Run Button
        Resetbtn.setText("Reset");
        Resetbtn.setLayoutX(180);
        Resetbtn.setLayoutY(45);
        root.getChildren().add(Resetbtn);
        Resetbtn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //Reset Lift
                lift.setLayoutX(135);
                lift.setLayoutY(numberOfFloors * 100 - 25);
                //Reset floorsensor
                  //floorSensor.btn.setFill(Color.BLACK);
                  //floorSensor.btn.setLayoutY(numberOfFloors * 100 + 15);
                //Reset circlesInner and triangle
                for (int i = 0; i < numberOfFloors; i++)  {     
                    circlesInner[i].setFill(Color.BLUE); // set fill of circlesInner[no] to BLUE
                    //tritop[i].setFill(Color.BLUE);
                    //tributtom[i].setFill(Color.BLUE);
                }
            } 
        });
        /*
        *
        */
        
        btn = new Button(); // Run Button
        btn.setText("Run");
        btn.setLayoutX(130);
        btn.setLayoutY(45);
        root.getChildren().add(btn);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("New RUN push btn");
                double currentFloor = (int) lift.getLayoutY(); // Where the lift is right now.
                double direction = 1;
                double nextFloor;

                LinkedList floorToVisitInDirection = new LinkedList();
                LinkedList floorToVisitInQuery = new LinkedList();               
                try {
                    for (int j = (numberOfFloors-1); j >= 0; j--) {
                        Color colorCircle = (Color) circlesInner[j].getFill();
                        //Color colorTriangleTop = (Color) tritop[j].getFill();                    
                        //Color colorTriangleButtom = (Color) tributtom[j].getFill();
                        int colorCirclehex = (int)( colorCircle.getRed() * 255 ); //RGB (red, green, blue between index of 0 - 255)
                        //int colorTriangleTophex = (int)( colorTriangleTop.getRed() * 255 ); //RGB (red, green, blue between index of 0 - 255)
                        //int colorTriangleButtomhex = (int)( colorTriangleButtom.getRed() * 255 ); //RGB (red, green, blue between index of 0 - 255)
                        if (colorCirclehex == 255 /*|| colorTriangleTophex == 255 || colorTriangleButtomhex == 255*/) {
                            if (direction == 1 && currentFloor > (circlesInner[j].getLayoutY() - 25)) {
                                floorToVisitInDirection.addLast(circlesInner[j].getLayoutY() - 25);
                            } /*
                            else if (direction == 1 && currentFloor > (tritop[j].getLayoutY() - 25)){
                                floorToVisitInDirection.addLast(circlesInner[j].getLayoutY() - 25);
                            }
                            else if (direction == 1 && currentFloor < (tributtom[j].getLayoutY() - 25)) { 
                                floorToVisitInQuery.addFirst(circlesInner[j].getLayoutY() - 25);
                            } */
                            else {
                                floorToVisitInQuery.addFirst(circlesInner[j].getLayoutY() - 25);
                            }
                        }
                        System.out.println("floor IN direction:" +floorToVisitInDirection);
                        System.out.println("Floor in query: " +floorToVisitInQuery);
                    }
                } catch (Exception e) {
                    System.out.println("Null pointer exception: " +e);
                }
                //System.out.print("Normal: "+floorToVisitInQuery);
                //LinkedList floorToVisitInQuery.descendingIterator();
                //System.out.print("Reverse: "+floorToVisitInQuery);             
                    
                //Lift movement: 
                for (floorToVisitInDirection.size(); floorToVisitInDirection.size() > 0; floorToVisitInDirection.size()) {          
                    if (!floorToVisitInDirection.isEmpty() && direction == 1 ) {
                        nextFloor = (double) floorToVisitInDirection.getFirst(); //cast to double get first
                        lift.setLayoutY(nextFloor); //Set coordinats for lift
                        /*
                        * added afterwords
                        */
                        //floorSensor.btn.setLayoutY(nextFloor + 45); //Set coordinats for floorsensor
                        
                        floorToVisitInDirection.removeFirst(); //Remove floor visit from linkedlist floorToVisit
                        int no = getCirclesInnerIndexNo(nextFloor); //Method get index number
                        circlesInner[no].setFill(Color.BLUE); // set fill of circlesInner[no] to BLUE  
                    }
                }
                direction = -1; //Change lift direction
                
                //System.out.println("IN direction solved");
                //System.out.println("direction:" +direction);
                
                for (floorToVisitInQuery.size(); floorToVisitInQuery.size() > 0; floorToVisitInQuery.size()) {          
                    if (!floorToVisitInQuery.isEmpty() && direction == -1 ) {
                        nextFloor = (double) floorToVisitInQuery.getFirst(); //cast to double get first
                        lift.setLayoutY(nextFloor); //Set coordinats for lift
                        
                        /*
                        * added afterwords
                        */
                        //floorSensor.btn.setLayoutY(nextFloor + 45); //Set coordinats for floorsensor
                        
                        floorToVisitInQuery.removeFirst(); //Remove floor visit from linkedlist floorToVisit
                        int no = getCirclesInnerIndexNo(nextFloor); //Method get index number
                        circlesInner[no].setFill(Color.BLUE); // set fill of circlesInner[no] to BLUE
                    }
                }
            }

            private int getCirclesInnerIndexNo(double nextFloor) {
                int no = 0;
                int lvl = (int) nextFloor;
                switch ((int) lvl) {
                    case 75:
                        no = 0;
                        break;
                    case 175:
                        no = 1;
                        break;
                    case 275:
                        no = 2;
                        break;
                    case 375:
                        no = 3;
                        break;
                    case 475:
                        no = 4;
                        break;
                    case 575:
                        no = 5;
                        break;
                }
                return no;
            }         
        });
        
        
        for (i = 0; i < numberOfFloors ; i++) {  //Inner circle
            LiftBtn c = new LiftBtn(new Circle(circleRadius));          
            c.btn.setLayoutX(circleXInner);
            c.btn.setLayoutY(i * circleYInner + 100);
            c.btn.setStroke(Color.BLUE);
            circlesInner[i] = c.btn;
            root.getChildren().add(c.btn);
            
            Label l = new Label();
            int floornumber = (numberOfFloors - 1) - i;
            l.setText("" + floornumber);
            l.setLayoutX(circleXInner - 30);
            l.setLayoutY(i * circleYInner + 100 - 8);
            root.getChildren().add(l); 
            
            Label ll = new Label();
            ll.setText("Floor: " + floornumber);
            ll.setLayoutX(triangleThirdX + 20);
            ll.setLayoutY(i * circleYInner + 100 - 8);
            root.getChildren().add(ll); 
            
            if (i < (numberOfFloors - 1)) {
                LiftBtn triangleTop = new LiftBtn(new Polygon());
                triangleTop.btnCall.getPoints().setAll(
                    // X , Y (px)
                    triangleFirstX, (triangleFirstY + (i * 100d)),
                    triangleSecondX,(triangleSecondY + (i * 100d)),
                    triangleThirdX, (triangleThirdY+ (i * 100d))
                );
                triangleTop.btnCall.setStroke(Color.BLUE);
                triangleTop.btnCall.setStrokeLineCap(StrokeLineCap.ROUND);
                triangleTop.btnCall.setFill(Color.BLUE);
                tritop[i] = triangleTop.btnCall;
                root.getChildren().add(triangleTop.btnCall);
            }
            
            if (i > 0) {
                LiftBtn triangleButtom = new LiftBtn(new Polygon());
                triangleButtom.btnCall.getPoints().setAll(
                    // X , Y (px)

                    triangleFirstX, (triangleFirstY + (i * 100d) - 10),
                    triangleSecondX,((triangleSecondY - 40) + (i * 100d) - 10),
                    triangleThirdX, (triangleThirdY+ (i * 100d) - 10)
                );
                triangleButtom.btnCall.setStroke(Color.BLUE);
                triangleButtom.btnCall.setStrokeLineCap(StrokeLineCap.ROUND);
                triangleButtom.btnCall.setFill(Color.BLUE);
                tritop[i] = triangleButtom.btnCall;
                root.getChildren().add(triangleButtom.btnCall);
            }
        }

        //Setting for GUI (scene and stage):
        scene = new Scene(root, 400, ((numberOfFloors * 100) + 100));
        
        primaryStage.setTitle("Lift");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Initilize the application
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
     
    /*
    Stage stage; // The Form where the simulator appears.
    Pane root; // The panel where the graphical components reside.
    Scene scene; // The area inside the Form. It must have a size that allows all the

        floors to show.
    int currentFloor; // Where the lift is right now.
    int direction; // +1 when the current move direction is up, -1 when down. int currentFloor; // Where the lift is right now.
    LiftBtn [ ] innerButtons; //Array of inner buttons.
    LiftBtn [ ] upButtons; // Array of the outer buttons showing "up". LiftBtn [ ] downButtons; // Array of the outer buttons showing "down". FloorSensor floorSensor; // On when someone is in the floor.
    Lift(Stage stg, int N) // Create a lift simulator with floors 0 to N. Create the buttons and the graphical components on the Pane root. When everything is created, call stage.show( ) and return.
    Run( ) Find the next floor and move the lift there. Reset various buttons. Move the lift (the small rectangle) on the screen.
*/
    
}
