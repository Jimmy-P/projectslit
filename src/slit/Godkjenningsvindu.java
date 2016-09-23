/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class Godkjenningsvindu extends Application {
    
    String kommentar;
    private int boxWidth = 100;
    private int boxHeight = 30;
    private int textWidth = 200;
    private int textHeight = 100;
    
    @Override
    public void start(Stage primaryStage) {
        TextArea kommentarTextArea = new TextArea ();
        kommentarTextArea.setWrapText(true);
        kommentarTextArea.setMinSize(textWidth, textHeight);
        kommentarTextArea.setMaxSize(textWidth, textHeight);
        kommentarTextArea.setPromptText("Kommentar");
                
        Button btnG = new Button();
        btnG.setText("Godkjenn");
        btnG.setMinSize(boxWidth, boxHeight);
        btnG.setMaxSize(boxWidth, boxHeight);
        btnG.setOnAction(e -> {
                
            //Kode her
            
                kommentar = kommentarTextArea.getText();
                System.out.println(kommentar);
        });
        
        Button btnIG = new Button();
        btnIG.setText("Ikke godkjent");
        btnIG.setMinSize(boxWidth, boxHeight);
        btnIG.setMaxSize(boxWidth, boxHeight);
        btnIG.setOnAction(e -> {
                System.out.println("Ikke godkjent"); //Trenger funksjon for å markere innleveringen som godkjent
                kommentar = kommentarTextArea.getText(); //Kommentaren må sendes med godkjenningen
                System.out.println(kommentar);

        });

        
        StackPane root = new StackPane();
        root.getChildren().add(btnG);
        root.getChildren().add(btnIG);
        root.getChildren().add(kommentarTextArea);
        root.setAlignment(kommentarTextArea, Pos.CENTER_LEFT);
        root.setAlignment(btnG, Pos.CENTER_RIGHT);
        root.setAlignment(btnIG, Pos.CENTER_RIGHT);
        StackPane.setMargin(btnG, new Insets(-30, 0, 0, 0));
        StackPane.setMargin(btnIG, new Insets(30, 0, 0, 0));
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Godkjenn modul");
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
