/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import DataModel.BrukerDataModel;
import Server.BrukerSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Adam
 */
public class BrukerManager {
    private BrukerSessionBeanRemote lookupBrukerSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            return (BrukerSessionBeanRemote) c.lookup("java:global/slit-server-ejb/BrukerSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    /*
    public String getBrukerFNavnFromId(int id) {
        return this.lookupBrukerSessionBeanRemote().getBrukerFNavnFromId(id);
    }   
    public String getBrukerENavnFromId(int id) {
        return this.lookupBrukerSessionBeanRemote().getBrukerENavnFromId(id);
    }
    public String getBrukerEmailFromId(int id){
        return this.lookupBrukerSessionBeanRemote().getBrukerEmailFromId(id);
    }
    public String getBrukerPassordFromId(int id){
        return this.lookupBrukerSessionBeanRemote().getBrukerPassordFromId(id);
    }
    public int getBrukerTypeFromId(int id){
        return this.lookupBrukerSessionBeanRemote().getBrukerTypeFromId(id);
    }
    */
    
    public BrukerDataModel getBrukerFromId(int id) {
        return this.lookupBrukerSessionBeanRemote().getBrukerFromBId(id);
    }
    public BrukerDataModel brukerLogin(String email, String password){
        return this.lookupBrukerSessionBeanRemote().brukerLogin(email, password);
    }
    public void newBruker(BrukerDataModel bdm){
        this.lookupBrukerSessionBeanRemote().newBruker(bdm);
    }
            
}
