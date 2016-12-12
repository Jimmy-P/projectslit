package GUI;

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
import javafx.scene.input.MouseEvent;
import javafx.scene.control.cell.*;

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
    private TableView<OversiktDataModel> oversiktTableView;

    @FXML
    private TableColumn<OversiktDataModel, String> fNameColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    fNameColumn.setCellValueFactory(new PropertyValueFactory<OversiktDataModel, String>("fNameColumn"));

    //oversiktTableView.getItems().setAll(getbFnavn());
}

//private List<OversiktDataModel> getbFnavn(){
// this method would fetch the necessary items from database.
//}
}
