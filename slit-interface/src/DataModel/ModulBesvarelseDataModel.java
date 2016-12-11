/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

//import slit-server-ejb.Database.Modul;
import java.util.Date;
import java.util.List;
import javafx.beans.property.SimpleIntegerProperty;

/**
 * Denne klassen behandler objekter av modulbesvarelsesklassen som sendes frem 
 * og tilbake mellom klienten og serveren. Dette muliggjøres ved bruk av POJO 
 * objekter. Disse objektene behøver ikke en referanse til klassen den kommer 
 * fra og kan derfor lettere hentes og benyttes mellom en klient og en server.
 * @author bevo
 */
public class ModulBesvarelseDataModel implements java.io.Serializable {
 
    private int MbId;
    private Date mbTidspunkt;
    //private int bid;
    //private int mid;
    private BrukerDataModel brukerDataModel;
    private ModulDataModel modulDataModel;

    public int getMbId() {
        return MbId;
    }

    public Date getMbTidspunkt() {
        return mbTidspunkt;
    }

    public void setMbId(int MbId) {
        this.MbId = MbId;
    }

    public void setMbTidspunkt(Date mbTidspunkt) {
        this.mbTidspunkt = mbTidspunkt;
    }
    
    
    
    /*
    public int getBid() {
        return bid;
    }

    public int getMid() {
        return mid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
    */

    public BrukerDataModel getBrukerDataModel() {
        return brukerDataModel;
    }

    public void setBrukerDataModel(BrukerDataModel brukerDataModel) {
        this.brukerDataModel = brukerDataModel;
    }

    public ModulDataModel getModulDataModel() {
        return modulDataModel;
    }

    public void setModulDataModel(ModulDataModel modulDataModel) {
        this.modulDataModel = modulDataModel;
    }
}
