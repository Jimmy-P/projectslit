package slit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author Jimmy
 */
public class StatusViewTeacher extends Application {
    
        
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        
        Scene scene = new Scene(new Group());
        primaryStage.setTitle("Table");
        primaryStage.setWidth(300);
        primaryStage.setHeight(500);
        
 
        Label label = new Label("Tabell");
        label.setFont(new Font("Arial", 20));
 
        TableView<Student> table = new TableView<>();
        table.getItems().addAll(studentList());
        TableColumn nameCol = new TableColumn("First Name");
        nameCol.setCellValueFactory(new PropertyValueFactory("name"));
        TableColumn modul1Col = new TableColumn("Module 1");
        modul1Col.setCellValueFactory(new PropertyValueFactory("doneModul1"));
        TableColumn kommentarCol = new TableColumn("Kommentar");
        kommentarCol.setCellValueFactory(new PropertyValueFactory("kommentarModul1"));
        /*nameCol.setCellValueFactory(new Callback, ObservableValue>()
                {
                    @Override
                    public ObservableValue call(CellDataFeatures c){
                    return new SimpleStringProperty(c.getValue().getName());
                }
                }
                
                );*/
        
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
  

  Student p1 = new Student("Ole", "hoho", "modul 1 Ole");
  Student p2 = new Student("Dole", "hehe", "modul 1 Dole");
  Student p3 = new Student("Doffen", "haha", "modul 1 Doffen");
  Student p4 = new Student("Donald", "hihi", "modul 1 Donald");

  return Arrays.asList(p1, p2, p3, p4);
 }
}
