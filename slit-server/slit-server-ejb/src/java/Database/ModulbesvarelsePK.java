/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * Denne klassen sender spørringer mot databasen vår (MySQL) ved hjelp av
 * connectorJ som oversetter spørringen vi sender i Java/JDBC 
 * (fra Payaraserveren) til MySQL. Det brukes også motsatt vei til å
 * oversette fra MySQL til JDBC slik at klassen kan motta informasjon
 * i respons av spørringene.
 * 
 * Mesteparten av klassen er autogenerert ved hjelp av ConnectorJ og Payara ved 
 * bruk av en connection pool til å lese tabellene i databasen vår.
 * @author Dahl
 */
@Embeddable
public class ModulbesvarelsePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "b_ID")
    private int bid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "m_ID")
    private int mid;

    public ModulbesvarelsePK() {
    }

    public ModulbesvarelsePK(int bid, int mid) {
        this.bid = bid;
        this.mid = mid;
    }

    public int getbid() {
        return bid;
    }

    public void setbid(int bid) {
        this.bid = bid;
    }

    public int getmid() {
        return mid;
    }

    public void setmid(int mid) {
        this.mid = mid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) bid;
        hash += (int) mid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModulbesvarelsePK)) {
            return false;
        }
        ModulbesvarelsePK other = (ModulbesvarelsePK) object;
        if (this.bid != other.bid) {
            return false;
        }
        if (this.mid != other.mid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.ModuleDeliveryPK[ userId=" + bid + ", moduleId=" + mid + " ]";
    }
    
}
