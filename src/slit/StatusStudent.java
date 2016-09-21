/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
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
        Label lblMod1 = new Label("Modul 1");
        Label dateMod1 = new Label("21.09.2016");
        
        Button btnMod2 = new Button(statusOK);
        btnMod2.setOnAction(e -> {
                ModulViewGodkjent mvgk2 = new ModulViewGodkjent(2);
                mvgk2.start(primaryStage);
        });
        Label lblMod2 = new Label("Modul 2");
        Label dateMod2 = new Label("21.09.2016");
        
        Button btnMod3 = new Button(statusLevert);
        btnMod3.setOnAction(e -> {
                ModulViewIkkeGodkjent mvigk = new ModulViewIkkeGodkjent(3);
                mvigk.start(primaryStage);
        });
        Label lblMod3 = new Label("Modul 3");
        Label dateMod3 = new Label("21.09.2016");
        
        Button btnMod4 = new Button(statusLastOpp);
        btnMod4.setOnAction(e -> {
               ModulViewHandin mvhi = new ModulViewHandin(4);
                mvhi.start(primaryStage);
        });
        Label lblMod4 = new Label("Modul 4");
        Label dateMod4 = new Label("21.09.2016");
        
        Button btnMod5 = new Button(statusLastOpp);
        btnMod5.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(5);
                mvhi.start(primaryStage);
        });
        Label lblMod5 = new Label("Modul 5");
        Label dateMod5 = new Label("21.09.2016");
        
        Button btnMod6 = new Button(statusLastOpp);
        btnMod6.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(6);
                mvhi.start(primaryStage);
        });
        Label lblMod6 = new Label("Modul 6");
        Label dateMod6 = new Label("21.09.2016");
        
        Button btnMod7 = new Button(statusLastOpp);
        btnMod7.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(7);
                mvhi.start(primaryStage);
        });
        Label lblMod7 = new Label("Modul 7");
        Label dateMod7 = new Label("21.09.2016");
        
        Button btnMod8 = new Button(statusLastOpp);
        btnMod8.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(8);
                mvhi.start(primaryStage);
        });
        Label lblMod8 = new Label("Modul 8");
        Label dateMod8 = new Label("21.09.2016");
        
        Button btnMod9 = new Button(statusLastOpp);
        btnMod9.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(9);
                mvhi.start(primaryStage);
        });
        Label lblMod9 = new Label("Modul 9");
        Label dateMod9 = new Label("21.09.2016");
        
        Button btnMod10 = new Button(statusLastOpp);
        btnMod10.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(10);
                mvhi.start(primaryStage);
        });
        Label lblMod10 = new Label("Modul 10");
        Label dateMod10 = new Label("21.09.2016");
        
        Button btnMod11 = new Button(statusLastOpp);
        btnMod11.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(11);
                mvhi.start(primaryStage);
        });
        Label lblMod11 = new Label("Modul 11");
        Label dateMod11 = new Label("21.09.2016");
        
        Button btnMod12 = new Button(statusLastOpp);
        btnMod12.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(12);
                mvhi.start(primaryStage);
        });
        Label lblMod12 = new Label("Modul 12");
        Label dateMod12 = new Label("21.09.2016");
        
        Button btnMod13 = new Button(statusLastOpp);
        btnMod13.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(13);
                mvhi.start(primaryStage);
        });
        Label lblMod13 = new Label("Modul 13");
        Label dateMod13 = new Label("21.09.2016");
        
        Button btnMod14 = new Button(statusLastOpp);
        btnMod14.setOnAction(e -> {
                ModulViewHandin mvhi = new ModulViewHandin(14);
                mvhi.start(primaryStage);
        });
        Label lblMod14 = new Label("Modul 14");
        Label dateMod14 = new Label("21.09.2016");

        /*
        HBox root = new HBox(5);
        root.getChildren().addAll(btnMod1, btnMod2, btnMod3, btnMod4, btnMod5, btnMod6, btnMod7, btnMod8, btnMod9, btnMod10, btnMod11, btnMod12, btnMod13, btnMod14);
        */
        
        VBox vb1 = new VBox();
        vb1.getStyleClass().add("statusOK");
        vb1.getChildren().addAll(lblMod1, btnMod1, dateMod1);
        VBox vb2 = new VBox();
        vb2.getStyleClass().add("statusOK");
        vb2.getChildren().addAll(lblMod2, btnMod2, dateMod2);
        VBox vb3 = new VBox();
        vb3.getStyleClass().add("statusLevert");
        vb3.getChildren().addAll(lblMod3, btnMod3, dateMod3);
        VBox vb4 = new VBox();
        vb4.getStyleClass().add("statusLastOpp");
        vb4.getChildren().addAll(lblMod4, btnMod4, dateMod4);
        VBox vb5 = new VBox();
        vb5.getStyleClass().add("statusLastOpp");
        vb5.getChildren().addAll(lblMod5, btnMod5, dateMod5);
        VBox vb6 = new VBox();
        vb6.getStyleClass().add("statusLastOpp");
        vb6.getChildren().addAll(lblMod6, btnMod6, dateMod6);
        VBox vb7 = new VBox();
        vb7.getStyleClass().add("statusLastOpp");
        vb7.getChildren().addAll(lblMod7, btnMod7, dateMod7);
        VBox vb8 = new VBox();
        vb8.getStyleClass().add("statusLastOpp");
        vb8.getChildren().addAll(lblMod8, btnMod8, dateMod8);
        VBox vb9 = new VBox();
        vb9.getStyleClass().add("statusLastOpp");
        vb9.getChildren().addAll(lblMod9, btnMod9, dateMod9);
        VBox vb10 = new VBox();
        vb10.getStyleClass().add("statusLastOpp");
        vb10.getChildren().addAll(lblMod10, btnMod10, dateMod10);
        VBox vb11 = new VBox();
        vb11.getStyleClass().add("statusLastOpp");
        vb11.getChildren().addAll(lblMod11, btnMod11, dateMod11);
        VBox vb12 = new VBox();
        vb12.getStyleClass().add("statusLastOpp");
        vb12.getChildren().addAll(lblMod12, btnMod12, dateMod12);
        VBox vb13 = new VBox();
        vb13.getStyleClass().add("statusLastOpp");
        vb13.getChildren().addAll(lblMod13, btnMod13, dateMod13);
        VBox vb14 = new VBox();
        vb14.getStyleClass().add("statusLastOpp");
        vb14.getChildren().addAll(lblMod14, btnMod14, dateMod14);
        
        FlowPane root = new FlowPane();
        root.getChildren().addAll(vb1, vb2, vb3, vb4, vb5, vb6, vb7, vb8, vb9,
                vb10, vb11, vb12, vb13, vb14);

        scene15 = new Scene(root, 800, 250);
        scene15.getStylesheets().add("slit/styling.css");
        
        
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
