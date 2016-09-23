/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class AddUserForm extends Application {
    
    private String name;
    
    @Override
    public void start(Stage primaryStage) {
        Button btnCreateUser = new Button("Lag bruker");
        Button btnCancel = new Button("Avbryt");
        
        TextField firstNameField = new TextField();
        TextField lastNameField = new TextField();
        
        Label header = new Label("Lag ny bruker");
        Label firstNameLabel = new Label("Fornavn");
        Label lastNameLabel = new Label("Etternavn");
        
        
        btnCancel.setOnAction( e-> {
            
           primaryStage.close();
            
        });
        
        btnCreateUser.setOnAction(e ->  {
                name = firstNameField.getText()+" "+lastNameField.getText();
                System.out.println("Created user "+name);
        });
        
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 250, 250);
        
        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(10);
        grid.setPadding(new Insets(5,5,5,5));
        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(100);
        column2.setHgrow(Priority.ALWAYS);
        
        grid.getColumnConstraints().addAll(column1, column2);
        
        grid.setHalignment(header, HPos.CENTER);
        grid.add(header, 0, 0);
        
        grid.setHalignment(firstNameLabel, HPos.LEFT);
        grid.add(firstNameLabel, 0, 3);
                
        grid.setHalignment(lastNameLabel, HPos.LEFT);
        grid.add(lastNameLabel, 0, 5);
        
        grid.setHalignment(firstNameField, HPos.RIGHT);
        grid.add(firstNameField, 1, 3);
        
        grid.setHalignment(lastNameField, HPos.RIGHT);
        grid.add(lastNameField, 1, 5);
        
        grid.setHalignment(btnCancel, HPos.LEFT);
        grid.add(btnCancel, 0, 8);
        
        grid.setHalignment(btnCreateUser, HPos.RIGHT);
        grid.add(btnCreateUser, 1, 8);
        
        
        
        root.setCenter(grid);
        
        primaryStage.setTitle("Legg til ny bruker");
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
