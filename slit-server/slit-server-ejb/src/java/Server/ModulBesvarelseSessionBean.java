/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.ModulBesvarelseDataModel;
import DataModel.BrukerDataModel;
import DataModel.ModulDataModel;
import Database.Bruker;
import Database.Modul;
import Database.Modulbesvarelse;
import java.util.ArrayList;
import java.util.List;
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
 * @author Adam
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
    /*
    private ModulBesvarelseDataModel convertModulBesvarelse(Modulbesvarelse modulbesvarelse,
     Bruker bruker, Modul modul) 
    {
        
        //Bruker bruker = em.find(Bruker.class, modulbesvarelse.getBid());
        //Modul modul = em.find(Modul.class, modulbesvarelse.getMid());
      
        
        ModulBesvarelseDataModel modulBesvarelseDataModel = new ModulBesvarelseDataModel(); 
        
        modulBesvarelseDataModel.setMbId(modulbesvarelse.getMbID());
        modulBesvarelseDataModel.setMbTidspunkt(modulbesvarelse.getMbTidspunkt());
        modulBesvarelseDataModel.setMid(Modul.class, modul.setMID());
        modulBesvarelseDataModel.setBid(bruker.setBID());
        
        return modulBesvarelseDataModel; 
    }
    */
    
    
    
    
    /*
    private ModulBesvarelseDataModel convertModulBesvarelse(ModulbesvarelsePK modulbesvarelse) 
    {
        ModulBesvarelseDataModel modulBesvarelseDataModel = new ModulBesvarelseDataModel(); 
        
        modulBesvarelseDataModel.setMid(modulbesvarelse.getmid());
        modulBesvarelseDataModel.setMid(modulbesvarelse.getbid());
        
        return modulBesvarelseDataModel; 
    }
    
    */
    
    /**
     *
     * 
     * @return ModulBesvarelseData
     */
    
    /*
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
    
    */
    
    private Modulbesvarelse convertModulBesvarelseDataModel(ModulBesvarelseDataModel mbdm,
            BrukerDataModel bdm, ModulDataModel mdm)
    {
        
        Bruker bruker = em.find(Bruker.class, bdm.getbId());
        Modul modul = em.find(Modul.class, mdm.getmID());
        
        Modulbesvarelse modulbesvarelse = new Modulbesvarelse();
        
        modulbesvarelse.setMbID(mbdm.getMbId());
        modulbesvarelse.setMbTidspunkt(mbdm.getMbTidspunkt());
        modulbesvarelse.setBid(bruker);
        modulbesvarelse.setMid(modul);
        
        return modulbesvarelse;
        
    }
    
    @Override
    public void newModulBesvarelse(ModulBesvarelseDataModel mbdm, 
                         BrukerDataModel bdm, ModulDataModel mdm){
        
        Modulbesvarelse newMB = convertModulBesvarelseDataModel(mbdm, bdm, mdm);
 
        em.persist(newMB);
    }

    @Override
    public List<ModulBesvarelseDataModel> getAllModulBesvarelse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

