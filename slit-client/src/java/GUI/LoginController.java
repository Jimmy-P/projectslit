/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DataModel.BrukerDataModel;
import Framework.BrukerManager;
import Names.ViewNames;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Adam
 */
public class LoginController implements Initializable {

    @FXML
    private Label statusLabel;
    @FXML
    private TextField epostField;
    @FXML
    private PasswordField passordField;
    
    private int loginID;
    
    BrukerManager bm = new BrukerManager();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void onPress(ActionEvent event) {
        
        if(!this.passordField.getText().isEmpty() && 
                !this.epostField.getText().isEmpty())
        {
            BrukerDataModel bdm = bm.brukerLogin(this.epostField.getText(), 
                    this.passordField.getText());
            
            if(bdm.getbEmail() != null && bdm.getbPassord() != null)
            {
                //this.statusLabel.setText("Du er logget inn som " + 
                  //      bdm.getbFnavn() + " " + bdm.getbEnavn());
                
                try
                {                //HER MÅ DET INN EN IF-SETNING SOM SENDER BRUKER VIDERE TIL RIKTIG MENY BASERT PÅ BRUKERTYPE
                
                    SceneSelecter.getInstance().setScene(ViewNames.modulView);
                    
                }
                catch(Exception e)
                {
                    this.statusLabel.setText(e.getMessage());
                }
                //this.loginID = bdm.getbId();
                //System.out.println(loginID);
                
                /*try {
                     this.statusLabel.setText("Du er logget inn");
                 }
                catch(Exception e) {
                    this.statusLabel.setText(e.getMessage());
                }*/
            }
            else
            {
                this.statusLabel.setText("Epost eller passord er feil.");
            }
        }
        else
        {
            this.statusLabel.setText("Har du husket å skrive inn Epost og Passord?");
        }
    }
    
}
