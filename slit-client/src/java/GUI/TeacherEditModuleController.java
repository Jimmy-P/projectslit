/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataModel.BrukerDataModel;
import DataModel.LaringsmalDataModel;
import DataModel.ModulBesvarelseDataModel;
import DataModel.ModulDataModel;
import Framework.LaringsmalManager;
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
 * @author Kjetil
 */
public class TeacherEditModuleController implements Initializable {

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
    private Button ButtonVideoInnlev;
    @FXML
    private Button ButtonLesestoffInnlev;
    @FXML
    private Label LabelHjelpemidlerInnlev;
    @FXML
    private Label labelModulDescr;
    @FXML
    private Button buttonEditLM1;
    @FXML
    private Button buttonEditLM2;
    @FXML
    private Button buttonEditLM3;
    @FXML
    private Button buttonEditLM4;
    @FXML
    private Button buttonEditLM5;
    @FXML
    private Button buttonEditLM6;
    

    LaringsmalManager lm = new LaringsmalManager();
    ModulManager mm = new ModulManager();
    
    private int modulnr = LoggedUserInfo.getModulnr();
    @FXML
    private TextField textfieldNyttLM;
   
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CheckboxLærmål1Innlev.setText(lm.getLaringsmalFromId(1));
        CheckboxLærmål2Innlev.setText(lm.getLaringsmalFromId(2));
        CheckboxLærmål3Innlev.setText(lm.getLaringsmalFromId(3));
        CheckboxLærmål4Innlev.setText(lm.getLaringsmalFromId(4));
        CheckboxLærmål5Innlev.setText(lm.getLaringsmalFromId(5));
       CheckboxLærmål6Innlev.setText(lm.getLaringsmalFromId(6));
        
        
        labelModulDescr.setText("Rediger "+mm.getModulName(modulnr));
    }    

    @FXML
    private void cancelEvent(ActionEvent event) throws Exception
    {
        
        SceneSelecter.getInstance().setScene(ViewNames.modulView);
    }

 

    @FXML
    private void editLM1(ActionEvent event) {
       
        
        LaringsmalManager lm = new LaringsmalManager();
        LaringsmalDataModel ldm = new LaringsmalDataModel();
        ModulDataModel mdm = new ModulDataModel();
        String nyLM = textfieldNyttLM.getText();
        ldm.setLID(1);
        ldm.setLtekst(nyLM);
        mdm.setmID(1);
        lm.setLaringsMal(ldm, mdm);
        CheckboxLærmål1Innlev.setText(lm.getLaringsmalFromId(1));
     }

    @FXML
    private void editLM2(ActionEvent event) {
        LaringsmalManager lm = new LaringsmalManager();
        LaringsmalDataModel ldm = new LaringsmalDataModel();
        ModulDataModel mdm = new ModulDataModel();
        String nyLM = textfieldNyttLM.getText();
        ldm.setLID(2);
        ldm.setLtekst(nyLM);
        mdm.setmID(2);
        lm.setLaringsMal(ldm, mdm);
        CheckboxLærmål2Innlev.setText(lm.getLaringsmalFromId(2));
    }

    @FXML
    private void editLM3(ActionEvent event) {
        LaringsmalManager lm = new LaringsmalManager();
        LaringsmalDataModel ldm = new LaringsmalDataModel();
        ModulDataModel mdm = new ModulDataModel();
        String nyLM = textfieldNyttLM.getText();
        ldm.setLID(3);
        ldm.setLtekst(nyLM);
        mdm.setmID(3);
        lm.setLaringsMal(ldm, mdm);
        CheckboxLærmål3Innlev.setText(lm.getLaringsmalFromId(3));
    }

    @FXML
    private void editLM4(ActionEvent event) {
        LaringsmalManager lm = new LaringsmalManager();
        LaringsmalDataModel ldm = new LaringsmalDataModel();
        ModulDataModel mdm = new ModulDataModel();
        String nyLM = textfieldNyttLM.getText();
        ldm.setLID(4);
        ldm.setLtekst(nyLM);
        mdm.setmID(4);
        lm.setLaringsMal(ldm, mdm);
        CheckboxLærmål4Innlev.setText(lm.getLaringsmalFromId(4));
        
    }

    @FXML
    private void editLM5(ActionEvent event) {
        LaringsmalManager lm = new LaringsmalManager();
        LaringsmalDataModel ldm = new LaringsmalDataModel();
        ModulDataModel mdm = new ModulDataModel();
        String nyLM = textfieldNyttLM.getText();
        ldm.setLID(5);
        ldm.setLtekst(nyLM);
        mdm.setmID(5);
        lm.setLaringsMal(ldm, mdm);
        CheckboxLærmål5Innlev.setText(lm.getLaringsmalFromId(5));
    }

    @FXML
    private void editLM6(ActionEvent event) {
        LaringsmalManager lm = new LaringsmalManager();
        LaringsmalDataModel ldm = new LaringsmalDataModel();
        ModulDataModel mdm = new ModulDataModel();
        String nyLM = textfieldNyttLM.getText();
        ldm.setLID(6);
        ldm.setLtekst(nyLM);
        mdm.setmID(6);
        lm.setLaringsMal(ldm, mdm);
        CheckboxLærmål6Innlev.setText(lm.getLaringsmalFromId(6));
    }
    
}
