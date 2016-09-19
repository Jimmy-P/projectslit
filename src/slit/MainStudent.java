/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Jimmy
 */
public class MainStudent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnLeverModul = new Button("Lever modul");
        Button btnBlogg = new Button("Blogg");
        
        btnLeverModul.setOnAction(e -> {
            
            ModulViewHandin mvh = new ModulViewHandin(1);
            mvh.start(primaryStage);
            
        });
        btnBlogg.setOnAction(e -> {
            StudentBlogg sb = new StudentBlogg();
            sb.start(primaryStage);
        
        });
        
        
        
        VBox root = new VBox();
        root.getChildren().addAll(btnLeverModul, btnBlogg);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Student");
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
