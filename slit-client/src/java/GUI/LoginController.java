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
 * Autogenerert klasse basert på login.fxml sitt objekthierarki.
 * Denne klassen instansierer elementene som skal være med i GUI. Informasjon
 * om hvor disse skal plasseres i GUI etc ligger i login.fxml. Hvordan
 * disse kommuniserer sammen tør jeg ikke si men jeg antar det har noe med
 * metoden "initalize" å gjøre.
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
        
        /**
         * IF: Hvis felt for e-post eller passord er tomme...
         */
        if(!this.passordField.getText().isEmpty() && 
                !this.epostField.getText().isEmpty())
        {
           /**
            * Kjøret metode fra BrukerManager (lookup fra BrukerDataModel i 
            * fellesbiblioteket) som tar brukerens input og sender til
            * server som bruker paramterene i metoden til å utføre en spørring på DB.
            */
            BrukerDataModel bdm = bm.brukerLogin(this.epostField.getText(), 
                    this.passordField.getText());
            
            /**
             * IF: Hvis spørring etter brukerdetaljene på serveren ikke
             * returnerer noen verdi...
             */
            if(bdm.getbEmail() != null && bdm.getbPassord() != null)
            {
                if (bdm.getbType() == 2 || bdm.getbType() == 3){
                try
                {                
                
                    SceneSelecter.getInstance().setScene(ViewNames.modulView);
                    
                }
                catch(Exception e)
                {
                    this.statusLabel.setText(e.getMessage());
                }
                }
                else if (bdm.getbType() == 1)
                {
                  try
                {                
                
                    SceneSelecter.getInstance().setScene(ViewNames.studentView);
                    
                }
                catch(Exception e)
                {
                    this.statusLabel.setText(e.getMessage());
                }   
                    
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
