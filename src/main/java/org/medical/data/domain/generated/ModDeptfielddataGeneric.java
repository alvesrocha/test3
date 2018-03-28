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
@Table(name = "mod_deptfielddata")
public class ModDeptfielddataGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModDeptfielddataPK modDeptfielddataPK;
    @Column(name = "charvalue")
    private String charvalue;
    @Column(name = "datevalue")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datevalue;
    @JoinColumns({
        @JoinColumn(name = "deptid", referencedColumnName = "deptid", insertable = false, updatable = false)
        , @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)})
    @OneToOne(optional = false)
    private ModDeptfields modDeptfields;

    public ModDeptfielddataGeneric() {
    }

    public ModDeptfielddataGeneric(ModDeptfielddataPK modDeptfielddataPK) {
        this.modDeptfielddataPK = modDeptfielddataPK;
    }

    public ModDeptfielddataGeneric(int deptid, int fieldid) {
        this.modDeptfielddataPK = new ModDeptfielddataPK(deptid, fieldid);
    }

    public ModDeptfielddataPK getModDeptfielddataPK() {
        return modDeptfielddataPK;
    }

    public void setModDeptfielddataPK(ModDeptfielddataPK modDeptfielddataPK) {
        this.modDeptfielddataPK = modDeptfielddataPK;
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

    public ModDeptfields getModDeptfields() {
        return modDeptfields;
    }

    public void setModDeptfields(ModDeptfields modDeptfields) {
        this.modDeptfields = modDeptfields;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modDeptfielddataPK != null ? modDeptfielddataPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDeptfielddataGeneric)) {
            return false;
        }
        ModDeptfielddataGeneric other = (ModDeptfielddataGeneric) object;
        if ((this.modDeptfielddataPK == null && other.modDeptfielddataPK != null) || (this.modDeptfielddataPK != null && !this.modDeptfielddataPK.equals(other.modDeptfielddataPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDeptfielddata[ modDeptfielddataPK=" + modDeptfielddataPK + " ]";
    }
    
}
