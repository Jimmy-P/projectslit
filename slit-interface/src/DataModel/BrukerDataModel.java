/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

/**
 *
 * @author Adam
 */
public class BrukerDataModel implements java.io.Serializable {
   private int bId;
   private String bFnavn;
   private String bEnavn;
   private String bEmail;
   private String bPassord;
   private int bType;
   

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbFnavn() {
        return bFnavn;
    }

    public void setbFnavn(String bFnavn) {
        this.bFnavn = bFnavn;
    }

    public String getbEnavn() {
        return bEnavn;
    }

    public void setbEnavn(String bEnavn) {
        this.bEnavn = bEnavn;
    }

    public String getbEmail() {
        return bEmail;
    }

    public void setbEmail(String bEmail) {
        this.bEmail = bEmail;
    }

    public String getbPassord() {
        return bPassord;
    }

    public void setbPassord(String bPassord) {
        this.bPassord = bPassord;
    }

    public int getbType() {
        return bType;
    }

    public void setbType(int bType) {
        this.bType = bType;
    }
}

