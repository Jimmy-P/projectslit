/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OversiktKlasser;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Setter opp objekter for studenter i oversikten
 * 
 * @author Maria
 */
public class StudentOversikt {
    
    private final SimpleIntegerProperty oversiktStudentID;
    private final SimpleStringProperty oversiktStudentNavn;
    private final SimpleStringProperty oversiktStudentMail;
 
    public StudentOversikt(int osID, String osNavn, String osMail) {
        this.oversiktStudentID = new SimpleIntegerProperty(osID);
        this.oversiktStudentNavn = new SimpleStringProperty(osNavn);
        this.oversiktStudentMail = new SimpleStringProperty(osMail);
    }
 
    public int getOversiktStudentID() {
        return oversiktStudentID.get();
    }
    public String getOversiktStudentNavn() {
        return oversiktStudentNavn.get();
    }
    public String getOversiktStudentMail() {
        return oversiktStudentMail.get();
    }
    
    public void setOversiktStudentID(int osID) {
        oversiktStudentID.set(osID);
    }
    public void setOversiktStudentNavn(String osNavn) {
        oversiktStudentNavn.set(osNavn);
    }
    public void setOversiktStudentMail(String osMail) {
        oversiktStudentMail.set(osMail);
    }
    
}
