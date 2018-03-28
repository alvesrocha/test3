/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_applicationfielddata")
public class ModApplicationfielddataGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModApplicationfielddataPK modApplicationfielddataPK;
    @Column(name = "charvalue")
    private String charvalue;
    @Column(name = "datevalue")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datevalue;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModApplicationfields modApplicationfields;
    @JoinColumn(name = "userid", referencedColumnName = "userid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModUser modUser;

    public ModApplicationfielddataGeneric() {
    }

    public ModApplicationfielddataGeneric(ModApplicationfielddataPK modApplicationfielddataPK) {
        this.modApplicationfielddataPK = modApplicationfielddataPK;
    }

    public ModApplicationfielddataGeneric(int userid, int fieldid) {
        this.modApplicationfielddataPK = new ModApplicationfielddataPK(userid, fieldid);
    }

    public ModApplicationfielddataPK getModApplicationfielddataPK() {
        return modApplicationfielddataPK;
    }

    public void setModApplicationfielddataPK(ModApplicationfielddataPK modApplicationfielddataPK) {
        this.modApplicationfielddataPK = modApplicationfielddataPK;
    }

    public String getCharvalue() {
        return charvalue;
    }

    public void setCharvalue(String charvalue) {
        this.charvalue = charvalue;
    }

    public Date getDatevalue() {
        return datevalue;
    }

    public void setDatevalue(Date datevalue) {
        this.datevalue = datevalue;
    }

    public ModApplicationfields getModApplicationfields() {
        return modApplicationfields;
    }

    public void setModApplicationfields(ModApplicationfields modApplicationfields) {
        this.modApplicationfields = modApplicationfields;
    }

    public ModUser getModUser() {
        return modUser;
    }

    public void setModUser(ModUser modUser) {
        this.modUser = modUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modApplicationfielddataPK != null ? modApplicationfielddataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModApplicationfielddataGeneric)) {
            return false;
        }
        ModApplicationfielddataGeneric other = (ModApplicationfielddataGeneric) object;
        if ((this.modApplicationfielddataPK == null && other.modApplicationfielddataPK != null) || (this.modApplicationfielddataPK != null && !this.modApplicationfielddataPK.equals(other.modApplicationfielddataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModApplicationfielddata[ modApplicationfielddataPK=" + modApplicationfielddataPK + " ]";
    }
    
}
