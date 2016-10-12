/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 * View for når man vil levere inn en modul som ikke har blitt godkjent
 * @author Kjetil
 */
public class ModulViewIkkeGodkjent extends Application {
    
    
           ModulViewIkkeGodkjent (int modulNr) // Constructor må sende parametre for å si noe om hvilken modul det er + må hente læringsmål basert på modulnr
    {
       
            LM1String = Storage.getLM(modulNr, 1);
            LM2String = Storage.getLM(modulNr, 2);
            LM3String = Storage.getLM(modulNr, 3);
            LM4String = Storage.getLM(modulNr, 4);


        
        modulNummer = modulNr;
    };
    
    private int modulNummer;
    private String headerString = "Læringsmål for modul ";
    private String LM1String;
    private String LM2String;
    private String LM3String;
    private String LM4String;
    private int distanceFromLeft = 25;
    private int distanceFromTop = 25;
    private int adjLabelToCheckbox = -20; //Distance between LM label and checkbox
    public int numberOfLM = 4;
    private String modulComment = "Innleveringen har ikke blitt godkjent";
    
    @Override
    public void start(Stage primaryStage) {
        Label header = new Label();
        header.setText(headerString+modulNummer);
        header.setFont(Font.font("Arial", 20));
        
        Label lm1 = new Label(LM1String);
        Label lm2 = new Label(LM2String);
        Label lm3 = new Label(LM3String);
        Label lm4 = new Label(LM4String);
        
        Label kommentar = new Label(modulComment);
        Label kommentarLabel = new Label("Kommentar:");
        kommentarLabel.setFont(Font.font("Arial", 16));
        
        
        CheckBox cb1 = new CheckBox();
        CheckBox cb2 = new CheckBox();
        CheckBox cb3 = new CheckBox();
        CheckBox cb4 = new CheckBox();
        
        Button buttonLever = new Button();
        Button buttonCancel = new Button();
        Button buttonUpload = new Button();
        
        buttonLever.setText("Lever modul");
        buttonLever.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Lever modul");
            }
        });
        
        buttonCancel.setText("Tilbake");
        buttonCancel.setOnAction(e -> {
            
            StatusStudent ss = new StatusStudent();
                ss.start(primaryStage);
        });
          buttonUpload.setText("Last opp");
        buttonUpload.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Last opp");
            }
        });
        
        Pane rootPane = new Pane();
        rootPane.getChildren().add(buttonLever); //Disse
        rootPane.getChildren().add(buttonCancel); //
        rootPane.getChildren().add(buttonUpload);
        rootPane.getChildren().add(header);
        rootPane.getChildren().add(kommentar);
        rootPane.getChildren().add(kommentarLabel);
        rootPane.getChildren().add(lm1);
        rootPane.getChildren().add(lm2);
        rootPane.getChildren().add(lm3);
        rootPane.getChildren().add(lm4);
        rootPane.getChildren().add(cb1); 
        rootPane.getChildren().add(cb2);
        rootPane.getChildren().add(cb3); // 
        rootPane.getChildren().add(cb4); //Legger elementer til Pane
        buttonLever.setLayoutX(300); //Disse
        buttonLever.setLayoutY(300);
        buttonCancel.setLayoutX(200);
        buttonCancel.setLayoutY(300);
        buttonUpload.setLayoutX(100);
        buttonUpload.setLayoutY(300);
        header.setLayoutX(125);
        header.setLayoutY(20);
        kommentar.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        kommentar.setLayoutY(250);
        kommentarLabel.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        kommentarLabel.setLayoutY(230);
        lm1.setLayoutX(distanceFromLeft);
        lm1.setLayoutY(distanceFromTop * 2);
        lm2.setLayoutX(distanceFromLeft);
        lm2.setLayoutY(distanceFromTop * 3);
        lm3.setLayoutX(distanceFromLeft);
        lm3.setLayoutY(distanceFromTop * 4);
        lm4.setLayoutX(distanceFromLeft);
        lm4.setLayoutY(distanceFromTop * 5);
        
        cb1.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        cb1.setLayoutY(distanceFromTop * 2);
        cb2.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        cb2.setLayoutY(distanceFromTop * 3); //Setter posisjon til forskjellige elementer
        cb3.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        cb3.setLayoutY(distanceFromTop * 4);
        cb4.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        cb4.setLayoutY(distanceFromTop * 5);

        
        Scene scene = new Scene(rootPane, 450, 350);
        
        primaryStage.setTitle("Lever modul");
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
