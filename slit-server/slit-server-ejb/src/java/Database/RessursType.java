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
@Table(name = "RessursType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RessursType.findAll", query = "SELECT r FROM RessursType r"),
    @NamedQuery(name = "RessursType.findByRtID", query = "SELECT r FROM RessursType r WHERE r.rtID = :rtID"),
    @NamedQuery(name = "RessursType.findByRtTypenavn", query = "SELECT r FROM RessursType r WHERE r.rtTypenavn = :rtTypenavn")})
public class RessursType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "rt_ID")
    private Integer rtID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "rt_typenavn")
    private String rtTypenavn;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rtID")
    private Collection<Ressurs> ressursCollection;

    public RessursType() {
    }

    public RessursType(Integer rtID) {
        this.rtID = rtID;
    }

    public RessursType(Integer rtID, String rtTypenavn) {
        this.rtID = rtID;
        this.rtTypenavn = rtTypenavn;
    }

    public Integer getRtID() {
        return rtID;
    }

    public void setRtID(Integer rtID) {
        this.rtID = rtID;
    }

    public String getRtTypenavn() {
        return rtTypenavn;
    }

    public void setRtTypenavn(String rtTypenavn) {
        this.rtTypenavn = rtTypenavn;
    }

    @XmlTransient
    public Collection<Ressurs> getRessursCollection() {
        return ressursCollection;
    }

    public void setRessursCollection(Collection<Ressurs> ressursCollection) {
        this.ressursCollection = ressursCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rtID != null ? rtID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RessursType)) {
            return false;
        }
        RessursType other = (RessursType) object;
        if ((this.rtID == null && other.rtID != null) || (this.rtID != null && !this.rtID.equals(other.rtID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.RessursType[ rtID=" + rtID + " ]";
    }
    
}
