/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Jimmy
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
    private Collection<Modulbesvarelse> modulbesvarelseCollection;
    @OneToMany(mappedBy = "mid")
    private Collection<Ressurs> ressursCollection;
    @JoinColumn(name = "l_ID", referencedColumnName = "l_ID")
    @ManyToOne(optional = false)
    private Laringsmal lid;

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
    public Collection<Modulbesvarelse> getModulbesvarelseCollection() {
        return modulbesvarelseCollection;
    }

    public void setModulbesvarelseCollection(Collection<Modulbesvarelse> modulbesvarelseCollection) {
        this.modulbesvarelseCollection = modulbesvarelseCollection;
    }

    @XmlTransient
    public Collection<Ressurs> getRessursCollection() {
        return ressursCollection;
    }

    public void setRessursCollection(Collection<Ressurs> ressursCollection) {
        this.ressursCollection = ressursCollection;
    }

    public Laringsmal getLid() {
        return lid;
    }

    public void setLid(Laringsmal lid) {
        this.lid = lid;
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
