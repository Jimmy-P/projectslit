/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class DatabaseMenu extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnImport = new Button("Importer fra database");
        
        btnImport.setOnAction(e -> {
            
           System.out.println("Database importert");
            
        });
         Button btnExport = new Button("Eksporter database");
        
        btnExport.setOnAction(e -> {
            
           System.out.println("Database eksportert");
            
        });
        
        HBox root = new HBox(20);
        root.getChildren().addAll(btnImport, btnExport);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Databaseadmnistrasjon");
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
