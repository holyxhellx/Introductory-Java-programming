/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiexercise;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Asger
 */
public class GUIExercise extends Application {
    
    //Circle c;
    Button btn;
    Pane root;
    Scene scene;
    
    Circle[] circles = new Circle[5];
    
    @Override
    public void start(Stage primaryStage) {
        final int x = 50;
        final int y = 50;
        final int radius = 15;
        
        root = new Pane();
        
        for (int i = 0; i < 5 ; i++) {
            Circle c = new Circle(radius);
            c.setFill(i % 2 == 0 ? Color.RED : Color.BLUE);           
            c.setCenterX(i * x + 50);
            c.setCenterY(y);
            c.setStroke(Color.BLACK);
            c.setOnMouseClicked((MouseEvent event) -> {
                
                int no = 0;
                int cX = (int) c.getCenterX();
                switch (cX) {
                    case 50:
                        no = 1;
                        break;
                    case 100:
                        no = 2;
                        break;
                    case 150:
                        no = 3;
                        break;
                    case 200:
                        no = 4;
                        break;
                    case 250:
                        no = 5;
                        break;
                }
                
                System.out.println("I am no. "+no);
                //System.out.println(c.getCenterX() + "," + c.getCenterY()); //Display the coordinats on each circle
            });
            circles[i] = c;
            root.getChildren().add(c);
            
        }
        
        btn = new Button();
        btn.setText("Move 10 down");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                circles[0].setCenterY(circles[0].getCenterY() + 10);
            }
        });
        root.getChildren().add(btn);
        
        scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("GUI exercise");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        launch(args);
    }
}
