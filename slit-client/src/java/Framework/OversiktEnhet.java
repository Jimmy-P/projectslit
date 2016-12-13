/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.*;


/**
 *
 * @author Maria
 */
public class OversiktEnhet {
    
    /* 
    Ikke levert = 1
    Levert = 2
    Godkjent = 3
    */
    private String fnavn;
    private String enavn;
    private String mail;
    private int modul1;
    private int modul2;
    private int modul3;
    private int modul4;
    private int modul5;
    private int modul6;
    private int modul7;
    private int modul8;
    private int modul9;
    private int modul10;
    
    public void newOversiktEnhet(String fNavn, String eNavn, String mail, int mod1,
            int mod2, int mod3, int mod4, int mod5, int mod6, int mod7,
            int mod8, int mod9, int mod10)
    {
            this.fnavn = new String (fNavn);
            this.enavn = new String (eNavn);
            this.mail = new String (mail);
            this.modul1 = mod1;
            this.modul2 = mod2;
            this.modul3 = mod3;
            this.modul4 = mod4;
            this.modul5 = mod5;
            this.modul6 = mod6;
            this.modul7 = mod7;
            this.modul8 = mod8;
            this.modul9 = mod9;
            this.modul10 = mod10;
    }
    
    List<OversiktEnhet> oversiktEnheter = new ArrayList<>();
    
    /*
    ObservableList<OversiktEnhet> oversiktEnheter = new FXCollections.ObservableArrayList();
        (
                new OversiktEnhet("Will", "Smith", "wsmith@online.no", 3, 3, 3, 2, 2, 1, 1, 1, 1, 1);
                new OversiktEnhet("Angelina", "Jolie", "ajolie@online.no", 3, 3, 2, 1, 1, 1, 1, 1, 1, 1);
                new OversiktEnhet("Jamie", "Bell", "jbell@gmail.com", 3, 3, 3, 3, 3, 3, 3, 2, 1, 1);
                new OversiktEnhet("Meryl", "Streep", "mstreep@gmail.com", 2, 1, 1, 1, 1, 1, 1, 1, 1, 1);
                new OversiktEnhet("Lena", "Heady", "lheady@online.no", 3, 3, 2, 2, 1, 1, 1, 1, 1, 1);
                )
    */
    //public int getStudentID() {
    //    return this.studentID;
    //}
    public String getFNavn() {
        return this.fnavn;
    }
    public String getENavn() {
        return this.enavn;
    }
    public String getMail() {
        return this.mail;
    }
    public int getModul1() {
        return this.modul1;
    }
    public int getModul2() {
        return this.modul2;
    }
    public int getModul3() {
        return this.modul3;
    }
    public int getModul4() {
        return this.modul4;
    }
    public int getModul5() {
        return this.modul5;
    }
    public int getModul6() {
        return this.modul6;
    }
    public int getModul7() {
        return this.modul7;
    }
    public int getModul8() {
        return this.modul8;
    }
    public int getModul9() {
        return this.modul9;
    }
    public int getModul10() {
        return this.modul10;
    }
    /*
    public void setStudentID (int studID) {
        this.studentID = studID;
    }*/
    public void setFNavn(String fName) {
        this.fnavn = fName;
    }
    public void setENavn(String eName) {
        this.enavn = eName;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setModul1(int mod1) {
        this.modul1 = mod1;
    }
    public void setModul2(int mod2) {
        this.modul2 = mod2;
    }
    public void setModul3(int mod3) {
        this.modul3 = mod3;
    }
    public void setModul4(int mod4) {
        this.modul4 = mod4;
    }
    public void setModul5(int mod5) {
        this.modul5 = mod5;
    }
    public void setModul6(int mod6) {
        this.modul6 = mod6;
    }
    public void setModul7(int mod7) {
        this.modul7 = mod7;
    }
    public void setModul8(int mod8) {
        this.modul8 = mod8;
    }
    public void setModul9(int mod9) {
        this.modul9 = mod9;
    }
    public void setModul10(int mod10) {
        this.modul10 = mod10;
    
    
    //public static void makeOversiktList();
    
    //ObservableList<OversiktEnhet> oversiktEnheter;
    /*
        ObservableList<OversiktEnhet> oversiktEnheter = new FXCollections.ObservableArrayList
        (
                new OversiktEnhet("Will", "Smith", "wsmith@online.no", 3, 3, 3, 2, 2, 1, 1, 1, 1, 1);
                new OversiktEnhet("Angelina", "Jolie", "ajolie@online.no", 3, 3, 2, 1, 1, 1, 1, 1, 1, 1);
                new OversiktEnhet("Jamie", "Bell", "jbell@gmail.com", 3, 3, 3, 3, 3, 3, 3, 2, 1, 1);
                new OversiktEnhet("Meryl", "Streep", "mstreep@gmail.com", 2, 1, 1, 1, 1, 1, 1, 1, 1, 1);
                new OversiktEnhet("Lena", "Heady", "lheady@online.no", 3, 3, 2, 2, 1, 1, 1, 1, 1, 1);
                )

        
    /*
    class Besvarelse {
        private int besvarelseID;
        private String besvarelseDate;
    }
    
    class Tilbakemld {
        private int tilbakemldID;
        private int TilbakemldModulNR;
        private int tilbakemldStatus;
        private String tilbakemldDato;
    }
    */
    
    
    }
}
