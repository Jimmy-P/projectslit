/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.ModulBesvarelseDataModel;
import Database.ModulbesvarelsePK;
import Database.Modulbesvarelse;
import Database.Bruker;
import DataModel.BrukerDataModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Inneholder "business logic" til metoder som kjøres fra klienten via
 * et interface.
 * 
 * Da dette er en stateless session bean lagrer den ikke noe informasjonen
 * om modulbesvarelsene etter metodekallet er gjennomført.
 * @author bevo
 */
@Stateless
public class ModulBesvarelseSessionBean implements ModulBesvarelseSessionBeanRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @PersistenceContext(unitName = "slit-server-ejbPU")
    private EntityManager em;
    
    public void persist(Object object) {
        em.persist(object);
    }
    
    //@Override
    //public Date getModulBesvarelseTidspunktFromId(Date mb_id) {
      //  return em.find(Modulbesvarelse.class, mb_id).getMbTidspunkt();
                
      
    //}
    
    public ModulBesvarelseDataModel convertModulBesvarelse(Modulbesvarelse modulbesvarelse) 
    {
        ModulBesvarelseDataModel modulBesvarelseDataModel = new ModulBesvarelseDataModel(); 
        
        modulBesvarelseDataModel.setMbId(modulbesvarelse.getMbID());
        modulBesvarelseDataModel.setMbTidspunkt(modulbesvarelse.getMbTidspunkt());
        
        
        return modulBesvarelseDataModel; 
    }
    
    public ModulBesvarelseDataModel convertModulBesvarelse(ModulbesvarelsePK modulbesvarelse) 
    {
        ModulBesvarelseDataModel modulBesvarelseDataModel = new ModulBesvarelseDataModel(); 
        
        modulBesvarelseDataModel.setMid(modulbesvarelse.getmid());
        modulBesvarelseDataModel.setMid(modulbesvarelse.getmid());
        
        return modulBesvarelseDataModel; 
    }
    
    /**
     *
     * @return ModulBesvarelseData
     */
    @Override
    public List <ModulBesvarelseDataModel> getAllModulBesvarelse() {
        
        List<ModulBesvarelseDataModel> ModulBesvarelseData = new ArrayList <ModulBesvarelseDataModel> ();
        
        try
        {
            Query query = em.createNamedQuery("Modulbesvarelse.findAll", Modulbesvarelse.class);
            
            List<Modulbesvarelse> Modulbesvarelser = query.getResultList();
            
            for(Modulbesvarelse modulbesvarelse : Modulbesvarelser)
            {
                ModulBesvarelseData.add(this.convertModulBesvarelse(modulbesvarelse));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return ModulBesvarelseData;
    }

    
}

