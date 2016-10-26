/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Database.Laringsmal;
import Database.Modul;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jimmy
 */
@Stateless
public class ModulSessionBean implements ModulSessionBeanRemote {
    
    @PersistenceContext(unitName = "slit-server-ejbPU")
    private EntityManager em;
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public String getModulName(int id) {
        return em.find(Modul.class, id).getMNavn();
    }
    @Override    
    public String getModulDescr(int id) {
        return em.find(Modul.class, id).getMBeskrivelse();
    }
    @Override
    public String getModulAssignment(int id){
        return em.find(Modul.class, id).getMOppgave();
    }
    
    
    
}
