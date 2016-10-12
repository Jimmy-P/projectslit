package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Kjetil
 */
public class StatusViewTeacher extends Application {
    
        
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        
        Scene scene = new Scene(new Group());
        primaryStage.setTitle("Table");
        
        
 
        Label label = new Label("Tabell");
        label.setFont(new Font("Arial", 20));
 
        TableView<Student> table = new TableView<>();
        table.getItems().addAll(studentList());
        TableColumn nameCol = new TableColumn("First Name");
        nameCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn modul1Col = new TableColumn("Modul 1");
        modul1Col.setCellValueFactory(new PropertyValueFactory("doneModul1"));
        TableColumn kommentarCol = new TableColumn("Kommentar");
        kommentarCol.setCellValueFactory(new PropertyValueFactory("kommentarModul1"));

        
        table.getColumns().addAll(nameCol, modul1Col, kommentarCol);
 
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     private List studentList() {
         
  Student s1 = new Student("Ole", "Bra", "56");
  Student s2 = new Student("Dole", "Dårlig", "42");
  Student s3 = new Student("Doffen", "Supert", "96");
  Student s4 = new Student("Donald", "Elendig", "2");

  return Arrays.asList(s1, s2, s3, s4);
 }
}
