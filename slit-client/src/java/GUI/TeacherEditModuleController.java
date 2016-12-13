/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Framework.LaringsmalManager;
import Framework.ModulManager;
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
   
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        CheckboxLærmål1Innlev.setText(lm.getLaringsmalFromId(1));
        if(CheckboxLærmål1Innlev.getText()=="")
        {
            CheckboxLærmål1Innlev.setVisible(false);
        }
        CheckboxLærmål2Innlev.setText(lm.getLaringsmalFromId(2));
        if(CheckboxLærmål2Innlev.getText()=="")
        {
            CheckboxLærmål2Innlev.setVisible(false);
        }
        CheckboxLærmål3Innlev.setText(lm.getLaringsmalFromId(3));
        if(CheckboxLærmål3Innlev.getText()=="")
        {
            CheckboxLærmål3Innlev.setVisible(false);
        }
        CheckboxLærmål4Innlev.setText(lm.getLaringsmalFromId(4));
        if(CheckboxLærmål4Innlev.getText()=="")
        {
            CheckboxLærmål4Innlev.setVisible(false);
        }
        CheckboxLærmål5Innlev.setText(lm.getLaringsmalFromId(5));
        if(CheckboxLærmål5Innlev.getText()=="")
        {
            CheckboxLærmål5Innlev.setVisible(false);
        }
        CheckboxLærmål6Innlev.setText(lm.getLaringsmalFromId(6));
        if(CheckboxLærmål6Innlev.getText()=="")
        {
            CheckboxLærmål6Innlev.setVisible(false);
        }
        
        labelModulDescr.setText("Rediger "+mm.getModulName(modulnr));
    }    

    @FXML
    private void cancelEvent(ActionEvent event) throws Exception
    {
        
        SceneSelecter.getInstance().setScene(ViewNames.modulView);
    }

 

    @FXML
    private void editLM1(ActionEvent event) {
        
        lm.setLaringsMal(1, "Læringsmål 1 redigert");
        CheckboxLærmål1Innlev.setText(lm.getLaringsmalFromId(1));
        
    }

    @FXML
    private void editLM2(ActionEvent event) {
    }

    @FXML
    private void editLM3(ActionEvent event) {
    }

    @FXML
    private void editLM4(ActionEvent event) {
    }

    @FXML
    private void editLM5(ActionEvent event) {
    }

    @FXML
    private void editLM6(ActionEvent event) {
    }
    
}
