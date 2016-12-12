/*
 * Her skal l�reren skrive inn en kommentar eller 
tilbakemelding p� studentens innlevering. L�rer kan
ogs� skrive en intern kommentar hvis det er noe 
spesielt bra eller mindre bra, eller Husk:)
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
    @FXML//Her skriver l�reren kommentar til seg selv om studentens arbeid//
    private TextArea TextAreaInternTilbakemeld;
    @FXML//Avbryter rettingen og legger modulen tilbake i k�//
    private Button ButtonAvbrytTilbakemeld;
    @FXML //overskrift til tekstomrade som sendes til studenten//
    private TitledPane TitledPaneStudKomTilbakemeld;
    @FXML//Her skriver l�reren sin kommentar til studenten//
    private TextArea TextAreaTilStudentTilbakemeld1;
    @FXML//Sender godkjent tilbake til studenten//
    private Button ButGodkjentTilbakemeld;
    @FXML//Sender ikke godkjent og kommentar tilbake til studenten//
    private Button ButIkkeGodkjentTilbakemeld;
    @FXML//Sier at studenten m� f� en kommentar//
    private Label labelFeedback;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //Her skriver l�rer inn kommmentar til godkjent modul
    @FXML
     private void modulAccepted(ActionEvent event) {
         labelFeedback.setText("");
        String studentComment = TextAreaTilStudentTilbakemeld1.getText();
        String teacherComment = TextAreaInternTilbakemeld.getText();
        
     }
     
     //Her skriver l�rer inn kommentar til ikke godkjent modul
    @FXML
    private void modulRejected(ActionEvent event) {
        labelFeedback.setText("");
        String studentComment = TextAreaTilStudentTilbakemeld1.getText();
        String teacherComment = TextAreaInternTilbakemeld.getText();
        
    //Hvis studentkomentaren er tom, gir denne metoden beskjed 
    //om at kommentarfeltet m� fylles inn     
        if (studentComment.isEmpty()){
            labelFeedback.setText("Alle besvarelser m� ha kommentar.");
            return;
        }
        //Send kommentaren p� besvarelsen rilbake til studenten
        else{
            //labelOutput.setText(""); ?
            //Her m� vi opprette et tilbakemeldingsobjekt
            // SceneSelecter.getInstance().setScene(ViewNames.studentComment);
        }
        
}
        
    }

   
      
                   //*  give your close button an fx:id, if you haven't yet: 
                   //<Button fx:id="closeButton" onAction="#closeButtonAction">
                   //In your controller class:
    //@FXML private javafx.scene.control.Button closeButton; *//

    //@FXML
     //private void closeButtonAction(){
                                                  // get a handle to the stage
   // Stage stage = (Stage) closeButton.getScene().getWindow();
                                                    // do what you have to do
   // stage.close();    
    
    //@FXML
    //private void canselButtonAction(buttonAvbrytTilbakemeld) {
      //  Stage stage = (teacherAssessment.FXML) canselButton.getScene().getWindow();
       // stage.close(teacherAssessment.FXML);
   // }
    
//}
       
       
