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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Jimmy
 */
public class InnleveringStudentController implements Initializable {

    @FXML
    private Pane PaneBakgrunnInnlev;
    @FXML
    private TextField LabelOverskriftInnlev;
    @FXML
    private ListView<?> ListviewInnlev;
    @FXML
    private CheckBox CheckboxLærmål1Innlev;
    @FXML
    private CheckBox CheckboxLærmål2Innlev;
    @FXML
    private CheckBox CheckboxLærmål3Innlev;
    @FXML
    private CheckBox CheckboxLærmål4Innlev;
    @FXML
    private CheckBox CheckboxLærmål5Innlev;
    @FXML
    private CheckBox CheckboxLærmål6Innlev;
    @FXML
    private Button ButtonTilbakeInnlev;
    @FXML
    private Button ButtonLoggUTInnlev;
    @FXML
    private Button ButtonLastOppInnlev;
    @FXML
    private Button ButtonVideoInnlev;
    @FXML
    private Button ButtonLesestoffInnlev;
    @FXML
    private Button ButtonUsikkerInnlev;
    @FXML
    private Label LabelHjelpemidlerInnlev;
    @FXML
    private Button ButtonSendInnlev;
    
    
    private int modulnr;
    private int userid;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    
    
    public void sendEvent()
    {
        //Når student trykker på send
    }
    @FXML
    public void cancelEvent() throws Exception
    {
        SceneSelecter.getInstance().setScene(ViewNames.studentView);
    }
     @FXML
    private void logoutEvent(ActionEvent event) throws Exception {
    SceneSelecter.getInstance().setScene(ViewNames.loginView);
    }
}
