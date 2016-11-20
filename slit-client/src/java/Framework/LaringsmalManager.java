/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Server.LaringsmalSessionBeanRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Denne klassen bruker en JNDI (Java Naming and Directory Interface) lookup 
 * for � tillate klassen � kalle metoder p� en remote EJB. F�rst sjekker den 
 * om metoden eksisterer i fellesbiblioteket. Stemmer det gjennomf�res det 
 * en lookup til SessionBean p� serversiden (Slik jeg forst�r JNDI).
 * 
 * Hvis denne lookupen g�r igjennom i et av metodekallene sendes informasjonen
 * over til serveren der paramaterene brukes til � kj�re metodene p� serversiden
 * der det befinner seg business-logic til metoden.
 * @author bevo
 */


public class LaringsmalManager {
    
    
    private LaringsmalSessionBeanRemote lookupLaringsmalSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            return (LaringsmalSessionBeanRemote) c.lookup("java:global/slit-server-ejb/LaringsmalSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
   
    
    public String getLaringsmalFromId(int l_ID) {
        return this.lookupLaringsmalSessionBeanRemote().getLaringsmalFromId(l_ID);
}

    
    
}
