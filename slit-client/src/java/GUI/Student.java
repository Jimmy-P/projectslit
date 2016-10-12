/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *  Klasse for studentobjekter, for å holde rede på innleveringer, kommentarer, osv
 * @author Kjetil
 */
public class Student {
    
    
    
    private String name;
    private String kommentarModul1;
    private String doneModul1;
    
    
    public Student(String name, String kommentar1, String points1){
        
        this.name = name;
        this.kommentarModul1 = kommentar1;
        this.doneModul1 = points1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKommentarModul1() {
        return kommentarModul1;
    }

    public void setKommentarModul1(String kommentarModul1) {
        this.kommentarModul1 = kommentarModul1;
    }

    public String getDoneModul1() {
        return doneModul1;
    }

    public void setDoneModul1(String doneModul1) {
        this.doneModul1 = doneModul1;
    }
    


}