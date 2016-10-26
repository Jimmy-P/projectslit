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
 * @author bevo
 */
@Entity
@Table(name = "Laringsmal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Laringsmal.findAll", query = "SELECT l FROM Laringsmal l"),
    @NamedQuery(name = "Laringsmal.findByLID", query = "SELECT l FROM Laringsmal l WHERE l.lID = :lID"),
    @NamedQuery(name = "Laringsmal.findByLTekst", query = "SELECT l FROM Laringsmal l WHERE l.lTekst = :lTekst")})
public class Laringsmal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "l_ID")
    private Integer lID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "l_tekst")
    private String lTekst;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lid")
    private Collection<Modul> modulCollection;

    public Laringsmal() {
    }

    public Laringsmal(Integer lID) {
        this.lID = lID;
    }

    public Laringsmal(Integer lID, String lTekst) {
        this.lID = lID;
        this.lTekst = lTekst;
    }

    public Integer getLID() {
        return lID;
    }

    public void setLID(Integer lID) {
        this.lID = lID;
    }

    public String getLTekst() {
        return lTekst;
    }

    public void setLTekst(String lTekst) {
        this.lTekst = lTekst;
    }

    @XmlTransient
    public Collection<Modul> getModulCollection() {
        return modulCollection;
    }

    public void setModulCollection(Collection<Modul> modulCollection) {
        this.modulCollection = modulCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lID != null ? lID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laringsmal)) {
            return false;
        }
        Laringsmal other = (Laringsmal) object;
        if ((this.lID == null && other.lID != null) || (this.lID != null && !this.lID.equals(other.lID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Laringsmal[ lID=" + lID + " ]";
    }
    
}
