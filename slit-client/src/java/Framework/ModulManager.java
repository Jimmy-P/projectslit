/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Server.ModulSessionBeanRemote;
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
 * @author bevo
 */
public class ModulManager {

    private ModulSessionBeanRemote lookupModulSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            return (ModulSessionBeanRemote) c.lookup("java:global/slit-server-ejb/ModulSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    public String getModulName(int id) {
        return this.lookupModulSessionBeanRemote().getModulName(id);
    }
    public String getModulDescr(int id) {
        return this.lookupModulSessionBeanRemote().getModulDescr(id);
    }
    public String getModulAssignment(int id) {
        return this.lookupModulSessionBeanRemote().getModulAssignment(id);
    }
    
    
}
