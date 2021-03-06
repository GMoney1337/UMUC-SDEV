/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdev425hw2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author GMoney
 */
public class GUITest extends Application {
    Button btnscene1, btnscene2;
    Label lblscene1, lblscene2;
    FlowPane pane1, pane2;
    Scene scene1, scene2;
    Stage thestage;
    
    @Override
    public void start(Stage primaryStage) {
      
        thestage=primaryStage;
        //can now use the stage in other methods
       
        //make things to put on panes
        btnscene1=new Button("Click to go to Other Scene");
        btnscene2=new Button("Click to go back to First Scene");
        btnscene1.setOnAction(e-> ButtonClicked(e));
        btnscene2.setOnAction(e-> ButtonClicked(e));
        lblscene1=new Label("Scene 1");
        lblscene2=new Label("Scene 2");

                //make 2 Panes
         pane1=new FlowPane();
         pane2=new FlowPane();
         pane1.setVgap(10);
         pane2.setVgap(10);
         //set background color of each Pane
         pane1.setStyle("-fx-background-color: tan;-fx-padding: 10px;");
         pane2.setStyle("-fx-background-color: red;-fx-padding: 10px;");

         //add everything to panes
         pane1.getChildren().addAll(lblscene1, btnscene1);
         pane2.getChildren().addAll(lblscene2, btnscene2);
         
                 //make 2 scenes from 2 panes
        scene1 = new Scene(pane1, 200, 100);
        scene2 = new Scene(pane2, 200, 100);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    
     public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource()==btnscene1){
            thestage.setScene(scene2);
        }else{
            thestage.setScene(scene1);}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
