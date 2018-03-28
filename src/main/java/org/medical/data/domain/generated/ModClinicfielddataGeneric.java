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
import javax.persistence.JoinColumns;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_clinicfielddata")
public class ModClinicfielddataGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModClinicfielddataPK modClinicfielddataPK;
    @Column(name = "charvalue")
    private String charvalue;
    @Column(name = "datevalue")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datevalue;
    @JoinColumns({
        @JoinColumn(name = "clinicid", referencedColumnName = "clinicid", insertable = false, updatable = false)
        , @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private ModClinicfields modClinicfields;

    public ModClinicfielddataGeneric() {
    }

    public ModClinicfielddataGeneric(ModClinicfielddataPK modClinicfielddataPK) {
        this.modClinicfielddataPK = modClinicfielddataPK;
    }

    public ModClinicfielddataGeneric(int clinicid, int fieldid) {
        this.modClinicfielddataPK = new ModClinicfielddataPK(clinicid, fieldid);
    }

    public ModClinicfielddataPK getModClinicfielddataPK() {
        return modClinicfielddataPK;
    }

    public void setModClinicfielddataPK(ModClinicfielddataPK modClinicfielddataPK) {
        this.modClinicfielddataPK = modClinicfielddataPK;
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

    public ModClinicfields getModClinicfields() {
        return modClinicfields;
    }

    public void setModClinicfields(ModClinicfields modClinicfields) {
        this.modClinicfields = modClinicfields;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modClinicfielddataPK != null ? modClinicfielddataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModClinicfielddataGeneric)) {
            return false;
        }
        ModClinicfielddataGeneric other = (ModClinicfielddataGeneric) object;
        if ((this.modClinicfielddataPK == null && other.modClinicfielddataPK != null) || (this.modClinicfielddataPK != null && !this.modClinicfielddataPK.equals(other.modClinicfielddataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModClinicfielddata[ modClinicfielddataPK=" + modClinicfielddataPK + " ]";
    }
    
}
