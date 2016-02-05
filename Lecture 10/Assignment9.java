/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Asger
 */
public class Assignment9 extends Application {
     
    @Override
    public void start(Stage primaryStage) {
      
    //BorderPane (border)
    BorderPane border = new BorderPane();
    CirclePane circlePane = new CirclePane();
    
    //HBox
    HBox hbox = new HBox();
    hbox.setPadding(new Insets(10, 12, 15, 45));
    hbox.setSpacing(10);

    Button btn = new Button("Calculate"); 
    btn.setPrefWidth(170);
    //Add handle to btn (calculate)
    btn.setOnAction(new DistanceHandler(circlePane));
        
    hbox.getChildren().addAll(btn);

    
    //border:
    border.setBottom(hbox); //add hbox to border from method
    border.setCenter(addGrid()); //add grid to border from method
    border.setTop(circlePane);//add stack to border from method
   
    //Scene: (contains border)
    Scene scene = new Scene(border, 500, 800);
   
    //Stage:
    primaryStage.setTitle("Calculate the distance |AB|");
    primaryStage.setScene(scene); // See Scene
    primaryStage.show();
    }
    
    
    public GridPane addGrid() {
    TextField circleX1 = new TextField("Pos. X");
        circleX1.setPrefWidth(70);

    TextField circleY1 = new TextField("Pos. Y");
        circleY1.setPrefWidth(70);

    TextField circleX2 = new TextField("Pos. X");
        circleX2.setPrefWidth(70);

    TextField circleY2 = new TextField("Pos. Y");
        circleY2.setPrefWidth(70);          

    Label labelExpl = new Label("Input the coordinats x & y of the cirkel");
        //labelExpl.setText("Input the coordinats x & y of the cirkel");
        labelExpl.setTextFill(Color.web("#0076a3"));

    Label labelResult = new Label("The distance:");
        //labelResult.setText("The distance between the coordinats");
        labelResult.setTextFill(Color.web("#0076a3"));

    Label labelCircle1 = new Label("The center of the blue Circle:");

    Label labelCircle2 = new Label("The center of the red Circle:");          

    //GridPane (grid)
    GridPane pane = new GridPane();
    pane.setAlignment(Pos.CENTER);
    pane.setHgap(10);
    pane.setVgap(10);
    pane.setBorder(Border.EMPTY);
        
    //Add all elements to pane (into grid)
    pane.add(labelExpl,0,0);
    pane.add(labelCircle1,0,1);
    pane.add(circleX1,1,1);
    pane.add(circleY1,2,1);       
    pane.add(labelCircle2,0,2);
    pane.add(circleX2,1,2);
    pane.add(circleY2,2,2);
    pane.add(labelResult,1,4);
    
    return pane;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

class DistanceHandler implements EventHandler<ActionEvent>{
    
        private CirclePane circlePane;
        
        DistanceHandler(CirclePane circlePane) {
            this.circlePane = circlePane;
        }
        
        @Override
        public void handle(ActionEvent event) {
            circlePane.showDistance();
        }
}