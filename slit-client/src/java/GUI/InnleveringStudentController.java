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
    private CheckBox CheckboxL�rm�l1Innlev;
    @FXML
    private CheckBox CheckboxL�rm�l2Innlev;
    @FXML
    private CheckBox CheckboxL�rm�l3Innlev;
    @FXML
    private CheckBox CheckboxL�rm�l4Innlev;
    @FXML
    private CheckBox CheckboxL�rm�l5Innlev;
    @FXML
    private CheckBox CheckboxL�rm�l6Innlev;
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
    private int brukerid = LoginController.getLoggedID();
    
    @FXML
    private Label labelModulDescr;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CheckboxL�rm�l1Innlev.setText("LM 1");
        CheckboxL�rm�l2Innlev.setText("LM 2");
        CheckboxL�rm�l3Innlev.setText("LM 3");
        CheckboxL�rm�l4Innlev.setText("LM 4");
        CheckboxL�rm�l5Innlev.setText("LM 5");
        CheckboxL�rm�l6Innlev.setText("LM 6");
        
        labelModulDescr.setText(mm.getModulName(modulnr)+ " - "+ mm.getModulDescr(modulnr));
        
    }

    
    
    
    @FXML
    public void sendEvent() throws Exception
    {
        //N�r student trykker p� send
        ModulBesvarelseManager mbm = new ModulBesvarelseManager();
        
        ModulBesvarelseDataModel mbdm = new ModulBesvarelseDataModel();
        BrukerDataModel bdm = new BrukerDataModel();
        ModulDataModel mdm = new ModulDataModel();
        
        Date mbDeliveryDate = new Date();
        
        //MbID kan v�re hvilken som helst verdi da serveren autogenerer
        //prim�rn�kkel n�r det legges til ny rad (auto-increment)
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
