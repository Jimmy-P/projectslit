package slit;

import java.util.function.Function;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam
 */
public class Rettingskø extends Application {
    
    Stage subStage = new Stage();
    
    @Override
    public void start(Stage primaryStage){
       /* 
        * ModulB = Modulbesvarelse. Her vil vi presentere informasjon fra
        * modulbesvarelsesobjekt som genereres når student leverer modul 
        */
        TableView<ModulB> table = new TableView<>();
        table.getColumns().add(column("Navn", ModulB::studentNameProperty, 150));
        table.getColumns().add(column("E-mail", ModulB::studentEmailProperty, 150));
        table.getColumns().add(column("Modul", ModulB::studentModulProperty, 70));
        table.getColumns().add(column("Innleveringsdato", ModulB::studentDateProperty, 100));
        
        TableColumn<ModulB, ModulB> gradeColumn = column("", ReadOnlyObjectWrapper<ModulB>::new, 100);
        
        table.getColumns().add(gradeColumn);
        
        gradeColumn.setCellFactory(col -> {
            Button gradeButton = new Button("Rett Modul");
            TableCell<ModulB, ModulB> cell = new TableCell <ModulB, ModulB>() {
                @Override
                public void updateItem(ModulB modulb, boolean empty) {
                    super.updateItem(modulb, empty);
                    if (empty){
                        setGraphic(null);
                    } else {
                        setGraphic(gradeButton);
                    }
                }
            };
            
            gradeButton.setOnAction(e -> grade());
            
            return cell;
        });
        
        table.getItems().addAll(
                new ModulB("Adam Ajmi", "aa@tfwno.gf", "Modul 7", "18-09.16"),
                new ModulB("Adam Ajmi", "aa@tfwno.gf", "Modul 7", "18-09.16"),
                new ModulB("Adam Ajmi", "aa@tfwno.gf", "Modul 7", "18-09.16")
        );
        
        primaryStage.setScene(new Scene(new BorderPane(table)));
        primaryStage.show();
    }
    
    
    private void grade() {
        
        //TRENGER MODALITY
        Godkjenningsvindu gkv = new Godkjenningsvindu();
        gkv.start(subStage);
        
    }
    private <S,T> TableColumn<S,T> column(String title, Function<S, ObservableValue<T>> property, double width) {
        TableColumn<S,T> col = new TableColumn<>(title);
        col.setCellValueFactory(cellData -> property.apply(cellData.getValue()));
        col.setPrefWidth(width);
        return col ;
    }
    
            
            
    public static class ModulB {
        private final StringProperty sName = new SimpleStringProperty();
        private final StringProperty sEmail = new SimpleStringProperty();
        private final StringProperty sModul = new SimpleStringProperty();
        private final StringProperty sDate = new SimpleStringProperty();
        
        
        public ModulB (String sName, String sEmail, 
                String sModul, String sDate){
                setName(sName);
                setEmail(sEmail);
                setModul(sModul);
                setDate(sDate);
         }
        
        public final StringProperty studentNameProperty(){
            return this.sName;
        }
         
        public final java.lang.String getStudentName(){
            return this.studentNameProperty().get();     
        }        
        public final void setName(final java.lang.String sName) {
            this.studentNameProperty().set(sName);
        }
        
        public final StringProperty studentEmailProperty(){
            return this.sEmail;
        }
         
        public final java.lang.String getStudentEmail(){
            return this.studentEmailProperty().get();     
        }        
        public final void setEmail(final java.lang.String sEmail) {
            this.studentEmailProperty().set(sEmail);
        }
        
        public final StringProperty studentModulProperty(){
            return this.sModul;
        }
         
        public final java.lang.String getStudentModul(){
            return this.studentModulProperty().get();     
        }        
        public final void setModul(final java.lang.String sModul) {
            this.studentModulProperty().set(sModul);
        }
        
        public final StringProperty studentDateProperty(){
            return this.sDate;
        }
         
        public final java.lang.String getStudentDate(){
            return this.studentDateProperty().get();     
        }        
        public final void setDate(final java.lang.String sDate) {
            this.studentDateProperty().set(sDate);
        }
        
        
     }
    
    public static void main(String[] args){
        launch(args);
    }
}