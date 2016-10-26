/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Database.Bruker;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Adam
 */
@Stateless
public class BrukerSessionBean implements BrukerSessionBeanRemote {
    
    @PersistenceContext(unitName = "slit-server-ejbPU")
    private EntityManager em;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public void persist(Object object) {
        em.persist(object);
    }  

    @Override
    public String getBrukerFNavnFromId(int bId) {
        return em.find(Bruker.class, bId).getBFnavn();
    }
    

    @Override
    public String getBrukerENavnFromId(int bId) {
        return em.find(Bruker.class, bId).getBEnavn();
    }

    @Override
    public String getBrukerEmailFromId(int bId) {
        return em.find(Bruker.class, bId).getBEmail();
    }

    @Override
    public String getBrukerPassordFromId(int bId) {
        return em.find(Bruker.class, bId).getBPassord();
    }

    @Override
    public int getBrukerTypeFromId(int bId) {
        return em.find(Bruker.class, bId).getBType();
    }

}
