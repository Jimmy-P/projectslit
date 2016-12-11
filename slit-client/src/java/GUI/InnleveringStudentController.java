/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataModel.BrukerDataModel;
import DataModel.ModulBesvarelseDataModel;
import DataModel.ModulDataModel;
import Framework.ModulBesvarelseManager;
import Framework.ModulManager;
import Names.ViewNames;
import java.net.URL;
import java.util.Date;
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
 * @author Adam
 * @author Kjetil
 */
public class InnleveringStudentController implements Initializable {

    @FXML
    private Pane PaneBakgrunnInnlev;
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
    private Label LabelHjelpemidlerInnlev;
    @FXML
    private Button ButtonSendInnlev;
    
    ModulManager mm = new ModulManager();
    
    private int modulnr = LoggedUserInfo.getModulnr();
    private int userid;
    private int brukerid = LoginController.getLoggedID();
    
    @FXML
    private Label labelModulDescr;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CheckboxLærmål1Innlev.setText("LM 1");
        CheckboxLærmål2Innlev.setText("LM 2");
        CheckboxLærmål3Innlev.setText("LM 3");
        CheckboxLærmål4Innlev.setText("LM 4");
        CheckboxLærmål5Innlev.setText("LM 5");
        CheckboxLærmål6Innlev.setText("LM 6");
        
        labelModulDescr.setText(mm.getModulName(modulnr)+ " - "+ mm.getModulDescr(modulnr));
        
    }

    
    
    
    @FXML
    public void sendEvent() throws Exception
    {
        //Når student trykker på send
        ModulBesvarelseManager mbm = new ModulBesvarelseManager();
        
        ModulBesvarelseDataModel mbdm = new ModulBesvarelseDataModel();
        BrukerDataModel bdm = new BrukerDataModel();
        ModulDataModel mdm = new ModulDataModel();
        
        Date mbDeliveryDate = new Date();
        
        //MbID kan være hvilken som helst verdi da serveren autogenerer
        //primærnøkkel når det legges til ny rad (auto-increment)
        mbdm.setMbId(0);
        mbdm.setMbTidspunkt(mbDeliveryDate);
        bdm.setbId(LoginController.getLoggedID());
        mdm.setmID(LoggedUserInfo.getModulnr());
       
        mbm.newModulBesvarelse(mbdm, bdm, mdm);
        
        SceneSelecter.getInstance().setScene(ViewNames.studentView); //Denne linjen sender bruker tilbake til moduloversikt. 
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
