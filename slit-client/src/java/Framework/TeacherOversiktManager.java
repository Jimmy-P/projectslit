/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import DataModel.BrukerDataModel;
import java.util.*;
import GUI.TeacherMenuStudentoversiktController;
import DataModel.BrukerDataModel;
import Framework.BrukerManager;
import java.net.URL;
import java.util.*;
import javafx.fxml.FXML;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.beans.property.SimpleIntegerProperty;
import Framework.OversiktEnhet;

/**
 *
 * @author Maria
 */
public class TeacherOversiktManager {
     
    
    private int brukerID;
    private String brukerfornavn;
    private String brukeretternavn;
    private String brukerepost;
    private int brukertype;
    
    /*
    public void newArrayList() {
    List<OversiktEnhet> oversiktEnheterList = new ArrayList();
    
    OversiktEnhet oe1 = new OversiktEnhet();
    OversiktEnhet.setFNavn("Will");
    OversiktEnhet oe2 = new OversiktEnhet("Angelina", "Jolie", "ajolie@online.no", 3, 3, 2, 1, 1, 1, 1, 1, 1, 1);
    OversiktEnhet oe3 = new OversiktEnhet("Jamie", "Bell", "jbell@gmail.com", 3, 3, 3, 3, 3, 3, 3, 2, 1, 1);
    OversiktEnhet oe4 = new OversiktEnhet("Meryl", "Streep", "mstreep@gmail.com", 2, 1, 1, 1, 1, 1, 1, 1, 1, 1);
    OversiktEnhet oe5 = new OversiktEnhet("Lena", "Heady", "lheady@online.no", 3, 3, 2, 2, 1, 1, 1, 1, 1, 1);
    
}
    }
    
    newOversiktEnhet("Will", "Smith", "wsmith@online.no", 3, 3, 3, 2, 2, 1, 1, 1, 1, 1);
    
    //ArrayList<String> oversikt = new ArrayList();
    //int i = 0;
    
    //for (i = 0; i < 10; i++) {
    //    testEvent() throws Exception;
    //}
    
    /*
    @FXML
    public void lagStudentListe() {
        ArrayList<Student> studentListe = new ArrayList();
        int i = 0;
        BrukerManager bm = new BrukerManager();
        for (BrukerDataModel bdm : bm.getAllBrukere()) {
            brukerID = BrukerManager.getbID();
            brukerfornavn = BrukerManager.getBrukerFNavnFromId(i);
            brukeretternavn = BrukerManager.getbEnavn();
            brukerepost = BrukerManager.getbEmail();
            brukertype = BrukerManager.getbType();
            
            if (brukertype == 1) {
                Student student = new Student();
                this.student(setStudentID(brukerID));
                setStudentFName(brukerfornavn);
                setStudentEName(brukeretternavn);
                setStudentMail(brukerepost);
                
                studentListe.add(student);
            }
            i++;
        }
        //TeacherMenuStudentoversiktController.setTextArea(brukerListe.toString() + "\n");
    }
    */
    
    
    @FXML
    private void testEvent() throws Exception {
        BrukerManager bm = new BrukerManager();
        for (BrukerDataModel bdm : bm.getAllBrukere()) {
            System.out.println("");
            System.out.println(bdm.getbFnavn() + " " + bdm.getbEnavn());
            System.out.println(bdm.getbEmail());
        }
    }
    
    
}
