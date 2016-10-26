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
 *
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
