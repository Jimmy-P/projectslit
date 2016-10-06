/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slitclient;

import Server.UserSessionBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author bevo
 */
public class Main {

    @EJB
    private static UserSessionBeanRemote userSessionBean;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(userSessionBean.getUserFromId(1));
    }
    
}
