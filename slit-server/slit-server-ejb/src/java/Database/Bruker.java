/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Denne klassen sender spørringer mot databasen vår (MySQL) ved hjelp av
 * connectorJ som oversetter spørringen vi sender i Java/JDBC 
 * (fra Payaraserveren) til MySQL. Det brukes også motsatt vei til å
 * oversette fra MySQL til JDBC slik at klassen kan motta informasjon
 * i respons av spørringene.
 *
 * Mesteparten av klassen er autogenerert ved hjelp av ConnectorJ og Payara ved 
 * bruk av en connection pool til å lese tabellene i databasen vår.
 * 
 * @author bevo
 * @author Adam
 */
@Entity
@Table(name = "bruker")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bruker.findAll", query = "SELECT b FROM Bruker b"),
    @NamedQuery(name = "Bruker.findByBID", query = "SELECT b FROM Bruker b WHERE b.bID = :bID"),
    @NamedQuery(name = "Bruker.findByBFnavn", query = "SELECT b FROM Bruker b WHERE b.bFnavn = :bFnavn"),
    @NamedQuery(name = "Bruker.findByBEnavn", query = "SELECT b FROM Bruker b WHERE b.bEnavn = :bEnavn"),
    @NamedQuery(name = "Bruker.findByBEmail", query = "SELECT b FROM Bruker b WHERE b.bEmail = :bEmail"),
    @NamedQuery(name = "Bruker.findByBPassord", query = "SELECT b FROM Bruker b WHERE b.bPassord = :bPassord"),
    @NamedQuery(name = "Bruker.findByBType", query = "SELECT b FROM Bruker b WHERE b.bType = :bType"),
    @NamedQuery(name = "Bruker.brukerLogin", query = "SELECT b FROM Bruker b WHERE b.bEmail = :bEmail AND b.bPassord = :bPassord")})
public class Bruker implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "b_ID")
    private Integer bID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "b_fnavn")
    private String bFnavn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "b_enavn")
    private String bEnavn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "b_email")
    private String bEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "b_passord")
    private String bPassord;
    @Basic(optional = false)
    @NotNull
    @Column(name = "b_type")
    private int bType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bid")
    private List<Tilbakemelding> tilbakemeldingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bid")
    private List<Modulbesvarelse> modulbesvarelseList;

    public Bruker() {
    }

    public Bruker(Integer bID) {
        this.bID = bID;
    }

    public Bruker(Integer bID, String bFnavn, String bEnavn, String bEmail, String bPassord, int bType) {
        this.bID = bID;
        this.bFnavn = bFnavn;
        this.bEnavn = bEnavn;
        this.bEmail = bEmail;
        this.bPassord = bPassord;
        this.bType = bType;
    }

    public Integer getBID() {
        return bID;
    }

    public void setBID(Integer bID) {
        this.bID = bID;
    }

    public String getBFnavn() {
        return bFnavn;
    }

    public void setBFnavn(String bFnavn) {
        this.bFnavn = bFnavn;
    }

    public String getBEnavn() {
        return bEnavn;
    }

    public void setBEnavn(String bEnavn) {
        this.bEnavn = bEnavn;
    }

    public String getBEmail() {
        return bEmail;
    }

    public void setBEmail(String bEmail) {
        this.bEmail = bEmail;
    }

    public String getBPassord() {
        return bPassord;
    }

    public void setBPassord(String bPassord) {
        this.bPassord = bPassord;
    }

    public int getBType() {
        return bType;
    }

    public void setBType(int bType) {
        this.bType = bType;
    }

    @XmlTransient
    public List<Tilbakemelding> getTilbakemeldingList() {
        return tilbakemeldingList;
    }

    public void setTilbakemeldingList(List<Tilbakemelding> tilbakemeldingList) {
        this.tilbakemeldingList = tilbakemeldingList;
    }

    @XmlTransient
    public List<Modulbesvarelse> getModulbesvarelseList() {
        return modulbesvarelseList;
    }

    public void setModulbesvarelseList(List<Modulbesvarelse> modulbesvarelseList) {
        this.modulbesvarelseList = modulbesvarelseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bID != null ? bID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bruker)) {
            return false;
        }
        Bruker other = (Bruker) object;
        if ((this.bID == null && other.bID != null) || (this.bID != null && !this.bID.equals(other.bID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Bruker[ bID=" + bID + " ]";
    }
    
}
