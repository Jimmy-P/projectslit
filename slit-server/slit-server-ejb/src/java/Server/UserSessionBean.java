/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Database.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bevo
 */
@Stateless
public class UserSessionBean implements UserSessionBeanRemote {

    @PersistenceContext(unitName = "slit-server-ejbPU")
    private EntityManager em;

    @Override
    public String testMethod() {
        return "test";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public String getUserFromId(int id) {
        return em.find(Users.class, id).getName();
                
      
    }
    
}
