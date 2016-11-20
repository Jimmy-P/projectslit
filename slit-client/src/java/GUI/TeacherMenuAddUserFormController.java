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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *  Denne klassen har som oppgave å hente data fra felt
 *  som bruker fyller ut, lagre dette i et BrukerDataModel objekt,
 *  og så sende dette videre til BrukerManager som kaller
 *  metoder for å opprette ny bruker i databasen.
 * 
 * @author Kjetil
 */
public class TeacherMenuAddUserFormController implements Initializable {

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
    private Label labelOutput;

    BrukerManager bm = new BrukerManager();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    /*
        Denne metoden henter tekst bruker har skrevet inn,
        samt informasjon om hvilken radioknapp som er valgt. 
        Den sjekker også at alle felt har en verdi, og avbrytes
        om det er noen felt som ikke har fått definert en verdi.
    */
    @FXML
    private void createNewUser(ActionEvent event) {
        String fName = textFName.getText();
        String lName = textLName.getText();
        String eMail = textEmail.getText();
        String password = textPassword.getText();  //Disse linjene initialiserer variabel og definerer dem ved å hente tekst fra tekstfelt i GUI
        int type = 0;
        if (radioButL.isSelected())
        {type = 3;}
        if(radioButHL.isSelected())  //Disse if setningene sjekker hvilken radioknapp som er aktiv,
        {type = 2;}                  //og setter type basert på dette.
        if (radioButS.isSelected())
        {type = 1;}
       if (!radioButS.isSelected() && !radioButHL.isSelected() && !radioButL.isSelected())
       {
           formNotFilled("brukertype"); return; //Disse if-setningene sjekker om noen av feltene
           //ikke er utfylt, og i så fall kaller formNotFilled metoden & avbryter createNewUser metoden
       }
       if (fName.isEmpty())
        {formNotFilled("fornavn");return;}
        if (lName.isEmpty())
        {formNotFilled("etternavn");return;}
        if (eMail.isEmpty())
        {formNotFilled("e-mail");return;}
        if (password.isEmpty())
        {formNotFilled("passord"); return;}
        
        
        //Denne if setningen sier at hvis ingen av feltene er tomme, så kalles
        //clearFields metoden, det opprettes et nytt BrukerDataModel objekt
        //med variablene som tidligere ble hentet fra tekstfeltene i GUI. Til slutt kalles
        //en metode i BrukerManager klassen for å legge til ny bruker i tabellen
        if (type != 0 && !fName.isEmpty() && !lName.isEmpty() && !eMail.isEmpty() && !password.isEmpty())
        {
        clearFields();
        BrukerDataModel bdm = new BrukerDataModel();
        bdm.setbFnavn(fName);
        bdm.setbEnavn(lName);
        bdm.setbEmail(eMail);
        bdm.setbPassord(password);
        bdm.setbType(type);
                
        bm.newBruker(bdm);
        
        labelOutput.setText(fName +" "+lName+" lagt til i databasen.");
        }
         
        
       
        }

    /*
        Denne metoden kalles når bruker trykker på radioknapp
        "Lærer" for å bestemme brukertype. Den setter status på de andre 2 
        radioknappene til "false".
    */
    @FXML
    private void radioButtonEventL(ActionEvent event) {
        radioButHL.setSelected(false);
        radioButS.setSelected(false);
    }
    /*
        Denne metoden kalles når bruker trykker på radioknapp
        "Hjelpelærer" for å bestemme brukertype. Den setter status på de andre 2 
        radioknappene til "false".
    */
    @FXML
    private void radioButtonEventHL(ActionEvent event) {
        radioButL.setSelected(false);
        radioButS.setSelected(false);
    }
    /*
        Denne metoden kalles når bruker trykker på radioknapp
        "Student" for å bestemme brukertype. Den setter status på de andre 2 
        radioknappene til "false".
    */
    @FXML
    private void radioButtonEventS(ActionEvent event) {
        radioButHL.setSelected(false);
        radioButL.setSelected(false);
    }
    /*
        Denne metoden kalles når bruker ikke har fylt inn alle verdier, med
        parameter som forteller bruker hvilken verdi som mangler. 
    */
    private void formNotFilled(String missingValue)
    {
        labelOutput.setText("Du må velge "+missingValue);
    }
    /*
        clearFields tømmer alle feltene i skjemaet etter at ny bruker er opprettet
    */
    private void clearFields()
    {
        textFName.setText("");
        textLName.setText("");
        textEmail.setText("");
        textPassword.setText("");
        radioButHL.setSelected(false);
        radioButL.setSelected(false);
        radioButS.setSelected(false);
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
        SceneSelecter.getInstance().setScene(ViewNames.modulView);  //DENNE MÅ RETTES NÅR VI HAR EN FXML FOR STUDENTOVERSIKT
        }
}