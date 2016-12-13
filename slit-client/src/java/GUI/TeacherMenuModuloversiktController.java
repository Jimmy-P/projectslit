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
public class TeacherMenuModuloversiktController implements Initializable {

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
    private Pane PaneBakgrunnRedigereModOver;
    @FXML
    private Label LabelOverskriftRedigereModOver;
    @FXML
    private Label LabelBeskrivelsetRedigereModOver;
    @FXML
    private Button ButtonLoggUtRedigereModOver;
    @FXML
    private Pane PaneModul1RedigereModOver;
    @FXML
    private Label Label1RedigerModOver;
    @FXML
    private Button ButtonRedigerMo1RedigerModOver;
    @FXML
    private Label LabelDato1RedigerModOver;
    @FXML
    private Pane PaneModul2RedigereModOver;
    @FXML
    private Label Label2RedigerModOver;
    @FXML
    private Button ButtonRedigerMo2RedigerModOver;
    @FXML
    private Label LabelDato2RedigerModOver;
    @FXML
    private Pane PaneModul3RedigereModOver;
    @FXML
    private Label Label3RedigerModOver;
    @FXML
    private Button ButtonRedigerMo3RedigerModOver;
    @FXML
    private Label LabelDato3RedigerModOver;
    @FXML
    private Pane PaneModul4RedigereModOver;
    @FXML
    private Label Label4RedigerModOver;
    @FXML
    private Button ButtonRedigerMo4RedigerModOver;
    @FXML
    private Label LabelDato4RedigerModOver;
    @FXML
    private Pane PaneModul5RedigereModOver;
    @FXML
    private Label Label5RedigerModOver;
    @FXML
    private Button ButtonRedigerMo5RedigerModOver;
    @FXML
    private Label LabelDato5RedigerModOver;
    @FXML
    private Pane PaneModul6RedigereModOver;
    @FXML
    private Label Label6RedigerModOver;
    @FXML
    private Button ButtonRedigerMo6RedigerModOver;
    @FXML
    private Label LabelDato6RedigerModOver;
    @FXML
    private Pane PaneModul7RedigereModOver;
    @FXML
    private Label Label7RedigerModOver;
    @FXML
    private Button ButtonRedigerMo7RedigerModOver;
    @FXML
    private Label LabelDato7RedigerModOver;
    @FXML
    private Pane PaneModul8RedigereModOver;
    @FXML
    private Label Label8RedigerModOver;
    @FXML
    private Button ButtonRedigerMo8RedigerModOver;
    @FXML
    private Label LabelDato8RedigerModOver;
    @FXML
    private Pane PaneModul9RedigereModOver;
    @FXML
    private Label Label9RedigerModOver;
    @FXML
    private Button ButtonRedigerMo9RedigerModOver;
    @FXML
    private Label LabelDato9RedigerModOver;
    @FXML
    private Pane PaneModul10RedigereModOver;
    @FXML
    private Label Label10RedigerModOver;
    @FXML
    private Button ButtonRedigerMo10RedigerModOver;
    @FXML
    private Label LabelDato10RedigerModOver;
    @FXML
    private Pane PaneModul11RedigereModOver;
    @FXML
    private Label Label11RedigerModOver;
    @FXML
    private Button ButtonRedigerMo11RedigerModOver;
    @FXML
    private Label LabelDato11RedigerModOver;
    @FXML
    private Pane PaneModulValgfriRedigereModOver;
    @FXML
    private Label LabelValgfriRedigerModOver;
    @FXML
    private Button ButtonRedigerMoValgfriRedigerModOver;
    @FXML
    private Label LabelDatoValgfriRedigerModOver;
    @FXML
    private Label LabelMailLærereRedigereModOver;
    @FXML
    private Button ButtonLeggtilHjelpemidlerRedigereModOver;

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
        SceneSelecter.getInstance().setScene(ViewNames.SOView);
        }

    @FXML
    private void logoutEvent(ActionEvent event) throws Exception {
      SceneSelecter.getInstance().setScene(ViewNames.loginView);

    }

    @FXML
    private void editModule1(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(1);
        SceneSelecter.getInstance().setScene(ViewNames.editModView);
    }

    @FXML
    private void editModule2(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(2);
        SceneSelecter.getInstance().setScene(ViewNames.editModView);
    }

    @FXML
    private void editModule3(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(3);
        SceneSelecter.getInstance().setScene(ViewNames.editModView);
    }

    @FXML
    private void editModule4(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(4);
        SceneSelecter.getInstance().setScene(ViewNames.editModView);
    }

    @FXML
    private void editModule5(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(5);
        SceneSelecter.getInstance().setScene(ViewNames.editModView);
    }
}
