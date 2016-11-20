/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import DataModel.ModulBesvarelseDataModel;
import Server.ModulBesvarelseSessionBeanRemote;
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
 * @author bevo
 */
public class ModulBesvarelseManager {
    
    private ModulBesvarelseSessionBeanRemote lookupModulBesvarelseSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            return (ModulBesvarelseSessionBeanRemote) c.lookup("java:global/slit-server-ejb/ModulBesvarelseSessionBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
   
    /*
    public String getModulBesvarelseTidspunktFromId(int mb_id) {
        return this.lookupModulBesvarelseSessionBeanRemote().getModulBesvarelseTidspunktFromId(mb_id);
} */
    
    public List<ModulBesvarelseDataModel>getAllModulBesvarelse()
    {
        return this.lookupModulBesvarelseSessionBeanRemote().getAllModulBesvarelse();
    }
    
}
