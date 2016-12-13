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
 * @author bevo
 */
@Remote
public interface LaringsmalSessionBeanRemote {
    
    String getLaringsmalFromId(int l_ID);
    void setLaringsMal(int l_ID, String string);
    
}
