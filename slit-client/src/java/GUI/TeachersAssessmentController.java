/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Lani
 */
public class TeachersAssessmentController implements Initializable {

    @FXML//Bakgrunn//
    private Pane PaneBakgrunnTilbakemeld;
    @FXML//Overskrift//
    private TextField LabelTilbakemeldTilbakemeld;
    @FXML//Overskrift til intern kommentaren//
    private TitledPane TitledPaneInternKomTilbakemeld;
    @FXML//Her skriver læreren kommentar til seg selv om studentens arbeid//
    private TextArea TextAreaInternTilbakemeld;
    @FXML//Avbryter rettingen og legger modulen tilbake i kø//
    private Button ButtonAvbrytTilbakemeld;
    @FXML //overskrift til tekstomrade som sendes til studenten//
    private TitledPane TitledPaneStudKomTilbakemeld;
    @FXML//Her skriver læreren sin kommentar til studenten//
    private TextArea TextAreaTilStudentTilbakemeld1;
    @FXML//Sender godkjent tilbake til studenten//
    private Button ButGodkjentTilbakemeld;
    @FXML//Sender ikke godkjent og kommentar tilbake til studenten//
    private Button ButIkkeGodkjentTilbakemeld;
    @FXML
    private Label labelFeedback;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    
    @FXML
     private void modulAccepted(ActionEvent event) {
         labelFeedback.setText("");
        String studentComment = TextAreaTilStudentTilbakemeld1.getText();
        String teacherComment = TextAreaInternTilbakemeld.getText();
        
        

        
       
        }
     

    @FXML
    private void buttonCancel(ActionEvent event) {
        
        
        
    }

    @FXML
    private void modulRejected(ActionEvent event) {
        labelFeedback.setText("");
        String studentComment = TextAreaTilStudentTilbakemeld1.getText();
        String teacherComment = TextAreaInternTilbakemeld.getText();
        
        if (studentComment.isEmpty()){
            labelFeedback.setText("Ikke godkjente besvarelser må ha kommentar");
            return;
        }
        else{
            
            //Her må vi opprette et tilbakemeldingsobjekt
        }
        
    }

   
}
       
       
       
       
/*       
       
       
       
       
       
       
       
       
       
       
        Button sendButton;
TextArea area;
// init...

// set handlers
sendButton.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent actionEvent) {
         sendFunction();
    }
});

textArea.setOnKeyPressed(new EventHandler<KeyEvent>() {
    @Override
    public void handle(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER)  {
             sendFunction();
        }
    }
});

// define send function
public void sendFunction() {
    String textArea = this.textStudentKommentar.getText();

    // do the send stuff  Get the text using area.getText() and clear using area.setText("");//

    // clear text (you may or may not want to do this here)
    this.textArea.setText("");
}
    
    }

// For å lagre intern kommentaren//

         btnSave.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            FileChooser saveFile = new FileChooser();
            FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
            saveFile.getExtensionFilters().add(extFilter);
            File f = saveFile.showSaveDialog(primaryStage);

        }
    });

}
*/