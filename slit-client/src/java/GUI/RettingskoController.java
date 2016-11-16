/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slitclient;

import java.sql.Connection;
import DataModel.BrukerDataModel;
import DataModel.ModulBesvarelseDataModel;
import Framework.BrukerManager;
import Framework.ModulBesvarelseManager;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author bevo
 */
public class RettingskoController implements Initializable {
    
    @FXML
    private TableView<ModulBesvarelseDataModel> MainTableView;
    @FXML
    private TableColumn<ModulBesvarelseDataModel, Date> TabellDato;

    
    
    
    //@FXML
    //private TableView<Date> MainTableView;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */ 
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
        
    } 
    /*
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TabellDato.setCellValueFactory(new PropertyValueFactory<ModulBesvarelseDataModel, Date>("Dato"));
        
        ModulBesvarelseManager manager = new ModulBesvarelseManager();
        
        ObservableList <ModulBesvarelseDataModel> items = FXCollections.observableArrayList();

        for(ModulBesvarelseDataModel modulbesvarelse : manager.getAllModulBesvarelse())
            {
                //items.add(modulbesvarelse.getBid());
                items.add(modulbesvarelse);
                //items.add(modulbesvarelse.getMbTidspunkt());            
            }
        MainTableView.getItems().setAll(manager.getAllModulBesvarelse());
    }
   */
    
}
