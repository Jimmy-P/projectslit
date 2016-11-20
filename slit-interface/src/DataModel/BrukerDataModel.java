/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

/**
 * Denne klassen behandler objekter av brukerklassen som sendes frem og tilbake
 * mellom klienten og serveren. Dette muliggjøres ved bruk av POJO objekter.
 * Disse objektene behøver ikke en referanse til klassen den kommer fra
 * og kan derfor lettere hentes og benyttes mellom en klient og en server.
 * @author Adam
 */


public class BrukerDataModel implements java.io.Serializable {
   
  
   private int bId;
   private String bFnavn;
   private String bEnavn;
   private String bEmail;
   private String bPassord;
   private int bType;
   
    /**
     * Returner brukerens ID (Primærnøkkel)
     * @return bId
     */
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

