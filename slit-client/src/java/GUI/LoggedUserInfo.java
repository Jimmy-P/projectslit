/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Framework.BrukerManager;

/**
 *
 * @author Jimmy
 */
public class LoggedUserInfo {

 String fname;
 String ename;
 int id;
 String epost;
 
 
LoggedUserInfo(String fname, String ename, int id)
{
    this.fname = fname;
    this.ename = ename;
    this.id = id;
    //this.epost = epost;
}

    public String getFname() {
        return fname;
    }

    public String getEname() {
        return ename;
    }

    public int getId() {
        return id;
    }

    
}
