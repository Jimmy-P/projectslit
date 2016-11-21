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
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Jimmy
 */
public class StudentStatusStudentController implements Initializable {

    @FXML
    private Pane PaneBakgrunnSss;
    @FXML
    private Label LabelStudentStatusSss;
    @FXML
    private Label LabelHeiSss;
    @FXML
    private Button ButtonLukkSss;
    @FXML
    private Button ButtonLoggUtsss;
    @FXML
    private Button ButtonTilbakeSss;
    @FXML
    private Button ButtonBloggSss;
    @FXML
    private Pane PaneModul1Sss;
    @FXML
    private Button ButtonLeverModul1sss;
    @FXML
    private Label LabelDatoModul1sss;
    @FXML
    private Pane PaneModul2Sss;
    @FXML
    private Button ButtonLeverModul2sss;
    @FXML
    private Label LabelDatoModul2sss;
    @FXML
    private Pane PaneModul3Sss;
    @FXML
    private Button ButtonLeverModul3sss;
    @FXML
    private Label LabelDatoModul3sss;
    @FXML
    private Pane PaneModul4Sss;
    @FXML
    private Button ButtonLeverModul4sss;
    @FXML
    private Label LabelDatoModul4sss;
    @FXML
    private Pane PaneModul5Sss;
    @FXML
    private Button ButtonLeverModul5sss;
    @FXML
    private Label LabelDatoModul5sss;
    @FXML
    private Pane PaneModul6Sss;
    @FXML
    private Button ButtonLeverModul6sss;
    @FXML
    private Label LabelDatoModul6sss;
    @FXML
    private Pane PaneModul7Sss;
    @FXML
    private Button ButtonLeverModul7sss;
    @FXML
    private Label LabelDatoModul7sss;
    @FXML
    private Pane PaneModul8Sss;
    @FXML
    private Button ButtonLeverModul8sss;
    @FXML
    private Label LabelDatoModul8sss;
    @FXML
    private Pane PaneModul9Sss;
    @FXML
    private Button ButtonLeverModul9sss;
    @FXML
    private Label LabelDatoModul9sss;
    @FXML
    private Pane PaneModul10Sss;
    @FXML
    private Button ButtonLeverModul10sss;
    @FXML
    private Label LabelDatoModul10sss;
    @FXML
    private Pane PaneModul11Sss;
    @FXML
    private Button ButtonLeverModul11sss;
    @FXML
    private Label LabelDatoModul11sss;
    @FXML
    private Pane PaneModulPaneModulValgfriSss;
    @FXML
    private Button ButtonLeverModulValgfriSss;
    @FXML
    private Label LabelDatoModulValgfriSss;
    @FXML
    private Label LabelEmailadrSss;
    @FXML
    private Button ButtonHjelpemidlerSss;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOut(ActionEvent event) throws Exception {
        SceneSelecter.getInstance().setScene(ViewNames.loginView);
    }
    
}
