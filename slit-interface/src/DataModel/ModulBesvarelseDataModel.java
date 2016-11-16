/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

//import slit-server-ejb.Database.Modul;
//import slit-server-ejb.Database.Bruker;
import java.util.Date;
import java.util.List;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author bevo
 */
public class ModulBesvarelseDataModel implements java.io.Serializable {
 
    private int MbId;
    private Date mbTidspunkt;
    private int bid;
    private int mid;   

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


    
    
    
  
}
