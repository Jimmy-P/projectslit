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
 *
 * @author Adam
 */
@Entity
@Table(name = "modul")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modul.findAll", query = "SELECT m FROM Modul m"),
    @NamedQuery(name = "Modul.findByMID", query = "SELECT m FROM Modul m WHERE m.mID = :mID"),
    @NamedQuery(name = "Modul.findByMNavn", query = "SELECT m FROM Modul m WHERE m.mNavn = :mNavn"),
    @NamedQuery(name = "Modul.findByMBeskrivelse", query = "SELECT m FROM Modul m WHERE m.mBeskrivelse = :mBeskrivelse"),
    @NamedQuery(name = "Modul.findByMOppgave", query = "SELECT m FROM Modul m WHERE m.mOppgave = :mOppgave")})
public class Modul implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "m_ID")
    private Integer mID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "m_navn")
    private String mNavn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "m_beskrivelse")
    private String mBeskrivelse;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "m_oppgave")
    private String mOppgave;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mid")
    private List<Tilbakemelding> tilbakemeldingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mid")
    private List<Modulbesvarelse> modulbesvarelseList;
    @OneToMany(mappedBy = "mid")
    private List<Ressurs> ressursList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mid")
    private List<Laringsmal> laringsmalList;

    public Modul() {
    }

    public Modul(Integer mID) {
        this.mID = mID;
    }

    public Modul(Integer mID, String mNavn, String mBeskrivelse, String mOppgave) {
        this.mID = mID;
        this.mNavn = mNavn;
        this.mBeskrivelse = mBeskrivelse;
        this.mOppgave = mOppgave;
    }

    public Integer getMID() {
        return mID;
    }

    public void setMID(Integer mID) {
        this.mID = mID;
    }

    public String getMNavn() {
        return mNavn;
    }

    public void setMNavn(String mNavn) {
        this.mNavn = mNavn;
    }

    public String getMBeskrivelse() {
        return mBeskrivelse;
    }

    public void setMBeskrivelse(String mBeskrivelse) {
        this.mBeskrivelse = mBeskrivelse;
    }

    public String getMOppgave() {
        return mOppgave;
    }

    public void setMOppgave(String mOppgave) {
        this.mOppgave = mOppgave;
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

    @XmlTransient
    public List<Ressurs> getRessursList() {
        return ressursList;
    }

    public void setRessursList(List<Ressurs> ressursList) {
        this.ressursList = ressursList;
    }

    @XmlTransient
    public List<Laringsmal> getLaringsmalList() {
        return laringsmalList;
    }

    public void setLaringsmalList(List<Laringsmal> laringsmalList) {
        this.laringsmalList = laringsmalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mID != null ? mID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modul)) {
            return false;
        }
        Modul other = (Modul) object;
        if ((this.mID == null && other.mID != null) || (this.mID != null && !this.mID.equals(other.mID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Modul[ mID=" + mID + " ]";
    }
    
}
