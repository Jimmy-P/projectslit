/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slitclient;

import Framework.ModulManager;
import Server.ModulSessionBeanRemote;
import javax.ejb.EJB;


/**
 *
 * @author bevo
 */
public class Main {

    @EJB
    private static ModulSessionBeanRemote modulSessionBean;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModulManager mm = new ModulManager();
       
        System.out.println(mm.getModulName(1));
        System.out.println(mm.getModulDescr(2));
        System.out.println(mm.getModulAssignment(3));
    }
    
}
