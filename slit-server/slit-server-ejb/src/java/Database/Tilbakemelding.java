/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Denne klassen sender spørringer mot databasen vår (MySQL) ved hjelp av
 * connectorJ som oversetter spørringen vi sender i Java/JPQL 
 * (fra Payaraserveren) til MySQL. Det brukes også motsatt vei til å
 * oversette fra MySQL til JPQL slik at klassen kan motta informasjon
 * i respons av spørringene.
 * 
 * Mesteparten av klassen er autogenerert ved hjelp av ConnectorJ og Payara ved 
 * bruk av en connection pool til å lese tabellene i databasen vår.
 * @author Adam
 */
@Entity
@Table(name = "tilbakemelding")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tilbakemelding_1.findAll", query = "SELECT t FROM Tilbakemelding_1 t"),
    @NamedQuery(name = "Tilbakemelding_1.findByTmID", query = "SELECT t FROM Tilbakemelding_1 t WHERE t.tmID = :tmID"),
    @NamedQuery(name = "Tilbakemelding_1.findByTmGodkjentstatus", query = "SELECT t FROM Tilbakemelding_1 t WHERE t.tmGodkjentstatus = :tmGodkjentstatus"),
    @NamedQuery(name = "Tilbakemelding_1.findByTmDato", query = "SELECT t FROM Tilbakemelding_1 t WHERE t.tmDato = :tmDato"),
    @NamedQuery(name = "Tilbakemelding_1.findByTmStudentkommentar", query = "SELECT t FROM Tilbakemelding_1 t WHERE t.tmStudentkommentar = :tmStudentkommentar"),
    @NamedQuery(name = "Tilbakemelding_1.findByTmLarerkommentar", query = "SELECT t FROM Tilbakemelding_1 t WHERE t.tmLarerkommentar = :tmLarerkommentar")})
public class Tilbakemelding implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tm_ID")
    private Integer tmID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tm_godkjentstatus")
    private short tmGodkjentstatus;
    @Column(name = "tm_dato")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmDato;
    @Size(max = 1000)
    @Column(name = "tm_studentkommentar")
    private String tmStudentkommentar;
    @Size(max = 1000)
    @Column(name = "tm_larerkommentar")
    private String tmLarerkommentar;

    public Tilbakemelding() {
    }

    public Tilbakemelding(Integer tmID) {
        this.tmID = tmID;
    }

    public Tilbakemelding(Integer tmID, short tmGodkjentstatus) {
        this.tmID = tmID;
        this.tmGodkjentstatus = tmGodkjentstatus;
    }

    public Integer getTmID() {
        return tmID;
    }

    public void setTmID(Integer tmID) {
        this.tmID = tmID;
    }

    public short getTmGodkjentstatus() {
        return tmGodkjentstatus;
    }

    public void setTmGodkjentstatus(short tmGodkjentstatus) {
        this.tmGodkjentstatus = tmGodkjentstatus;
    }

    public Date getTmDato() {
        return tmDato;
    }

    public void setTmDato(Date tmDato) {
        this.tmDato = tmDato;
    }

    public String getTmStudentkommentar() {
        return tmStudentkommentar;
    }

    public void setTmStudentkommentar(String tmStudentkommentar) {
        this.tmStudentkommentar = tmStudentkommentar;
    }

    public String getTmLarerkommentar() {
        return tmLarerkommentar;
    }

    public void setTmLarerkommentar(String tmLarerkommentar) {
        this.tmLarerkommentar = tmLarerkommentar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tmID != null ? tmID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tilbakemelding)) {
            return false;
        }
        Tilbakemelding other = (Tilbakemelding) object;
        if ((this.tmID == null && other.tmID != null) || (this.tmID != null && !this.tmID.equals(other.tmID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Tilbakemelding_1[ tmID=" + tmID + " ]";
    }
    
}
