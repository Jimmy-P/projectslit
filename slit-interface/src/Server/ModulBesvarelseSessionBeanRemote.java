/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.BrukerDataModel;
import DataModel.ModulBesvarelseDataModel;
import DataModel.ModulDataModel;
import java.util.List;
import javax.ejb.Remote;

/**
 * Denne klassen er et interface som bestemmer hvilke metoder med gitte 
 * paramatere som kan kalles fra klienten.
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

    public void newModulBesvarelse(ModulBesvarelseDataModel mbdm, 
                                                BrukerDataModel bdm,
                                                ModulDataModel mdm);
    
    
}
