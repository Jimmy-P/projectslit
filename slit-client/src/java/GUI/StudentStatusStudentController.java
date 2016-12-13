/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Framework.BrukerManager;
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
 * Denne klassen gir studenten oversikt over sine moduler.
 * 
 * @author Kjetil
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
     * Lagrer informajon om innlogget bruker i variabler
     */
    
    String fnavn = LoginController.getLoggedFName();
    String enavn = LoginController.getLoggedEName();
    int userid = LoginController.getLoggedID();
    
    
    //"Personlig" velkomsthilsen
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        LabelHeiSss.setText("Hei "+fnavn+"!");
        
    }    
    //Knapp som logger ut
    @FXML
    private void logOut(ActionEvent event) throws Exception {
        SceneSelecter.getInstance().setScene(ViewNames.loginView);
        
    }
    //Knapp for å levere modul 1
    //Bruker int til å hente informasjon i DB og linke til riktig modul.
    @FXML
    private void leverModul1(ActionEvent event) throws Exception {
        LoggedUserInfo.setModulnr(1);
        SceneSelecter.getInstance().setScene(ViewNames.innleveringView);
    }
    //Knapp for å levere modul 2
    @FXML
    private void leverModul2(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(2);
        SceneSelecter.getInstance().setScene(ViewNames.innleveringView);
    }
    //Knapp for å levere modul 3
    @FXML
    private void leverModul3(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(3);
        SceneSelecter.getInstance().setScene(ViewNames.innleveringView);
    }
    //Knapp for å levere modul 4
    @FXML
    private void leverModul4(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(4);
        SceneSelecter.getInstance().setScene(ViewNames.innleveringView);
    }
    //Knapp for å levere modul 5
    @FXML
    private void leverModul5(ActionEvent event) throws Exception{
        LoggedUserInfo.setModulnr(5);
        SceneSelecter.getInstance().setScene(ViewNames.innleveringView);
    }
    
}
