/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.BrukerDataModel;
import javax.ejb.Remote;

/**
 *
 * @author Adam
 */
@Remote
public interface BrukerSessionBeanRemote {
    
    BrukerDataModel getBrukerFromBId(int id);
    
    BrukerDataModel brukerLogin(String epost, String passord);
    
    public void newBruker(BrukerDataModel bdm);
    
    /*
    String getBrukerFNavnFromId(int bId);
    
    String getBrukerENavnFromId(int bId);
    
    String getBrukerEmailFromId(int bId);
    
    String getBrukerPassordFromId(int bId);
    
    int getBrukerTypeFromId(int bId);
    */
}
