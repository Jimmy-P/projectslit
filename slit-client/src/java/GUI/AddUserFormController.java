package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import DataModel.BrukerDataModel;
import Framework.BrukerManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;



/**
 * FXML Controller class
 *
 * @author Jimmy
 */
public class AddUserFormController implements Initializable {
    
    
    @FXML
    private TextField textFName;
    @FXML
    private TextField textLName;
    @FXML
    private TextField textEmail;
    @FXML
    private Label labelLName;
    @FXML
    private Label labelEmail;
    @FXML
    private Label labelFName;
    @FXML
    private TextField textPassword;
    @FXML
    private Label labelPassword;
    @FXML
    private RadioButton radioButL;
    @FXML
    private RadioButton radioButHL;
    @FXML
    private RadioButton radioButS;
    @FXML
    private Button newUserBtn;
    @FXML
    private Button cancelBtn;
    
    BrukerManager bm = new BrukerManager();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createNewUser(ActionEvent event) {
        String fName = textFName.getText();
        String lName = textLName.getText();
        String eMail = textEmail.getText();
        String password = textPassword.getText();
        int type = 0;
        if (radioButL.isSelected())
        {type = 3;}
        if(radioButHL.isSelected())
        {type = 2;}
        if (radioButS.isSelected())
        {type = 1;}
       if (!radioButS.isSelected() && !radioButHL.isSelected() && !radioButL.isSelected())
       {
           formNotFilled("brukertype"); return;
       }
       if (fName.isEmpty())
        {formNotFilled("fornavn");return;}
        if (lName.isEmpty())
        {formNotFilled("etternavn");return;}
        if (eMail.isEmpty())
        {formNotFilled("e-mail");return;}
        if (password.isEmpty())
        {formNotFilled("passord"); return;}
        
        if (type != 0 && !fName.isEmpty() && !lName.isEmpty() && !eMail.isEmpty() && !password.isEmpty())
        {
        BrukerDataModel bdm = new BrukerDataModel();
        bdm.setbFnavn(fName);
        bdm.setbEnavn(lName);
        bdm.setbEmail(eMail);
        bdm.setbPassord(password);
        bdm.setbType(type);
                
        bm.newBruker(bdm);
        }
         
        
       
        }

    @FXML
    private void cancelEvent(ActionEvent event) {
    }
    @FXML
    private void radioButtonEventL(ActionEvent event) {
        radioButHL.setSelected(false);
        radioButS.setSelected(false);
    }
    @FXML
    private void radioButtonEventHL(ActionEvent event) {
        radioButL.setSelected(false);
        radioButS.setSelected(false);
    }
    @FXML
    private void radioButtonEventS(ActionEvent event) {
        radioButHL.setSelected(false);
        radioButL.setSelected(false);
    }
    private void formNotFilled(String missingValue)
    {
        System.out.println("Du må velge "+missingValue);
    }
}

    
    

