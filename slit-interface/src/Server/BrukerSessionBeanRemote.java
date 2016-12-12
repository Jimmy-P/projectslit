/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.BrukerDataModel;
import java.util.List;
import javax.ejb.Remote;

/**
 * Denne klassen er et interface som bestemmer hvilke metoder med gitte 
 * paramatere som kan kalles fra klienten.
 * @author Adam
 */


@Remote
public interface BrukerSessionBeanRemote {

    /**
     * 
     * @param id (brukerens primærnøkkel)
     * @return brukerPOJO
     */  
    BrukerDataModel getBrukerFromBId(int id);
    
    
    BrukerDataModel brukerLogin(String epost, String passord);
    
    public void newBruker(BrukerDataModel bdm);
    
    public List<BrukerDataModel> getAllBrukere();
    
    /*
    String getBrukerFNavnFromId(int bId);
    
    String getBrukerENavnFromId(int bId);
    
    String getBrukerEmailFromId(int bId);
    
    String getBrukerPassordFromId(int bId);
    
    int getBrukerTypeFromId(int bId);
    */
}
