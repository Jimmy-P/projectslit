/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Jimmy
 */
public class MainTA extends Application {
    Stage subStage = new Stage();
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btnStatus = new Button("Status");
        Button btnRK = new Button("Rettingskø");
        
        btnStatus.setOnAction(e ->
        {
            //KODE HER
            subStageMethod("StatusTable");
        });
        btnRK.setOnAction(e ->
        {
            //KODE HER
            subStageMethod("RK");
        });
            
            
          
        
        
        
        HBox root = new HBox();
        root.getChildren().addAll(btnStatus, btnRK);
        
        Scene scene = new Scene(root, 500, 100);
        
        primaryStage.setTitle("Hovedmeny");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
      public void subStageMethod(String subMenu)
        {
            
           if(subMenu == "StatusTable")
           {
               
               //VISE OVERSIKT STUDENTSTATUS
                              
           }
           else if(subMenu =="RK")
           {
               Rettingskø rk = new Rettingskø();
               rk.start(subStage);
           }
           
      
        };
    
}
