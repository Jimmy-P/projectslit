/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slit;

/**
 *  Klasse for studentobjekter, for å holde rede på innleveringer, kommentarer, osv
 * @author Kjetil
 */
public class Student {
    
    public Student(String name){
        
        this.name = name;
        
    }
    
    private String name;
    private String kommentarModul1;
    private boolean godkjentModul1;
    
    

public String getName(){

    return name;
}

public void setComment(String comment){

    kommentarModul1 = comment;
    
}

public void approveComment(boolean approved){
 
    godkjentModul1 = approved;
    System.out.println("Modul godkjent");
    
}



}