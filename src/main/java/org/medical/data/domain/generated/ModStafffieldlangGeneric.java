/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.medical.data.domain.generated;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_stafffieldlang")
public class ModStafffieldlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModStafffieldlangPK modStafffieldlangPK;
    @Basic(optional = false)
    @Column(name = "fieldname")
    private String fieldname;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;
    @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModStafffields modStafffields;

    public ModStafffieldlangGeneric() {
    }

    public ModStafffieldlangGeneric(ModStafffieldlangPK modStafffieldlangPK) {
        this.modStafffieldlangPK = modStafffieldlangPK;
    }

    public ModStafffieldlangGeneric(ModStafffieldlangPK modStafffieldlangPK, String fieldname) {
        this.modStafffieldlangPK = modStafffieldlangPK;
        this.fieldname = fieldname;
    }

    public ModStafffieldlangGeneric(int fieldid, String langused) {
        this.modStafffieldlangPK = new ModStafffieldlangPK(fieldid, langused);
    }

    public ModStafffieldlangPK getModStafffieldlangPK() {
        return modStafffieldlangPK;
    }

    public void setModStafffieldlangPK(ModStafffieldlangPK modStafffieldlangPK) {
        this.modStafffieldlangPK = modStafffieldlangPK;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
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
        hash += (modStafffieldlangPK != null ? modStafffieldlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModStafffieldlangGeneric)) {
            return false;
        }
        ModStafffieldlangGeneric other = (ModStafffieldlangGeneric) object;
        if ((this.modStafffieldlangPK == null && other.modStafffieldlangPK != null) || (this.modStafffieldlangPK != null && !this.modStafffieldlangPK.equals(other.modStafffieldlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModStafffieldlang[ modStafffieldlangPK=" + modStafffieldlangPK + " ]";
    }
    
}
