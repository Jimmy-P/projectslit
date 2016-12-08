/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adam
 */
@Entity
@Table(name = "ressurs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ressurs.findAll", query = "SELECT r FROM Ressurs r"),
    @NamedQuery(name = "Ressurs.findByRID", query = "SELECT r FROM Ressurs r WHERE r.rID = :rID"),
    @NamedQuery(name = "Ressurs.findByRTekst", query = "SELECT r FROM Ressurs r WHERE r.rTekst = :rTekst")})
public class Ressurs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "r_ID")
    private Integer rID;
    @Size(max = 1000)
    @Column(name = "r_tekst")
    private String rTekst;
    @Lob
    @Column(name = "r_fil")
    private byte[] rFil;
    @JoinColumn(name = "m_ID", referencedColumnName = "m_ID")
    @ManyToOne
    private Modul mid;
    @JoinColumn(name = "mb_ID", referencedColumnName = "mb_ID")
    @ManyToOne
    private Modulbesvarelse mbID;
    @JoinColumn(name = "rt_ID", referencedColumnName = "rt_ID")
    @ManyToOne(optional = false)
    private Ressurstype rtID;

    public Ressurs() {
    }

    public Ressurs(Integer rID) {
        this.rID = rID;
    }

    public Integer getRID() {
        return rID;
    }

    public void setRID(Integer rID) {
        this.rID = rID;
    }

    public String getRTekst() {
        return rTekst;
    }

    public void setRTekst(String rTekst) {
        this.rTekst = rTekst;
    }

    public byte[] getRFil() {
        return rFil;
    }

    public void setRFil(byte[] rFil) {
        this.rFil = rFil;
    }

    public Modul getMid() {
        return mid;
    }

    public void setMid(Modul mid) {
        this.mid = mid;
    }

    public Modulbesvarelse getMbID() {
        return mbID;
    }

    public void setMbID(Modulbesvarelse mbID) {
        this.mbID = mbID;
    }

    public Ressurstype getRtID() {
        return rtID;
    }

    public void setRtID(Ressurstype rtID) {
        this.rtID = rtID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rID != null ? rID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ressurs)) {
            return false;
        }
        Ressurs other = (Ressurs) object;
        if ((this.rID == null && other.rID != null) || (this.rID != null && !this.rID.equals(other.rID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Database.Ressurs[ rID=" + rID + " ]";
    }
    
}
