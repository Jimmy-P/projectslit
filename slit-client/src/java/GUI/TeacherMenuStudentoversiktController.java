package GUI;

import DataModel.BrukerDataModel;
import Names.ViewNames;
import javafx.scene.control.*;
import DataModel.OversiktDataModel;
import Framework.BrukerManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.cell.*;
import Framework.TeacherOversiktManager;
import Framework.OversiktEnhet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class TeacherMenuStudentoversiktController implements Initializable {
    
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
        SceneSelecter.getInstance().setScene(ViewNames.SOView);
        }
    
    @FXML
    private TextArea testTextArea;
    
    @FXML
    private TableView<OversiktDataModel> oversiktTableView;
    
    private TableColumn<OversiktDataModel, String> fNameColumn;
    private TableColumn<OversiktDataModel, String> eNameColumn;
    private TableColumn<OversiktDataModel, String> mailColumn;
    private TableColumn<OversiktDataModel, String> mod1Column;
    private TableColumn<OversiktDataModel, String> mod2Column;
    private TableColumn<OversiktDataModel, String> mod3Column;
    private TableColumn<OversiktDataModel, String> mod4Column;
    private TableColumn<OversiktDataModel, String> mod5Column;
    private TableColumn<OversiktDataModel, String> mod6Column;
    private TableColumn<OversiktDataModel, String> mod7Column;
    private TableColumn<OversiktDataModel, String> mod8Column;
    private TableColumn<OversiktDataModel, String> mod9Column;
    private TableColumn<OversiktDataModel, String> mod10Column;
    
    @Override
    public void initialize (URL location, ResourceBundle resources) {
    //    testTextArea.textProperty().bind();
    }
    
    public void fillOversiktTableView(String text) {
        fNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("firstName"));
        eNameColumn.setCellValueFactory(
                new PropertyValueFactory<>("lastName"));
        mailColumn.setCellValueFactory(
                new PropertyValueFactory<>("email"));
        mod1Column.setCellValueFactory(
                new PropertyValueFactory<>("mod1"));
        mod2Column.setCellValueFactory(
                new PropertyValueFactory<>("mod2"));
        mod3Column.setCellValueFactory(
                new PropertyValueFactory<>("mod3"));
        mod4Column.setCellValueFactory(
                new PropertyValueFactory<>("mod4"));
        mod5Column.setCellValueFactory(
                new PropertyValueFactory<>("mod5"));
        mod6Column.setCellValueFactory(
                new PropertyValueFactory<>("mod6"));
        mod7Column.setCellValueFactory(
                new PropertyValueFactory<>("mod7"));
        mod8Column.setCellValueFactory(
                new PropertyValueFactory<>("mod8"));
        mod9Column.setCellValueFactory(
                new PropertyValueFactory<>("mod9"));
        mod10Column.setCellValueFactory(
                new PropertyValueFactory<>("mod10"));
 
        //oversiktTableView.setItems(OversiktEnhet.oversiktEnheter);
        oversiktTableView.getColumns().addAll(fNameColumn, eNameColumn, mailColumn,
                mod1Column, mod2Column, mod3Column, mod4Column, mod5Column,
                mod6Column, mod7Column, mod8Column, mod9Column, mod10Column);
    }


    //@Override
    //public void initialize(URL location, ResourceBundle resources) {
    //fNameColumn.setCellValueFactory(new PropertyValueFactory<OversiktDataModel, String>("fNameColumn"));

    //oversiktTableView.getItems().setAll(getbFnavn());
}

//private List<OversiktDataModel> getbFnavn(){
// this method would fetch the necessary items from database.
//}
    /*
    @FXML
    private void testEvent() throws Exception {
        BrukerManager bm = new BrukerManager();
        for (BrukerDataModel bdm : bm.getAllBrukere()) {
            System.out.println("");
            System.out.println(bdm.getbFnavn() + " " + bdm.getbEnavn());
            System.out.println(bdm.getbEmail());
        }
    }*/

