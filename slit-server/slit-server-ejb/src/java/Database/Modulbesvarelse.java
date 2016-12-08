/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Adam
 */
@Entity
@Table(name = "modulbesvarelse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modulbesvarelse.findAll", query = "SELECT m FROM Modulbesvarelse m"),
    @NamedQuery(name = "Modulbesvarelse.findByMbID", query = "SELECT m FROM Modulbesvarelse m WHERE m.mbID = :mbID"),
    @NamedQuery(name = "Modulbesvarelse.findByMbTidspunkt", query = "SELECT m FROM Modulbesvarelse m WHERE m.mbTidspunkt = :mbTidspunkt")})
public class Modulbesvarelse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mb_ID")
    private Integer mbID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mb_tidspunkt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mbTidspunkt;
    @JoinColumn(name = "m_ID", referencedColumnName = "m_ID")
    @ManyToOne(optional = false)
    private Modul mid;
    @JoinColumn(name = "b_ID", referencedColumnName = "b_ID")
    @ManyToOne(optional = false)
    private Bruker bid;
    @OneToMany(mappedBy = "mbID")
    private Collection<Ressurs> ressursCollection;

    public Modulbesvarelse() {
    }

    public Modulbesvarelse(Integer mbID) {
        this.mbID = mbID;
    }

    public Modulbesvarelse(Integer mbID, Date mbTidspunkt) {
        this.mbID = mbID;
        this.mbTidspunkt = mbTidspunkt;
    }

    public Integer getMbID() {
        return mbID;
    }

    public void setMbID(Integer mbID) {
        this.mbID = mbID;
    }

    public Date getMbTidspunkt() {
        return mbTidspunkt;
    }

    public void setMbTidspunkt(Date mbTidspunkt) {
        this.mbTidspunkt = mbTidspunkt;
    }

    public Modul getMid() {
        return mid;
    }

    public void setMid(Modul mid) {
        this.mid = mid;
    }

    public Bruker getBid() {
        return bid;
    }

    public void setBid(Bruker bid) {
        this.bid = bid;
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
        hash += (mbID != null ? mbID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modulbesvarelse)) {
            return false;
        }
        Modulbesvarelse other = (Modulbesvarelse) object;
        if ((this.mbID == null && other.mbID != null) || (this.mbID != null && !this.mbID.equals(other.mbID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Modulbesvarelse[ mbID=" + mbID + " ]";
    }
    
}
