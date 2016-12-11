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
public class ModulDataModel implements java.io.Serializable {
    
    private int mID;
    private String mNavn;
    private String mBeskrivelse;
    private String mOppgave;

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmNavn() {
        return mNavn;
    }

    public void setmNavn(String mNavn) {
        this.mNavn = mNavn;
    }

    public String getmBeskrivelse() {
        return mBeskrivelse;
    }

    public void setmBeskrivelse(String mBeskrivelse) {
        this.mBeskrivelse = mBeskrivelse;
    }

    public String getmOppgave() {
        return mOppgave;
    }

    public void setmOppgave(String mOppgave) {
        this.mOppgave = mOppgave;
    }
   
    
}
