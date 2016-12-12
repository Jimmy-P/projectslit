/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import DataModel.BrukerDataModel;
import Server.BrukerSessionBeanRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Denne klassen bruker en JNDI (Java Naming and Directory Interface) lookup 
 * for å tillate klassen å kalle metoder på en remote EJB. Først sjekker den 
 * om metoden eksisterer i fellesbiblioteket. Stemmer det gjennomføres det 
 * en lookup til SessionBean på serversiden (Slik jeg forstår JNDI).
 * 
 * Hvis denne lookupen går igjennom i et av metodekallene sendes informasjonen
 * over til serveren der paramaterene brukes til å kjøre metodene på serversiden
 * der det befinner seg business-logic til metoden.
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
    
    /**
     * Henter ut en bruker fra databasen med en gitt primarnøkkel som parameter.
     * Vil hovedsaklig brukes til testing da det ikke er hensiktsmessig for
     * brukeren å gjøre spørringer på en primærnøkkel.
     * @param id
     * @return 
     */
    public BrukerDataModel getBrukerFromId(int id) {
        return this.lookupBrukerSessionBeanRemote().getBrukerFromBId(id);
    }
    /**
     * Sender login-informasjon til serveren. Serveren gjennomfører så en
     * spørring på databasen for å sjekke om informasjonen er korrekt.
     * @param email
     * @param password
     * @return 
     */
    public BrukerDataModel brukerLogin(String email, String password){
        return this.lookupBrukerSessionBeanRemote().brukerLogin(email, password);
    }
    
    /**
     * Bruker en constructor hentet fra fellesbiblioteket
     * til å generere et POJO(objekt) av Bruker som videresendes til server.
     * @param bdm 
     */
    public void newBruker(BrukerDataModel bdm){
        this.lookupBrukerSessionBeanRemote().newBruker(bdm);
    }
    
    
    /**
     * 
     * @return 
     */
    public List<BrukerDataModel> getAllBrukere(){
        return this.lookupBrukerSessionBeanRemote().getAllBrukere();
    }
            
}
