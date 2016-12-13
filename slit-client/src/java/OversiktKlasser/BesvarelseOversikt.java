/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OversiktKlasser;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author maria
 */
public class BesvarelseOversikt {
    
    private final SimpleIntegerProperty oversiktBesvarelseID;
    private final SimpleIntegerProperty oversiktBesvarelseSID;
    private final SimpleStringProperty oversiktBesvarelseDato;
 
    public BesvarelseOversikt(int obID, int obSID, String obDato) {
        this.oversiktBesvarelseID = new SimpleIntegerProperty(obID);
        this.oversiktBesvarelseSID = new SimpleIntegerProperty(obSID);
        this.oversiktBesvarelseDato = new SimpleStringProperty(obDato);
    }
 
    public int getOversiktBesvarelseID() {
        return oversiktBesvarelseID.get();
    }
    public int getOversiktBesvarelseSID() {
        return oversiktBesvarelseSID.get();
    }
    public String getOversiktBesvarelseDato() {
        return oversiktBesvarelseDato.get();
    }
    
    public void setOversiktStudentID(int obID) {
        oversiktBesvarelseID.set(obID);
    }
    public void setOversiktBesvarelseID(int obSID) {
        oversiktBesvarelseSID.set(obSID);
    }
    public void setOversiktBesvarelseDato(String obDato) {
        oversiktBesvarelseDato.set(obDato);
    }
}
