package GUI;

import Names.ViewNames;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class TeacherMenuStudentoversiktController {
    
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
    
    /*@FXML
    private TableView<MyDataModel> myTableView;

    @FXML
    private TableColumn<MyDataModel, String> idColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    idColumn.setCellValueFactory(new PropertyValueFactory<MyDataModel, String>"idColumn"));

    myTableView.getItems().setAll(getItemsToAdd());
}

private List<MyDataModel> getItemsToAdd(){
// this method would fetch the necessary items from database.
}*/
}
