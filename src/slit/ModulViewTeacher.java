/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import java.util.Optional;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author Kjetil
 */
public class ModulViewTeacher extends Application {
    //Strings er definert herunder
    
    ModulViewTeacher(int modulNr) // Constructor må sende parametre for å si noe om hvilken modul det er + må hente læringsmål basert på modulnr
    {
       
            LM1String = Storage.getLM(modulNr, 1);
            LM2String = Storage.getLM(modulNr, 2);
            LM3String = Storage.getLM(modulNr, 3);
            LM4String = Storage.getLM(modulNr, 4);


        
        modulNummer = modulNr;
    }
    
    private String headerString = "Læringsmål for modul ";
    private String LM1String;
    private String LM2String;
    private String LM3String;
    private String LM4String;
    private String lmEditTitle = "Rediger læringsmål";
    private String lmEditDescr = "Registrer ny beskrivelse av læringsmålet";
    private String editButton = "Rediger";
    private String saveButton = "Lagre";
    //Ints er definert herunder
    private int sceneSizeX = 450;
    private int sceneSizeY = 350;
    private int modulNummer;
    private int distanceFromLeft = 25;
    private int distanceFromTop = 25;
    private int adjLabelToCheckbox = -20; //Distance between LM label and checkbox
    //public int numberOfLM = 4;
    
    
    
    @Override
    public void start(Stage primaryStage) {
        Label header = new Label(headerString+modulNummer);
        header.setFont(Font.font("Arial", 20));
        
        
        Label lm1 = new Label(LM1String);
        Label lm2 = new Label(LM2String);
        Label lm3 = new Label(LM3String);
        Label lm4 = new Label(LM4String);
        
        CheckBox cb1 = new CheckBox();
        CheckBox cb2 = new CheckBox();
        CheckBox cb3 = new CheckBox();
        CheckBox cb4 = new CheckBox();
        
        Button buttonSave = new Button(saveButton);
        Button buttonEdit1 = new Button(editButton);
        Button buttonEdit2 = new Button(editButton);
        Button buttonEdit3 = new Button(editButton);
        Button buttonEdit4 = new Button(editButton);
        

        buttonSave.setOnAction(e -> {
                
                Storage.setLM(modulNummer, 1, LM1String);
                Storage.setLM(modulNummer, 2, LM2String);
                Storage.setLM(modulNummer, 3, LM3String);
                Storage.setLM(modulNummer, 4, LM4String);
            
                                
                ModulOverview MO = new ModulOverview();
                MO.start(primaryStage);
                
        });
        
        buttonEdit1.setOnAction(e -> {
                TextInputDialog prompt = new TextInputDialog(lm1.getText());
                prompt.setTitle(lmEditTitle);
                prompt.setHeaderText(lmEditDescr);
                Optional<String> result = prompt.showAndWait();
                LM1String = result.get();
                lm1.setText(LM1String);
        });
        buttonEdit2.setOnAction(e -> {
                TextInputDialog prompt = new TextInputDialog(lm2.getText());
                prompt.setTitle(lmEditTitle);
                prompt.setHeaderText(lmEditDescr);
                Optional<String> result = prompt.showAndWait();
                LM2String = result.get();
                lm2.setText(LM2String);
        });
        buttonEdit3.setOnAction(e -> {
                TextInputDialog prompt = new TextInputDialog(lm3.getText());
                prompt.setTitle(lmEditTitle);
                prompt.setHeaderText(lmEditDescr);
                Optional<String> result = prompt.showAndWait();
                LM3String = result.get();
                lm3.setText(LM3String);
                });
        buttonEdit4.setOnAction(e -> {
                TextInputDialog prompt = new TextInputDialog(lm4.getText());
                prompt.setTitle(lmEditTitle);
                prompt.setHeaderText(lmEditDescr);
                Optional<String> result = prompt.showAndWait();
                LM4String = result.get();
                lm4.setText(LM4String);
                });
        
        Pane rootPane = new Pane();
        rootPane.getChildren().addAll(buttonSave, buttonEdit1, buttonEdit2, buttonEdit3, buttonEdit4); //Legger til buttons
        rootPane.getChildren().addAll(header, lm1, lm2, lm3, lm4); //Legger til labels
        rootPane.getChildren().addAll(cb1, cb2, cb3, cb4);  //Legger til checkboxer
        buttonSave.setLayoutX(200); //Disse
        buttonSave.setLayoutY(300);
        buttonEdit1.setLayoutX(sceneSizeX - 70);
        buttonEdit1.setLayoutY(distanceFromTop * 2);
        buttonEdit2.setLayoutX(sceneSizeX - 70);
        buttonEdit2.setLayoutY(distanceFromTop * 3);
        buttonEdit3.setLayoutX(sceneSizeX - 70);
        buttonEdit3.setLayoutY(distanceFromTop * 4);
        buttonEdit4.setLayoutX(sceneSizeX - 70);
        buttonEdit4.setLayoutY(distanceFromTop * 5);
        header.setLayoutX(125);
        header.setLayoutY(20);
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
        cb2.setLayoutY(distanceFromTop * 3); 
        cb3.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        cb3.setLayoutY(distanceFromTop * 4);
        cb4.setLayoutX(distanceFromLeft + adjLabelToCheckbox);
        cb4.setLayoutY(distanceFromTop * 5); //Setter posisjon til forskjellige elementer
        
        Scene scene = new Scene(rootPane, sceneSizeX, sceneSizeY);
        
        primaryStage.setTitle("Rediger modul");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
