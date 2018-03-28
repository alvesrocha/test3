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
@Table(name = "mod_stafffielddata")
public class ModStafffielddataGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModStafffielddataPK modStafffielddataPK;
    @Column(name = "charvalue")
    private String charvalue;
    @Column(name = "datevalue")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datevalue;
    @JoinColumn(name = "staffid", referencedColumnName = "staffid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModStaff modStaff;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModStafffields modStafffields;

    public ModStafffielddataGeneric() {
    }

    public ModStafffielddataGeneric(ModStafffielddataPK modStafffielddataPK) {
        this.modStafffielddataPK = modStafffielddataPK;
    }

    public ModStafffielddataGeneric(int staffid, int fieldid) {
        this.modStafffielddataPK = new ModStafffielddataPK(staffid, fieldid);
    }

    public ModStafffielddataPK getModStafffielddataPK() {
        return modStafffielddataPK;
    }

    public void setModStafffielddataPK(ModStafffielddataPK modStafffielddataPK) {
        this.modStafffielddataPK = modStafffielddataPK;
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

    public ModStaff getModStaff() {
        return modStaff;
    }

    public void setModStaff(ModStaff modStaff) {
        this.modStaff = modStaff;
    }

    public ModStafffields getModStafffields() {
        return modStafffields;
    }

    public void setModStafffields(ModStafffields modStafffields) {
        this.modStafffields = modStafffields;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modStafffielddataPK != null ? modStafffielddataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModStafffielddataGeneric)) {
            return false;
        }
        ModStafffielddataGeneric other = (ModStafffielddataGeneric) object;
        if ((this.modStafffielddataPK == null && other.modStafffielddataPK != null) || (this.modStafffielddataPK != null && !this.modStafffielddataPK.equals(other.modStafffielddataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModStafffielddata[ modStafffielddataPK=" + modStafffielddataPK + " ]";
    }
    
}
