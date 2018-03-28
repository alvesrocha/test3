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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import org.medical.data.domain.source.*;

/**
 *
 * @author alvesdarocha
 */
@MappedSuperclass
@Table(name = "mod_deptfieldlang")
public class ModDeptfieldlangGeneric implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ModDeptfieldlangPK modDeptfieldlangPK;
    @Basic(optional = false)
    @Column(name = "fieldname")
    private String fieldname;
    @JoinColumns({
        @JoinColumn(name = "deptid", referencedColumnName = "deptid", insertable = false, updatable = false)
        , @JoinColumn(name = "fieldid", referencedColumnName = "fieldid", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ModDeptfields modDeptfields;
    @JoinColumn(name = "langused", referencedColumnName = "langid", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ModLang modLang;

    public ModDeptfieldlangGeneric() {
    }

    public ModDeptfieldlangGeneric(ModDeptfieldlangPK modDeptfieldlangPK) {
        this.modDeptfieldlangPK = modDeptfieldlangPK;
    }

    public ModDeptfieldlangGeneric(ModDeptfieldlangPK modDeptfieldlangPK, String fieldname) {
        this.modDeptfieldlangPK = modDeptfieldlangPK;
        this.fieldname = fieldname;
    }

    public ModDeptfieldlangGeneric(int deptid, int fieldid, String langused) {
        this.modDeptfieldlangPK = new ModDeptfieldlangPK(deptid, fieldid, langused);
    }

    public ModDeptfieldlangPK getModDeptfieldlangPK() {
        return modDeptfieldlangPK;
    }

    public void setModDeptfieldlangPK(ModDeptfieldlangPK modDeptfieldlangPK) {
        this.modDeptfieldlangPK = modDeptfieldlangPK;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public ModDeptfields getModDeptfields() {
        return modDeptfields;
    }

    public void setModDeptfields(ModDeptfields modDeptfields) {
        this.modDeptfields = modDeptfields;
    }

    public ModLang getModLang() {
        return modLang;
    }

    public void setModLang(ModLang modLang) {
        this.modLang = modLang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modDeptfieldlangPK != null ? modDeptfieldlangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModDeptfieldlangGeneric)) {
            return false;
        }
        ModDeptfieldlangGeneric other = (ModDeptfieldlangGeneric) object;
        if ((this.modDeptfieldlangPK == null && other.modDeptfieldlangPK != null) || (this.modDeptfieldlangPK != null && !this.modDeptfieldlangPK.equals(other.modDeptfieldlangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "test.ModDeptfieldlang[ modDeptfieldlangPK=" + modDeptfieldlangPK + " ]";
    }
    
}
