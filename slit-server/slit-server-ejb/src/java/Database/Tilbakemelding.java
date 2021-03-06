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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adam
 */
@Entity
@Table(name = "tilbakemelding")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tilbakemelding.findAll", query = "SELECT t FROM Tilbakemelding t"),
    @NamedQuery(name = "Tilbakemelding.findByTmID", query = "SELECT t FROM Tilbakemelding t WHERE t.tmID = :tmID"),
    @NamedQuery(name = "Tilbakemelding.findByTmGodkjentstatus", query = "SELECT t FROM Tilbakemelding t WHERE t.tmGodkjentstatus = :tmGodkjentstatus"),
    @NamedQuery(name = "Tilbakemelding.findByTmDato", query = "SELECT t FROM Tilbakemelding t WHERE t.tmDato = :tmDato"),
    @NamedQuery(name = "Tilbakemelding.findByTmStudentkommentar", query = "SELECT t FROM Tilbakemelding t WHERE t.tmStudentkommentar = :tmStudentkommentar"),
    @NamedQuery(name = "Tilbakemelding.findByTmLarerkommentar", query = "SELECT t FROM Tilbakemelding t WHERE t.tmLarerkommentar = :tmLarerkommentar")})
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
    @JoinColumn(name = "m_ID", referencedColumnName = "m_ID")
    @ManyToOne(optional = false)
    private Modul mid;
    @JoinColumn(name = "b_ID", referencedColumnName = "b_ID")
    @ManyToOne(optional = false)
    private Bruker bid;

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
        return "Database.Tilbakemelding[ tmID=" + tmID + " ]";
    }
    
}
