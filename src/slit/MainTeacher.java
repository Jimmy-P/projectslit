/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import java.util.ArrayList;
import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class MainTeacher extends Application {
    
    Stage subStage = new Stage();

    
   
    
    @Override
    public void start(Stage primaryStage) {
        Button btnStatus = new Button("Status");
        Button btnRK = new Button("Rettingskø");
        Button btnDB = new Button("Database");
        Button btnAddUser = new Button("Legg til bruker");
        Button btnModulEdit = new Button("Rediger moduler");
        
        
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
        btnDB.setOnAction(e ->
        {
            //KODE HER
            subStageMethod("Database");
        });
        btnAddUser.setOnAction(e ->
        {
            //KODE HER
            subStageMethod("Disregard");
        });
        btnModulEdit.setOnAction(e ->
        {
            //KODE HER
            subStageMethod("ModulEdit");
        });
        
        
        HBox root = new HBox();
        root.getChildren().addAll(btnStatus, btnRK, btnDB, btnAddUser, btnModulEdit);
        
        Scene scene = new Scene(root, 500, 100);
        
        primaryStage.setTitle("Hovedmeny");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
        public void subStageMethod(String subMenu)
        {
           
           if(subMenu == "ModulEdit")
           {
               ModulOverview MO = new ModulOverview();
               MO.start(subStage);
               //subStage.show();
           }
           else if(subMenu =="Database") 
           {
               //TRENGS NOE FUNKSJONALITET HER
           }
           else if(subMenu =="RK")
           {
               Rettingskø rk1 = new Rettingskø();
               rk1.start(subStage);
           }
           else if(subMenu =="StatusTable")
           {
               StatusViewTeacher svt = new StatusViewTeacher();
               svt.start(subStage);
           }
           else
           {            
            subStage.show();
           
            StackPane bb = new StackPane();
            Scene subScene = new Scene(bb, 200, 100);
            subStage.setScene(subScene);
           }
      
        };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    // Denne metoden returnerer en string verdi fra en av de 14 læringsmål-arraylistene.
    
    
}
