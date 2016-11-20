/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.ejb.Remote;

/**
 * Denne klassen er et interface som bestemmer hvilke metoder med gitte 
 * paramatere som kan kalles fra klienten.
 * @author Jimmy
 */
@Remote
public interface ModulSessionBeanRemote {

    String getModulName(int id);
    String getModulDescr(int id);
    String getModulAssignment(int id);
    
    
    
}
