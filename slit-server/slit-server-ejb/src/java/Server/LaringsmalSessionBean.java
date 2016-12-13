/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import DataModel.LaringsmalDataModel;
import DataModel.ModulDataModel;
import Database.Laringsmal;
import Database.Modul;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * * Inneholder "business logic" til metoder som kjres fra klienten via
 * et interface.
 * 
 * Da dette er en stateless session bean lagrer den ikke noe informasjonen
 * om lringsmlene etter metodekallet er gjennomfrt.
 * @author bevo
 */
@Stateless
public class LaringsmalSessionBean implements LaringsmalSessionBeanRemote {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext(unitName = "slit-server-ejbPU")
    private EntityManager em;
    
    public void persist(Object object) {
        em.persist(object);
    }
    
    @Override
    public String getLaringsmalFromId(int l_ID) {
        return em.find(Laringsmal.class, l_ID).getLTekst();
                
      
    }
    
    private Laringsmal convertLaringsmal(LaringsmalDataModel ldm, ModulDataModel mdm)
    {
        Modul modul = em.find(Modul.class, mdm.getmID());
        
        Laringsmal laringsmal = new Laringsmal();
        
        laringsmal.setLID(ldm.getLID());
        laringsmal.setLTekst(ldm.getLtekst());
        laringsmal.setMid(modul);
        
        return laringsmal;
        
    }
    
            
    
    @Override
    public void setLaringsMal(LaringsmalDataModel ldm, ModulDataModel mdm)
    {
        
        Laringsmal setLM = convertLaringsmal(ldm, mdm);
        em.merge(setLM);
        
       
    }
}
