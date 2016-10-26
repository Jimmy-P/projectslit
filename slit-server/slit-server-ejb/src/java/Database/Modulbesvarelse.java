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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author bevo
 */
@Entity
@Table(name = "Modulbesvarelse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Modulbesvarelse.findAll", query = "SELECT m FROM Modulbesvarelse m"),
    @NamedQuery(name = "Modulbesvarelse.findByMbId", query = "SELECT m FROM Modulbesvarelse m WHERE m.mbId = :mbId"),
    @NamedQuery(name = "Modulbesvarelse.findByMbTidspunkt", query = "SELECT m FROM Modulbesvarelse m WHERE m.mbTidspunkt = :mbTidspunkt")})
public class Modulbesvarelse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mb_id")
    private Integer mbId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mb_tidspunkt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mbTidspunkt;
    @OneToMany(mappedBy = "mbID")
    private Collection<Ressurs> ressursCollection;
    @JoinColumn(name = "m_ID", referencedColumnName = "m_ID")
    @ManyToOne(optional = false)
    private Modul mid;
    @JoinColumn(name = "b_ID", referencedColumnName = "b_id")
    @ManyToOne(optional = false)
    private Bruker bid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mbID")
    private Collection<Tilbakemelding> tilbakemeldingCollection;

    public Modulbesvarelse() {
    }

    public Modulbesvarelse(Integer mbId) {
        this.mbId = mbId;
    }

    public Modulbesvarelse(Integer mbId, Date mbTidspunkt) {
        this.mbId = mbId;
        this.mbTidspunkt = mbTidspunkt;
    }

    public Integer getMbId() {
        return mbId;
    }

    public void setMbId(Integer mbId) {
        this.mbId = mbId;
    }

    public Date getMbTidspunkt() {
        return mbTidspunkt;
    }

    public void setMbTidspunkt(Date mbTidspunkt) {
        this.mbTidspunkt = mbTidspunkt;
    }

    @XmlTransient
    public Collection<Ressurs> getRessursCollection() {
        return ressursCollection;
    }

    public void setRessursCollection(Collection<Ressurs> ressursCollection) {
        this.ressursCollection = ressursCollection;
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
    public Collection<Tilbakemelding> getTilbakemeldingCollection() {
        return tilbakemeldingCollection;
    }

    public void setTilbakemeldingCollection(Collection<Tilbakemelding> tilbakemeldingCollection) {
        this.tilbakemeldingCollection = tilbakemeldingCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mbId != null ? mbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modulbesvarelse)) {
            return false;
        }
        Modulbesvarelse other = (Modulbesvarelse) object;
        if ((this.mbId == null && other.mbId != null) || (this.mbId != null && !this.mbId.equals(other.mbId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Modulbesvarelse[ mbId=" + mbId + " ]";
    }
    
}
