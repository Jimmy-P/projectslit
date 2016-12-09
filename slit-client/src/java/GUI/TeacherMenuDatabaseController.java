/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Names.ViewNames;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Jimmy
 */
public class TeacherMenuDatabaseController implements Initializable {

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
    private Label LabelDatabaseDB;
    @FXML
    private Button ButtonImportDB;
    @FXML
    private Button ButtonEksportDB;
    @FXML
    private Button ButtonLoggUtDB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
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
    @FXML
    private void buttonLogOutEvent(ActionEvent event) throws Exception {
    SceneSelecter.getInstance().setScene(ViewNames.loginView);
    }
    
}
