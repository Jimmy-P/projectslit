/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.ModulBesvarelseDataModel;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author bevo
 */
@Remote
public interface ModulBesvarelseSessionBeanRemote {
    
    //String getModulBesvarelseTidspunktFromId(int mb_id);
    
    /**
     *
     * @return modulbesvarelsedata
     */
    List <ModulBesvarelseDataModel> getAllModulBesvarelse();   
    
}
