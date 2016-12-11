/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.util.ArrayList;

/**
 *Denne gjør foreløpig ingenting, men mulig noe av det skal brukes senere
 * 
 * @author Maria
 */
public class StudentOversikt {
    
    
    /*Lager ArrayList med alle studentene. Skal brukes i TeacherStudentOversikt*/
public ArrayList makeStudentList() {
    ArrayList<String> studenter = new ArrayList();
    Student student = new Student();
    
    
    
    return studenter;
}

/* */
class Student {
    /* 
    Ikke levert = 1
    Levert = 2
    Godkjent = 3
    */
    private int studentID;
    private String fnavn;
    private String enavn;
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
    private int modul11;
    private int modul12;
    
    public int getStudentID() {
        return this.studentID;
    }
    public String getFNavn() {
        return this.fnavn;
    }
    public String getENavn() {
        return this.enavn;
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
    public int getModul11() {
        return this.modul11;
    }
    public int getModul12() {
        return this.modul12;
    }
    
    public void setStudentID (int studID) {
        this.studentID = studID;
    }
    public void setFNavn(String fName) {
        this.fnavn = fName;
    }
    public void setENavn(String eName) {
        this.enavn = eName;
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
    }
    public void setModul11(int mod11) {
        this.modul11 = mod11;
    }
    public void setModul12(int mod12) {
        this.modul12 = mod12;
    }
}
}
