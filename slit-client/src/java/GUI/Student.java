/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javafx.beans.property.SimpleStringProperty;

/**
 * 
 * @author bevo
 * Enkel klasse for student
 */
public class Student {
    
    private final SimpleStringProperty TabellBruker;
    private final SimpleStringProperty TabellModul;
    private final SimpleStringProperty TabellDato;
 
    public Student(String Bruker, String Modul, String Dato) {
        this.TabellBruker = new SimpleStringProperty(Bruker);
        this.TabellModul = new SimpleStringProperty(Modul);
        this.TabellDato = new SimpleStringProperty(Dato);
    }
 
    public String getBruker() {
        return TabellBruker.get();
    }
    public void setBruker(String Bruker) {
        TabellBruker.set(Bruker);
    }
        
    public String getModul() {
        return TabellModul.get();
    }
    public void setModul(String Modul) {
        TabellModul.set(Modul);
    }
    
    public String getDato() {
        return TabellDato.get();
    }
    public void setDato(String Dato) {
        TabellDato.set(Dato);
    }
    
}
