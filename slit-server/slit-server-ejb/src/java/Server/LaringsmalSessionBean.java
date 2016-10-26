/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Database.Laringsmal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
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
}
