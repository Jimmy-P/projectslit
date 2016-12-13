/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

/**
 *
 * @author Adam
 */
public class LaringsmalDataModel implements java.io.Serializable {
    
    private int LID;
    private String Ltekst;
    private ModulDataModel modulDataModel;

    public int getLID() {
        return LID;
    }

    public void setLID(int LID) {
        this.LID = LID;
    }

    public String getLtekst() {
        return Ltekst;
    }

    public void setLtekst(String Ltekst) {
        this.Ltekst = Ltekst;
    }

    public ModulDataModel getModulDataModel() {
        return modulDataModel;
    }

    public void setModulDataModel(ModulDataModel modulDataModel) {
        this.modulDataModel = modulDataModel;
    }
    
    
    
    
    
}
