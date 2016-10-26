/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import javax.ejb.Remote;

/**
 *
 * @author Adam
 */
@Remote
public interface BrukerSessionBeanRemote {
    
    String getBrukerFNavnFromId(int bId);
    
    String getBrukerENavnFromId(int bId);
    
    String getBrukerEmailFromId(int bId);
    
    String getBrukerPassordFromId(int bId);
    
    int getBrukerTypeFromId(int bId);
}
