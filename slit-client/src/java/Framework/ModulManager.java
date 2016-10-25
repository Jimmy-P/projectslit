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
 *
 * @author bevo
 */
public class ModulManager {

    private ModulSessionBeanRemote lookupModulSessionBeanRemote() {
        try {
            Context c = new InitialContext();
            return (ModulSessionBeanRemote) c.lookup("java:comp/env/ModulSessionBean");
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
