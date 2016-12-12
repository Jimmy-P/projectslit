/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Names.ViewNames;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import GUI.Student;
import Framework.ModulBesvarelseManager;
import DataModel.ModulBesvarelseDataModel;
import javafx.scene.input.MouseEvent;


/**
 * FXML Controller class
 * Dette er controller klassen for rettingskø. GUI til rettingskø er 
 * laget i scenebuilder. 
 *
 * @author bevo
 */
public class RettingskoController implements Initializable {
    
    final ObservableList<Student> data = FXCollections.observableArrayList(
            new Student("Per Olsen", "Modul 1", "29.09.16"), 
            new Student("Ole Olsen", "Modul 2", "30.09.16"),
            new Student("Per Ulv", "Modul 2", "02.10.16"),
            new Student("Nils Hansen", "Modul 2", "03.10.16"),
            new Student("Torbjørn Hovstad", "Modul 2", "04.10.16"),
            new Student("Hans Nilsen", "Modul 3", "05.10.16")
    );
    
    @FXML
    private Button buttonRK;
    @FXML
    private Button buttonSO;
    @FXML
    private Button buttonLTB;
    @FXML
    private Button buttonMO;
    @FXML
    private Button buttonDB;
    @FXML
    private TableView<Student> MainTableView;
    @FXML
    private TableColumn<Student, String> TabellBruker;
    @FXML
    private TableColumn<Student, String> TabellModul;
    @FXML
    private TableColumn<Student, String> TabellDato;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {  
    
    TabellBruker.setCellValueFactory(new PropertyValueFactory<Student, String>("Bruker"));
    TabellModul.setCellValueFactory(new PropertyValueFactory<Student, String>("Modul"));
    TabellDato.setCellValueFactory(new PropertyValueFactory<Student, String>("Dato"));
    
    MainTableView.setItems(data);
    
    
    } 
    
    /*
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BrukerManager manager = new BrukerManager();
              
        ObservableList <String> items = FXCollections.observableArrayList(); 
        
        for(BrukerDataModel bruker : manager.getAllBrukere())
        {
            items.add(bruker.getbFnavn()); 
        }
        
        this.MainTableView.setItems(items);
    } 
    /*
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ModulBesvarelseManager manager = new ModulBesvarelseManager();
              
        ObservableList <Date> items = FXCollections.observableArrayList(); 
        
        for(ModulBesvarelseDataModel modulbesvarelse : manager.getAllModulBesvarelse())
        {
            items.add(modulbesvarelse.getMbTidspunkt()); 
        }
        
        this.MainListView.setItems(items);
    } 
    */
    
    /*
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ModulBesvarelseManager manager = new ModulBesvarelseManager();
              
        ObservableList <ModulBesvarelseDataModel> items = FXCollections.observableArrayList(); 
        //ObservableList <Date> items2 = FXCollections.observableArrayList();
        
        
        for(ModulBesvarelseDataModel modulbesvarelse : manager.getAllModulBesvarelse())
        {
            //items.add(modulbesvarelse.getBid());
            items.add(modulbesvarelse);
            //items.add(modulbesvarelse.getMbTidspunkt());            
        }
        
        MainTableView.setItems(items);
        //MainTableView.getColumns().addAll(TabellDato);
        
    } */
    /*
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TabellBruker.setCellValueFactory(new PropertyValueFactory<ModulBesvarelseDataModel, String>("Bruker"));
        TabellModul.setCellValueFactory(new PropertyValueFactory<ModulBesvarelseDataModel, String>("Modul"));
        TabellDato.setCellValueFactory(new PropertyValueFactory<ModulBesvarelseDataModel, Date>("Dato"));
        
        
        MainTableView.getItems().setAll();
        
    }
    */
    
       
       @FXML
    private void buttonRKEvent(ActionEvent event) throws Exception {
        SceneSelecter.getInstance().setScene(ViewNames.AQView);
        }
    @FXML
    private void buttonMOEvent(ActionEvent event) throws Exception {
        SceneSelecter.getInstance().setScene(ViewNames.modulView);
        }
    @FXML
    private void buttonDBEvent(ActionEvent event) throws Exception {
        SceneSelecter.getInstance().setScene(ViewNames.DBView);
        }
    @FXML
    private void buttonLTBEvent(ActionEvent event) throws Exception {
        SceneSelecter.getInstance().setScene(ViewNames.AUFView);
        }
    @FXML
    private void buttonSOEvent(ActionEvent event) throws Exception {
        SceneSelecter.getInstance().setScene(ViewNames.modulView);  //DENNE MÅ RETTES NÅR VI HAR EN FXML FOR STUDENTOVERSIKT
        }
    private void buttonLogOutEvent(ActionEvent event) throws Exception {
    SceneSelecter.getInstance().setScene(ViewNames.loginView);
    }
  
    
    
}
