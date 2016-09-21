/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class StatusStudent extends Application {
    
    Scene scene15;
    private String statusLastOpp = "Last opp";
    private String statusOK = "OK";
    private String statusLevert = "Levert";
    
    @Override
    public void start(Stage primaryStage) {
        Button btnMod1 = new Button(statusOK);
        btnMod1.setOnAction(e -> {
                //primaryStage.setScene(scene1);
                ModulViewGodkjent mvgk = new ModulViewGodkjent(1);
                mvgk.start(primaryStage);
        });
        Button btnMod2 = new Button(statusOK);
        btnMod2.setOnAction(e -> {
                ModulViewGodkjent mvgk2 = new ModulViewGodkjent(2);
                mvgk2.start(primaryStage);
        });
        Button btnMod3 = new Button(statusLevert);
        btnMod3.setOnAction(e -> {
                ModulViewIkkeGodkjent mvigk = new ModulViewIkkeGodkjent(3);
                mvigk.start(primaryStage);
        });
        Button btnMod4 = new Button(statusLastOpp);
        btnMod4.setOnAction(e -> {
               ModulViewHandin mvhi = new ModulViewHandin(4);
                mvhi.start(primaryStage);
        });
        Button btnMod5 = new Button(statusLastOpp);
        btnMod5.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(5);
                mvhi.start(primaryStage);
        });
        Button btnMod6 = new Button(statusLastOpp);
        btnMod6.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(6);
                mvhi.start(primaryStage);
        });
        Button btnMod7 = new Button(statusLastOpp);
        btnMod7.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(7);
                mvhi.start(primaryStage);
        });
        Button btnMod8 = new Button(statusLastOpp);
        btnMod8.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(8);
                mvhi.start(primaryStage);
        });
        Button btnMod9 = new Button(statusLastOpp);
        btnMod9.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(9);
                mvhi.start(primaryStage);
        });
        Button btnMod10 = new Button(statusLastOpp);
        btnMod10.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(10);
                mvhi.start(primaryStage);
        });
        Button btnMod11 = new Button(statusLastOpp);
        btnMod11.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(11);
                mvhi.start(primaryStage);
        });
        Button btnMod12 = new Button(statusLastOpp);
        btnMod12.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(12);
                mvhi.start(primaryStage);
        });
        Button btnMod13 = new Button(statusLastOpp);
        btnMod13.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(13);
                mvhi.start(primaryStage);
        });
        Button btnMod14 = new Button(statusLastOpp);
        btnMod14.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(14);
                mvhi.start(primaryStage);

        });

        
        HBox root = new HBox(5);
        root.getChildren().addAll(btnMod1, btnMod2, btnMod3, btnMod4, btnMod5, btnMod6, btnMod7, btnMod8, btnMod9, btnMod10, btnMod11, btnMod12, btnMod13, btnMod14);
        

        scene15 = new Scene(root, 800, 250);
        
        
        primaryStage.setTitle("Redigering av moduler");
        primaryStage.setScene(scene15);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
